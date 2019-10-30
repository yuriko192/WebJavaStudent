import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

public class datObj {
    private Sql2o db;

    public datObj() {
        db = new Sql2o("jdbc:mysql://localhost:3306/school","root", "");
    }
    public List<Students> getStudents(){
        String sql = "select * from students";
        try(Connection con = db.open()) {
            return con.createQuery(sql).executeAndFetch(Students.class);
        }
    }
    public void addStudents(String nim,String fullname, String address){
        String sql = "insert into students(nim,fullname,address) values (:nim,:fullname,:address)";
        try(Connection con = db.open()){
            con.createQuery(sql)
                    .addParameter("nim",nim)
                    .addParameter("fullname",fullname)
                    .addParameter("address",address)
                    .executeUpdate();
        }
    }
    /*
    public void completeTodo(Integer id){
        String sql = "Delete from todos where id = :id";
        try(Connection con = db.open()){
            con.createQuery(sql).addParameter("id",id).executeUpdate();
        }
    }
     */
}
