package com.xado.Todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component("todoDao"
)
public class TodoDaoImpl implements  TodoDao {
    private SimpleJdbcInsert insertMP3;
    private NamedParameterJdbcTemplate jdbcTemplate;
    private DataSource dataSource;

    @Autowired
    public void setDataSource(DataSource dataSource){
        this.dataSource=dataSource;
        this.jdbcTemplate=new NamedParameterJdbcTemplate(dataSource);
        this.insertMP3=new SimpleJdbcInsert(dataSource).withTableName("todolist").usingColumns("title");
    }
    public void add(Todo todo) {
        MapSqlParameterSource params=new MapSqlParameterSource();
        params.addValue("title",todo.getTitle());
        insertMP3.execute(params);
    }

    public void delete(Todo todo) {

    }

    public void delete(int id) {
        String sql="delete  from todolist where id=:id";
        MapSqlParameterSource params=new MapSqlParameterSource();
        params.addValue("id",id);
        jdbcTemplate.update(sql,params);
    }

    public List<Todo> getAll() {
        List<Todo> allTodo = jdbcTemplate.query("SELECT * FROM todolist",new TodoRowMapper());

        return allTodo;
    }


    private static final class TodoRowMapper implements RowMapper<Todo> {

        public Todo mapRow(ResultSet resultSet, int i) throws SQLException {
            Todo todo = new Todo();
            todo.setId(resultSet.getInt("id"));

            todo.setTitle(resultSet.getString("title"));
            return todo;
        }
    }
}
