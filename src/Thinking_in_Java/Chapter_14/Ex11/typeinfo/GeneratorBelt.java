package Thinking_in_Java.Chapter_14.Ex11.typeinfo;

class GeneratorBelt extends Belt {
    public static class Factory
            implements Thinking_in_Java.Chapter_14.Ex11.typeinfo.factory.Factory<GeneratorBelt>{
        public GeneratorBelt create() {
            return new GeneratorBelt();
        }
    }
}
