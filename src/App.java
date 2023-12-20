import java.util.Scanner;


public class App 
{

    public static void main(String[] args) throws Exception 
    {

        String message = "";
        String username = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter username: ");
        username = scan.nextLine();
        System.out.println("Enter Message Board Post: ");
        message = scan.nextLine();

        String message = "";
        String pivot = "";

        int firstIndex;

        System.out.println("Enter input message: ");
        message = scan.nextLine();
        System.out.println("Enter pivot: ");
        pivot = scan.nextLine();

        firstIndex = message.indexOf(pivot);

        //if Exists
        if (firstIndex != -1) 
        {
            message = message.substring(firstIndex + pivot.length()) + pivot + message.substring(0, firstIndex);
            System.out.println(message);
        } else {
            System.out.println("ERROR: Pivot String not found...");
        }   

        


    }

    //1
    public static void checkSwearWords(String username, String inputMessage) {

        inputMessage = " " + inputMessage + " ";

        var isFlagged = false;

        var isRunning = true;

        int firstSwearWord = inputMessage.indexOf(" ^^ ");
        int secondSwearWord = inputMessage.indexOf(" qey ");
        int thirdSwearWord = inputMessage.indexOf(" $ ");


        int firstCount = 0;
        int secondCount = 0;
        int thirdCount = 0;

        while(isRunning) {
            if (firstSwearWord == -1 && secondSwearWord == -1 && thirdSwearWord == -1) {
                isRunning = false;
            } 
    
            //if exists
            if (firstSwearWord != -1) {
                System.out.println("first does exist");
           
                // if ((inputMessage.charAt(firstSwearWord - 1) == ' ') && (inputMessage.charAt(firstSwearWord + 2) == ' ')) {
                    isFlagged = true;
                    firstCount += 1;
                //}
               
                inputMessage = inputMessage.substring(0, firstSwearWord) + inputMessage.substring(firstSwearWord + 2);

            }
            
            //if exists
            if (secondSwearWord != -1) {
                System.out.println("Second does exist");
                //if ((inputMessage.charAt(secondSwearWord - 1) == ' ') && (inputMessage.charAt(secondSwearWord + 3) == ' ')) {
                    isFlagged = true;
                    secondCount += 1;
                //}

                inputMessage = inputMessage.substring(0, secondSwearWord) + inputMessage.substring(secondSwearWord + 3);
            }

            //if exists
            if (thirdSwearWord != -1) {
                System.out.println("Third does exist");
            // if ((inputMessage.charAt(thirdSwearWord - 1) == ' ') && (inputMessage.charAt(thirdSwearWord + 1) == ' ')) {
                    isFlagged = true;
                    thirdCount += 1;
                //}
                inputMessage = inputMessage.substring(0, thirdSwearWord) + inputMessage.substring(thirdSwearWord + 1);
            }

            firstSwearWord = inputMessage.indexOf(" ^^ ");
            secondSwearWord = inputMessage.indexOf(" qey ");
            thirdSwearWord = inputMessage.indexOf(" $ ");

            
        }


        System.out.println("Results: ");

        if (isFlagged) {
            System.out.println("BAD");

            System.out.println(username);
            System.out.println("^^: " + firstCount);
            System.out.println("qey: " + secondCount);
            System.out.println("$: " + thirdCount);

            
        } else {
            System.out.println("Clean");
            
        }

    }
        

    //2
    


    

}
