package office_hour;

public class office_hour {
    public static void main(String[] args) {
        String employee="Philipa Salthouse [Electrical Engineer] psalthouse@g.co";
        int startingIndex=employee.indexOf("[")+1;
        int endingIndex=employee.indexOf("]");
        String title=employee.substring(startingIndex,endingIndex);
        System.out.println("title = " + title);

        String fullname=employee.substring(0,employee.indexOf(" ["));
        System.out.println("fullname = " + fullname);
        String fullNamedash=fullname.replace(" ","-");
        System.out.println("fullNamedash = " + fullNamedash);
        System.out.println(fullNamedash+" "+title);

        if(title.equals("Electrical Engineer")) {
            System.out.println("Pass:");
        }else{
            System.out.println(" Fail: "+title);
        }

        System.out.println(fullname.charAt(0)+""+fullname.charAt(fullname.lastIndexOf(" ")+1)+"->"+title);
    }
}
