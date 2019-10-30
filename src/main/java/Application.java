import static spark.Spark.get;
import static spark.Spark.post;

public class Application {
    public static void main(String[] args) {
        get(Path.Web.INDEX, Controller.serverIndexPage);
        get(Path.Web.STUDENTS_ADD, Controller.serveAddPage);
        post(Path.Web.ADD, Controller.handleAddStudent);
    }
}
