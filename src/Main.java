import java.io.FileReader;
import java.io.FileWriter;
//import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
public class Main {
    
    //ArrayList<String>things = new ArrayList<>();
    public static void main(String[] args)throws Exception{
        String[] data = new String[4];
        String id;
        String name;
        String quantity;
                
        double price;
        double totalPrice = 0.0;
        
        String filePath = "C:\\Users\\28101\\Desktop\\Groceries.txt";
        String filewriter = "C:\\Users\\28101\\Desktop\\ABC.txt";
        FileWriter fileWriter = new FileWriter(filewriter);
        FileReader fileReader = new FileReader(filePath);
        BufferedReader reader = new BufferedReader(fileReader);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        String line;
        System.out.println("**************************"+"\n");
        System.out.println("ID#"+"\t"+"Name"+"\t"+"quantity"+"\t"+"price"+"\n");

        while((line = reader.readLine()) != null){
            data = line.split(",");
            id = data[0];
            name = data[1];
            quantity = data[2];
            price = Double.parseDouble(data[3]); 
            totalPrice += price;
            System.out.println(id+"\t"+name+"\t"+quantity+"\t\t"+price+"\n");
            writer.write(id+"\t"+name+"\t"+quantity+"\t\t"+price+"\n");
            
        }
        System.out.println("**************************");
        System.out.println("\n"+"Total price of groceries"+Math.round(totalPrice));
        writer.write("\n" + "Total price of groceries" + Math.round(totalPrice));
        
        reader.close();
        writer.flush();
        writer.close();
        
    }
}
