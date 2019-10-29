import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            final Shell shell = new Shell("java-shell>");
            String command;
            Scanner sc = new Scanner(System.in);
            
            System.out.println(Shell.Commands());
            System.out.println();
            while(true)
            {
                System.out.print(shell.getName());
                command = sc.nextLine();
                System.out.print(shell.executeCommand(command));
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
