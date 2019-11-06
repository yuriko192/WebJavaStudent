import spark.Request;
import spark.Response;
import spark.Route;

import java.util.HashMap;
import java.util.Map;


public class Controller {
    private static datObj table_m = new datObj();

    public static Route serverIndexPage = (Request req, Response res)->{
        Map<String,Object> model = new HashMap<String, Object>();
        model.put("tabel",table_m.getStudents());
        return View.render(req,model, Path.Template.INDEX);
    };

    public static Route serveAddPage = (Request req, Response res)->{
        Map<String,Object> model = new HashMap<String, Object>();

        return View.render(req,model, Path.Template.STUDENTS_ADD);
    };

    public static Route handleAddStudent= (Request req, Response res)->{
        String nim,fullname,address;
        nim = req.queryParams("nim");
        fullname = req.queryParams("fullname");
        address =req.queryParams("address");
        table_m.addStudents(nim,fullname,address);
        res.redirect(Path.Web.INDEX);
        return null;
    };
}
