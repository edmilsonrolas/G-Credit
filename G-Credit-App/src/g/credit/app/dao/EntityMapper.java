/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g.credit.app.dao;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Classe utilitária para mapear ResultSet para objetos de entidade.
 * 
 * @author rolas
 */
public class EntityMapper {
    /**
     * Converte um ResultSet em um objeto do tipo especificado.
     *
     * @param resultSet   O ResultSet contendo os dados a serem convertidos.
     * @param entityClass A classe da entidade de destino.
     * @param <T>         O tipo da classe de destino.
     * @return Um objeto do tipo especificado com os dados do ResultSet.
     * @throws SQLException Se ocorrer um erro ao acessar os dados do ResultSet.
     */
    public static <T> T mapResultSetToEntity(ResultSet resultSet, Class<T> entityClass) throws SQLException {
        try {
            T entity = entityClass.getDeclaredConstructor().newInstance();

            for (Field field : entityClass.getDeclaredFields()) {
                field.setAccessible(true);  // Permite acessar campos privados.

                String columnName = toSnakeCase(field.getName());  // Assume que nomes de campos são em camelCase.
                Object value = resultSet.getObject(columnName);

                if (value != null) {
                    field.set(entity, value);
                }
            }

            return entity;
        } catch (SQLException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new SQLException("Erro ao mapear ResultSet para " + entityClass.getSimpleName() + ".", e);
        }
    }

    // Converte camelCase para snake_case.
    private static String toSnakeCase(String input) {
        return input.replaceAll("([a-z])([A-Z])", "$1_$2").toLowerCase();
    }
}

