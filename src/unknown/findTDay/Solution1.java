package unknown.findTDay;

import java.util.Stack;

public class Solution1 {


    /**
     * Описание задачи.
     * Есть массив чисел, предположим что это температура,
     * где каждый элемент, это температура определенного дня
     * Наша задача , найти , через сколько дней
     * температура будет выше нынешнего
     * Пример
     * 13, 12, 15
     * С начало у нас есть день с температурой 13 градусов
     * Следующий более теплый день, это день с температурой 15 градусов
     * Соответственно, следующий более теплый день будет ЧЕРЕЗ два дня
     * {index: 0 value:2}, {index:1 value:1}, {index:2 value 0}
     * Так как после последнего элемента более нет дней и он самый теплый, то запишем 0
     * Так же если после него был бы менее теплый день, то он тоже получил-был значение 0
     * Так как алгоритм работает только в одну сторону
     */


    public int [] temperaturesN1(int[] t){
        int[] answer = new int[t.length];

        for (int i = 0; i < t.length; i++) {
            for (int j = i + 1; j < t.length; j++) {
                if(t[j] > t[i]){
                    answer[i] = j - i;
                    break;
                }
            }
        }
        return answer;
    }

    public int[] temperaturesN2(int[] t){
        Stack<C> stack = new Stack<>();
        int[] answer = new int[t.length];
        for (int i = t.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek().value <=t[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                answer[i] = stack.peek().index - i;
            }
            stack.push(new C(t[i] , i));
        }
        return answer;
    }




}
