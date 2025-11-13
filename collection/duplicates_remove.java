package collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class duplicates_remove {
    public static <T> List<T> removedup(List<T> list) {
        List<T> uniqueList = new ArrayList<>();
        for (T element : list) {
            if (!uniqueList.contains(element)) { 
                uniqueList.add(element);
            }        }
        return uniqueList;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("  Duplicate Remover ");
        System.out.println("Enter all integers:");
        String line = scanner.nextLine();
        List<Integer> inputList = Arrays.stream(line.split("\\s+")) 
                                     .filter(s -> !s.isEmpty())    
                                     .map(Integer::valueOf)       
                                     .collect(Collectors.toList());
        List<Integer> outputList = removedup(inputList);
        System.out.println("\n     Results ");
        System.out.println("Input List: " + inputList);
        System.out.println("Output (Duplicates Removed): " + outputList);
    }
}