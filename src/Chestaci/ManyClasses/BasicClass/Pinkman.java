package Chestaci.ManyClasses.BasicClass;

public class Pinkman {
    public void testInternal() {
        MrWhite.Tea tea = new MrWhite.Tea();
        MrWhite.Tea.BlackTea bt = new MrWhite.Tea.BlackTea();
       // MrWhite.Tea.WhiteTea wt = new MrWhite.Tea.WhiteTea();                                     //private
        MrWhite.Tea.GreenTea gt = new MrWhite.Tea.GreenTea();
        MrWhite.Tea.HerbalTea ht = new MrWhite.Tea.HerbalTea();

       // MrWhite.Auto auto = new MrWhite.Auto();                                                   //private

        MrWhite.Album album = new MrWhite.Album();
        MrWhite.Album.Foto foto = new MrWhite.Album.Foto();
        //MrWhite.Album.NegativesFoto negativesFoto = new MrWhite.Album.NegativesFoto();            //private
        MrWhite.Album.CommentsFoto commentsFoto = new MrWhite.Album.CommentsFoto();
        MrWhite.Album.CopyFoto copyFoto = new MrWhite.Album.CopyFoto();

        MrWhite.Hat hat = new MrWhite.Hat();
        MrWhite.Hat.WinterHat winterHat = new MrWhite.Hat.WinterHat();
       // MrWhite.Hat.AutumnHat autumnHat = new MrWhite.Hat.AutumnHat();                            //private
        MrWhite.Hat.SummerHat summerHat = new MrWhite.Hat.SummerHat();
        MrWhite.Hat.SpringHat springHat = new MrWhite.Hat.SpringHat();

       // MrWhite.Carrot carrot = new MrWhite.Carrot();                                            //private   non-static
      //  MrWhite.Friends friends = new MrWhite.Friends();                                         //non-static
      //  MrWhite.Instagram instagram = new MrWhite.Instagram();                                   //non-static
      //  MrWhite.Candy candy = new MrWhite.Candy();                                               //non-static
    }
}
