package Thinking_in_Java.Chapter_14.Ex11.typeinfo;

class FuelFilter extends Filter {
    // Создание фабрики класса для каждого конкретного типа:
    public static class Factory
    implements Thinking_in_Java.Chapter_14.Ex11.typeinfo.factory.Factory<FuelFilter>{
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}
