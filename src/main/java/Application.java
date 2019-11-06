import java.io.File;

import static spark.Spark.*;

public class Application {
    public static void main(String[] args) {
        staticFiles.location("public");
        get(Path.Web.INDEX, Controller.serverIndexPage);
        get(Path.Web.STUDENTS_ADD, Controller.serveAddPage);
        post(Path.Web.ADD, Controller.handleAddStudent);

    }
}
