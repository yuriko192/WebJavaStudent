import lombok.Getter;

public class Path {
    public static class Web{
        @Getter public static final String INDEX = "/";
        @Getter public static final String STUDENTS_ADD = "/add/";
        @Getter public static final String ADD = "/add/comp/";

    }

    public static class Template{
        public static final String INDEX = "/velocity/index.vm";
        public static final String STUDENTS_ADD = "/velocity/add.vm";
    }
}
