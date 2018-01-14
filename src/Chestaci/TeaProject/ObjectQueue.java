package Chestaci.TeaProject;

public class ObjectQueue<T> {
    // Указатель на первый элемент
    private ObjectBox<T> head = null;
    // Указатель на последний элемент
    private ObjectBox<T> tail = null;
    // Поле для хранения размера очереди
    private int size = 0;

    public void push(T obj) {
        // Сразу создаем вспомогательный объект и помещаем новый элемент в него
        ObjectBox<T> ob = new ObjectBox<>();
        ob.setObject(obj);
        // Если очередь пустая - в ней еще нет элементов
        if (head == null) {
            // Теперь наша голова указывает на наш первый элемент
            head = ob;
            tail = ob;
        } else {
            // Если это не первый элемент, то надо, чтобы последний элемент в очереди
            // указывал на вновь прибывший элемент
            tail.setNext(ob);
            ob.setPrev(tail);
        }
        // И в любом случае нам надо наш "хвост" переместить на новый элемент
        // Если это первый элемент, то "голова" и "хвост" будут указывать на один и тот же элемент
        tail = ob;
        // Увеличиваем размер нашей очереди
        size++;
    }

    public void push(T obj, int priority) {
        ObjectBox<T> ob = new ObjectBox<>();
        ob.setObject(obj);
        ob.setPriority(priority);
        if (head == null) {
            head = ob;
            tail = ob;
        } else {
            if(tail.getPriority() > ob.getPriority()){
                tail.setNext(ob);
                ob.setPrev(tail);
                tail = ob;
            }else {
                ObjectBox<T> cur = head;
                while (ob.getPriority() >= cur.getPriority()) {

                }
            }
        }
        // И в любом случае нам надо наш "хвост" переместить на новый элемент
        // Если это первый элемент, то "голова" и "хвост" будут указывать на один и тот же элемент
        tail = ob;
        // Увеличиваем размер нашей очереди
        size++;
    }

    public T pull() {
        // Если у нас нет элементов, то возвращаем null
        if (size == 0) {
            return null;
        }
        // Получаем наш объект из вспомогательного класса из "головы"
        T obj = head.getObject();
        // Перемещаем "голову" на следующий элемент
        head = head.getNext();
        // Если это был единственный элемент, то head станет равен null
        // и тогда tail (хвост) тоже дожен указать на null.
        if (head == null) {
            tail = null;
        }
        // Уменьшаем размер очереди
        size--;
        // Возвращаем значение
        return obj;
    }

    public T get(int index) {
        // Если нет элементов или индекс больше размера или индекс меньше 0
        if(size == 0 || index >= size || index < 0) {
            return null;
        }
        if(index <= (size/2)) {
            // Устанавлваем указатель, который будем перемещать на "голову"
            ObjectBox<T> current = head;
            // В этом случае позиция равну 0
            int pos = 0;
            // Пока позиция не достигла нужного индекса
            while (pos < index) {
                // Перемещаемся на следующий элемент
                current = current.getNext();
                // И увеличиваем позицию
                pos++;
            }
            // Мы дошли до нужной позиции и теперь можем вернуть элемент
            T obj = current.getObject();
            return obj;
        }else {
            ObjectBox<T> current = tail;
            int pos = (size - 1);
            while (pos > index){
                current = current.getPrev();
                pos--;
            }
            T obj = current.getObject();
            return obj;
        }
    }

    public int size() {
        return size;
    }

    // Наш вспомогательный класс будет закрыт от посторонних глаз
    private class ObjectBox<T> {
        // Поле для хранения объекта
        private T object;
        private int priority;
        // Поле для указания на следующий элемент в цепочке.
        // Если оно равно NULL - значит это последний элемент
        private ObjectBox<T> next;
        private ObjectBox<T> prev;

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public T getObject() {
            return object;
        }

        public void setObject(T object) {
            this.object = object;
        }

        public ObjectBox getNext() {
            return next;
        }

        public void setNext(ObjectBox<T> next) {
            this.next = next;
        }

        public ObjectBox getPrev(){
            return prev;
        }

        public void setPrev(ObjectBox<T> prev){
            this.prev = prev;
        }
    }
}