
import java.util.Arrays;

public class AdvancedArrays {
    int [] array = {1,2,3,4,5};
    int size = 0;
    int el = 0;
    int index = 0;

void createArray (int size)
{this.size = this.size + size;
}
 void remove(int index) {
     if (index == array.length){
         array = Arrays.copyOf(array, array.length - el);
     }
     array[0] = el;
     index --;
 }

void setArray ( int [] array){
this.array = array;
}
int size (){
    return size;
}
void add (int el){
   if (size == 0){
        array = Arrays.copyOf(array, array.length + el);
   }
  array[0] = el;
    size ++;
}

int get (int index){
    return index;
}
void printArray(){
    System.out.println(Arrays.toString(array));
}
}

//    void createArray(int size) - инициализирует массив нулями с величиной size
//        void setArray(int [] array) - инициализирует массив числами заданными в инпуте метода
//        int size() - возвращает размер массива
//        void add(int el) - добавляет елемент в конец массива
//        void remove(int index) - Удаляет элемент в указанной позиции в этом списке.
//        Смещает любые последующие элементы влево ( вычитает один из их индексов )
//        int get(int index) - Возвращает элемент в указанной позиции в этом списке.
//        void printArray() - печатает массив в терминал
