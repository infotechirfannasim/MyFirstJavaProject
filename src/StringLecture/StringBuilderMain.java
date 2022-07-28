package StringLecture;

public class StringBuilderMain {

    // StringBuilder is not Threadsafe
    public static void main(String[] args) {
        //
       /* StringBuilder sb = new StringBuilder();
        sb.append("This ")
                .append("is ")
                .append("my ")
                .append("name");
        System.out.println(sb.toString());*/

        // SELECT * FROM table WHERE (username, name) = 'irfan';
        String param = "name";
        StringBuilder query = new StringBuilder("SELECT * FROM table WHERE ");
        if(param.equalsIgnoreCase("username")){
            query.append("username = ")
                    .append("irfan;");
        } else {
            query.append("name = ")
                    .append("irfan;");
        }
        System.out.println(query.toString());
    }
}
