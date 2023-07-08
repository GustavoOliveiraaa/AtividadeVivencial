import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ExercicioAulaVivencial {
    public static Stack<Integer> acumulador(List<Integer> lista) {
        Stack<Integer> stack = new StaticStack<>(lista.size());
        int somaTotal = 0;
    
        for (int i = 0; i < lista.size(); i++) {
            Integer element = lista.get(i);
            Integer soma = element;
            stack.push(soma);
        }
    
        return stack;
    }
    

    public static void pushBase(Stack<Integer> stack, Integer element) throws OverflowException {
        Stack<Integer> auxStack = new StaticStack<>(stack.numElements() + 1);

        while (!stack.isEmpty()) {
            auxStack.push(stack.pop());
        }

        stack.push(element);

        while (!auxStack.isEmpty()) {
            stack.push(auxStack.pop());
        }
    }

    public static String achaMaiorString(Queue<String> fila) {
        String maiorString = null;

        for (String str : fila) {
            if (maiorString == null || str.length() > maiorString.length()) {
                maiorString = str;
            }
        }

        return maiorString;
    }

    public static void consecutiveSum(Integer[] array, int valor) {
        StringBuilder sb = new StringBuilder();
        int soma = 0;
    
        for (int i = 0; i < array.length; i++) {
            Integer num = array[i];
            soma += num;
            sb.append(num).append("+");
    
            if (soma > valor) {
                sb.deleteCharAt(sb.length() - 1); // Remove o último '+'
                sb.append(" = ").append(soma).append("\n");
                System.out.print(sb.toString());
    
                sb.setLength(0);
                soma = 0;
            }
        }
    
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1); // Remove o último '+'
            sb.append(" = ").append(soma).append("\n");
            System.out.print(sb.toString());
        }
    }
    
}

