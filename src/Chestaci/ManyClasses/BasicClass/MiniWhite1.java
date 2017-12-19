package Chestaci.ManyClasses.BasicClass;

public class MiniWhite1 extends MrWhite {
    public void testInternal() {
        Tea tea = new Tea();
        Tea.BlackTea bt = new Tea.BlackTea();
      //  Tea.WhiteTea wt = new Tea.WhiteTea();      //private
        Tea.GreenTea gt = new Tea.GreenTea();
        Tea.HerbalTea ht = new Tea.HerbalTea();

       // Auto auto = new Auto();                   //private

        Album album = new Album();
        Album.Foto foto = new Album.Foto();
      //  Album.NegativesFoto negativesFoto = new Album.NegativesFoto();          //private
        Album.CommentsFoto commentsFoto = new Album.CommentsFoto();
        Album.CopyFoto copyFoto = new Album.CopyFoto();

        Hat hat = new Hat();
        Hat.WinterHat winterHat = new Hat.WinterHat();
       // Hat.AutumnHat autumnHat = new Hat.AutumnHat();            //private
        Hat.SummerHat summerHat = new Hat.SummerHat();
        Hat.SpringHat springHat = new Hat.SpringHat();

        // Carrot carrot = new Carrot();                          //private
        Friends friends = new Friends();
        Instagram instagram = new Instagram();
        Candy candy = new Candy();
    }
}
