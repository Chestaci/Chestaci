package Thinking_in_Java.Chapter_14.Ex11.typeinfo;

class PowerSteeringBelt extends Belt {
    public static class Factory
            implements Thinking_in_Java.Chapter_14.Ex11.typeinfo.factory.Factory<PowerSteeringBelt>{
        public PowerSteeringBelt create() {
            return new PowerSteeringBelt();
        }
    }
}
