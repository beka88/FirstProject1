package office_hour;

public class StringTask5
{
    public static void main(String[] args) {
        String name = "Dr me";
        String upperCase = name.toUpperCase();
        if (upperCase.startsWith("DR ")) {
            System.out.println("Doctor");
        } else if (upperCase.startsWith("MR ")) {
            System.out.println("Male");
        }

    }
}
/*Task 5:
given a name with prefix, stored in a String variable called name
for example
    Dr. Dru , Mr. Robot , Ms. Lois , Mrs. Brown
-- in case insensitive condition ----
print as below
if the name Started with (Dr )-->> Doctor
if the name Started with (Mr )-->> Male
if the name Started with (Miss )-->> Single female
if the name Started with (Mrs )-->> Married female

 */
