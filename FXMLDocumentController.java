package rocnikovaprace1;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.ThreadLocalRandom;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;

public class FXMLDocumentController implements Initializable {

    int hraciPol[][] = {{105, 327}//1 Pole s koordinacemi pro figurky
    ,
     {165, 327}//2
    ,
     {224, 327}//3
    ,
     {283, 327}//4
    ,
     {342, 327}//5
    ,
     {342, 268}//6
    ,
     {342, 209}//7
    ,
     {342, 150}//8
    ,
     {342, 91} //9
    ,
     {401, 91} //10
    ,
     {460, 91} //11
    ,
     {460, 150}//12
    ,
     {460, 209}//13
    ,
     {460, 268}//14
    ,
     {460, 327}//15
    ,
     {519, 327}//16
    ,
     {578, 327}//17
    ,
     {637, 327}//18
    ,
     {696, 327}//19
    ,
     {696, 386}//20
    ,
     {696, 445}//21
    ,
     {637, 445}//22
    ,
     {578, 445}//23
    ,
     {519, 445}//24
    ,
     {460, 445}//25
    ,
     {460, 504}//26
    ,
     {460, 563}//27
    ,
     {460, 622}//28
    ,
     {460, 681}//29
    ,
     {401, 681}//30
    ,
     {342, 681}//31
    ,
     {342, 622}//32
    ,
     {342, 563}//33
    ,
     {342, 504}//34
    ,
     {342, 445}//35    
    ,
     {283, 445}//36
    ,
     {224, 445}//37
    ,
     {165, 445}//38
    ,
     {105, 445}//39
    ,
     {105, 386}//40
    };

    int moPozice1 = 0;//Začínací pozice figurek
    int moPozice2 = 0;
    int moPozice3 = 0;
    int moPozice4 = 0;
    int zePozice1 = -1;
    int zePozice2 = -1;
    int zePozice3 = -1;
    int zePozice4 = -1;
    int zlPozice1 = -2;
    int zlPozice2 = -2;
    int zlPozice3 = -2;
    int zlPozice4 = -2;
    int cePozice1 = -3;
    int cePozice2 = -3;
    int cePozice3 = -3;
    int cePozice4 = -3;
    
    
    boolean zeBoo1 = false;
    boolean zeBoo2 = false;
    boolean zeBoo3 = false;
    boolean zeBoo4 = false;
    boolean zlBoo1 = false;
    boolean zlBoo2 = false;
    boolean zlBoo3 = false;
    boolean zlBoo4 = false;
    boolean ceBoo1 = false;
    boolean ceBoo2 = false;
    boolean ceBoo3 = false;
    boolean ceBoo4 = false;
   
    
    @FXML
    private Button moKostka;//Kostky
    @FXML
    private Button zeKostka;
    @FXML
    private Button zlKostka;
    @FXML
    private Button ceKostka;

    @FXML
    private Ellipse modTel1;//Modré figurky
    @FXML
    private Ellipse modTel2;
    @FXML
    private Ellipse modTel3;
    @FXML
    private Ellipse modTel4;
    @FXML
    private Circle modHla1;
    @FXML
    private Circle modHla2;
    @FXML
    private Circle modHla3;
    @FXML
    private Circle modHla4;
    
    @FXML
    private Ellipse zelTel1;//Zelené figurky
    @FXML
    private Ellipse zelTel2;
    @FXML
    private Ellipse zelTel3;
    @FXML
    private Ellipse zelTel4;
    @FXML
    private Circle zelHla1;
    @FXML
    private Circle zelHla2;
    @FXML
    private Circle zelHla3;
    @FXML
    private Circle zelHla4;
    
    @FXML
    private Ellipse cerTel1;//Červené figurky
    @FXML
    private Ellipse cerTel2;
    @FXML
    private Ellipse cerTel3;
    @FXML
    private Ellipse cerTel4;
    @FXML
    private Circle cerHla1;
    @FXML
    private Circle cerHla2;
    @FXML
    private Circle cerHla3;
    @FXML
    private Circle cerHla4;
    
    @FXML
    private Ellipse zluTel1;//Žluté figurky
    @FXML
    private Ellipse zluTel2;
    @FXML
    private Ellipse zluTel3;
    @FXML
    private Ellipse zluTel4;
    @FXML
    private Circle zluHla1;
    @FXML
    private Circle zluHla2;
    @FXML
    private Circle zluHla3;
    @FXML
    private Circle zluHla4;

    @FXML
    private Button hratTlacitko;
    @FXML
    private Label Napis;
    @FXML
    private GridPane pole;
    @FXML
    private Button znovu;
    @FXML
    private TextField vyhra;



    private int random() {//Vrátí celé číslo mezi 1 a 6
        return (ThreadLocalRandom.current().nextInt(1, 6 + 1));
    }

    @FXML
    private void hrat(ActionEvent event) {//Zobrazí hrací plochu figurky a začíná hru
        hratTlacitko.setVisible(false);
        Napis.setVisible(false);
        pole.setVisible(true);
        figurkyVis(true);
    }
    @FXML
    private void modFigurkyVis(boolean a) {//Zobrazí nebo nechá zmizet modré figurky
        modTel1.setVisible(a);
        modTel2.setVisible(a);
        modTel4.setVisible(a);
        modTel3.setVisible(a);
        modHla1.setVisible(a);
        modHla2.setVisible(a);
        modHla3.setVisible(a);
        modHla4.setVisible(a);
    }

    @FXML
    private void zelFigurkyVis(boolean a) {//Zobrazí nebo nechá zmizet zelené figurky
        zelTel1.setVisible(a);
        zelTel2.setVisible(a);
        zelTel3.setVisible(a);
        zelTel4.setVisible(a);
        zelHla1.setVisible(a);
        zelHla2.setVisible(a);
        zelHla3.setVisible(a);
        zelHla4.setVisible(a);
    }

    @FXML
    private void cerFigurkyVis(boolean a) {//Zobrazí nebo nechá zmizet červené figurky
        cerTel1.setVisible(a);
        cerTel2.setVisible(a);
        cerTel3.setVisible(a);
        cerTel4.setVisible(a);
        cerHla1.setVisible(a);
        cerHla2.setVisible(a);
        cerHla3.setVisible(a);
        cerHla4.setVisible(a);
    }

    @FXML
    private void zluFigurkyVis(boolean a) {//Zobrazí nebo nechá zmizet žluté figurky
        zluTel1.setVisible(a);
        zluTel2.setVisible(a);
        zluTel3.setVisible(a);
        zluTel4.setVisible(a);
        zluHla1.setVisible(a);
        zluHla2.setVisible(a);
        zluHla3.setVisible(a);
        zluHla4.setVisible(a);
    }

    @FXML
    private void figurkyVis(boolean a) {//Zobrazí nebo nechá zmizet figurky
        modFigurkyVis(a);
        zelFigurkyVis(a);
        cerFigurkyVis(a);
        zluFigurkyVis(a);
    }

    @FXML
    private void moDom1() {  //Posune první modrou figurku do cíle
        modTel1.setLayoutX(165);
        modTel1.setLayoutY(386);
        modHla1.setLayoutX(165);
        modHla1.setLayoutY(351);
        moPozice1 = 42;
    }

    @FXML
    private void moDom2() { //Posune druhou modrou figurku do cíle
        modTel2.setLayoutX(224);
        modTel2.setLayoutY(386);
        modHla2.setLayoutX(224);
        modHla2.setLayoutY(351);
        moPozice2 = 42;
    }

    @FXML
    private void moDom3() { //Posune třetí modrou figurku do cíle
        modTel3.setLayoutX(283);
        modTel3.setLayoutY(386);
        modHla3.setLayoutX(283);
        modHla3.setLayoutY(351);
        moPozice3 = 42;
    }

    @FXML
    private void moDom4() {//Posune čtvrtou modrou figurku do cíle
        modTel4.setLayoutX(342);
        modTel4.setLayoutY(386);
        modHla4.setLayoutX(342);
        modHla4.setLayoutY(351);
        moPozice4 = 42;
    }

    @FXML
    private void zeDom1() { //Posune první zelenou figurku do cíle
        zelTel1.setLayoutX(401);
        zelTel1.setLayoutY(150);
        zelHla1.setLayoutX(401);
        zelHla1.setLayoutY(115);
        zePozice1 = -8;
    }

    @FXML
    private void zeDom2() { //Posune druhou zelenou figurku do cíle
        zelTel2.setLayoutX(401);
        zelTel2.setLayoutY(209);
        zelHla2.setLayoutX(401);
        zelHla2.setLayoutY(174);
        zePozice2 = -8;
    }

    @FXML
    private void zeDom3() { //Posune třetí zelenou figurku do cíle
        zelTel3.setLayoutX(401);
        zelTel3.setLayoutY(268);
        zelHla3.setLayoutX(401);
        zelHla3.setLayoutY(233);
        zePozice3 = -8;
    }

    @FXML
    private void zeDom4() {//Posune čtvrtou zelenou figurku do cíle
        zelTel4.setLayoutX(401);
        zelTel4.setLayoutY(327);
        zelHla4.setLayoutX(401);
        zelHla4.setLayoutY(292);
        zePozice4 = -8;
    }

    @FXML
    private void zlDom1() {//Posune první žlutou figurku do cíle
        zluTel1.setLayoutX(637);
        zluTel1.setLayoutY(386);
        zluHla1.setLayoutX(637);
        zluHla1.setLayoutY(351);
        zlPozice1 = -9;
    }

    @FXML
    private void zlDom2() {//Posune druhou žlutou figurku do cíle
        zluTel2.setLayoutX(578);
        zluTel2.setLayoutY(386);
        zluHla2.setLayoutX(578);
        zluHla2.setLayoutY(351);
        zlPozice2 = -9;
    }

    @FXML
    private void zlDom3() {//Posune třetí žlutou figurku do cíle
        zluTel3.setLayoutX(519);
        zluTel3.setLayoutY(386);
        zluHla3.setLayoutX(519);
        zluHla3.setLayoutY(351);
        zlPozice3 = -9;
    }

    @FXML
    private void zlDom4() {//Posune čtvrtou žlutou figurku do cíle
        zluTel4.setLayoutX(460);
        zluTel4.setLayoutY(386);
        zluHla4.setLayoutX(460);
        zluHla4.setLayoutY(351);
        zlPozice4 = -9;
    }

    @FXML
    private void ceDom1() {//Posune první červenou figurku do cíle
        cerTel1.setLayoutX(401);
        cerTel1.setLayoutY(622);
        cerHla1.setLayoutX(401);
        cerHla1.setLayoutY(587);
        cePozice1 = -10;
    }

    @FXML
    private void ceDom2() {//Posune druhou červenou figurku do cíle
        cerTel2.setLayoutX(401);
        cerTel2.setLayoutY(563);
        cerHla2.setLayoutX(401);
        cerHla2.setLayoutY(528);
        cePozice2 = -10;
    }

    @FXML
    private void ceDom3() {//Posune třetí červenou figurku do cíle
        cerTel3.setLayoutX(401);
        cerTel3.setLayoutY(504);
        cerHla3.setLayoutX(401);
        cerHla3.setLayoutY(469);
        cePozice3 = -10;
    }

    @FXML
    private void ceDom4() {//Posune čtvrtou červenou figurku do cíle
        cerTel4.setLayoutX(401);
        zelTel4.setLayoutY(445);
        zelHla4.setLayoutX(401);
        zelHla4.setLayoutY(410);
        cePozice4 = -10;
    }

    @FXML
    private void moStart1() {//Posune první modrou figurku zpět na start
        modTel1.setLayoutX(105);
        modTel1.setLayoutY(90);
        modHla1.setLayoutX(105);
        modHla1.setLayoutY(55);
    }

    @FXML
    private void moStart2() {//Posune druhou modrou figurku zpět na start
        modTel2.setLayoutX(165);
        modTel2.setLayoutY(90);
        modHla2.setLayoutX(165);
        modHla2.setLayoutY(55);
    }

    @FXML
    private void moStart3() {//Posune třetí modrou figurku zpět na start
        modTel3.setLayoutX(105);
        modTel3.setLayoutY(150);
        modHla3.setLayoutX(105);
        modHla3.setLayoutY(115);
    }

    @FXML
    private void moStart4() {//Posune čtvrtou modrou figurku zpět na start
        modTel4.setLayoutX(165);
        modTel4.setLayoutY(150);
        modHla4.setLayoutX(165);
        modHla4.setLayoutY(115);
    }

    @FXML
    private void zeStart1() {//Posune první zelenou figurku zpět na start
        zelTel1.setLayoutX(638);
        zelTel1.setLayoutY(90);
        zelHla1.setLayoutX(638);
        zelHla1.setLayoutY(55);
    }

    @FXML
    private void zeStart2() {//Posune druhou zelenou figurku zpět na start
        zelTel2.setLayoutX(696);
        zelTel2.setLayoutY(90);
        zelHla2.setLayoutX(696);
        zelHla2.setLayoutY(55);
    }

    @FXML
    private void zeStart3() {//Posune třetí zelenou figurku zpět na start
        zelTel3.setLayoutX(638);
        zelTel3.setLayoutY(150);
        zelHla3.setLayoutX(638);
        zelHla3.setLayoutY(115);
    }

    @FXML
    private void zeStart4() {//Posune čtvrtou zelenou figurku zpět na start
        zelTel4.setLayoutX(696);
        zelTel4.setLayoutY(150);
        zelHla4.setLayoutX(696);
        zelHla4.setLayoutY(115);
    }

    @FXML
    private void zlStart1() {//Posune první žlutou figurku zpět na start
        zluTel1.setLayoutX(638);
        zluTel1.setLayoutY(625);
        zluHla1.setLayoutX(638);
        zluHla1.setLayoutY(590);
    }

    @FXML
    private void zlStart2() {//Posune druhou žlutou figurku zpět na start
        zluTel2.setLayoutX(696);
        zluTel2.setLayoutY(625);
        zluHla2.setLayoutX(696);
        zluHla2.setLayoutY(590);
    }

    @FXML
    private void zlStart3() {//Posune třetí žlutou figurku zpět na start
        zluTel3.setLayoutX(638);
        zluTel3.setLayoutY(680);
        zluHla3.setLayoutX(638);
        zluHla3.setLayoutY(645);
    }

    @FXML
    private void zlStart4() {//Posune čtvrtou žlutou figurku zpět na start
        zluTel4.setLayoutX(696);
        zluTel4.setLayoutY(680);
        zluHla4.setLayoutX(696);
        zluHla4.setLayoutY(645);
    }

    @FXML
    private void ceStart1() {//Posune první červenou figurku zpět na start
        cerTel1.setLayoutX(105);
        cerTel1.setLayoutY(625);
        cerHla1.setLayoutX(105);
        cerHla1.setLayoutY(590);
    }

    @FXML
    private void ceStart2() {//Posune druhou červenou figurku zpět na start
        cerTel2.setLayoutX(165);
        cerTel2.setLayoutY(625);
        cerHla2.setLayoutX(165);
        cerHla2.setLayoutY(590);
    }

    @FXML
    private void ceStart3() {//Posune třetí červenou figurku zpět na start
        cerTel3.setLayoutX(105);
        cerTel3.setLayoutY(680);
        cerHla3.setLayoutX(105);
        cerHla3.setLayoutY(645);
    }

    @FXML
    private void ceStart4() {//Posune čtvrtou červenou figurku zpět na start
        cerTel4.setLayoutX(165);
        cerTel4.setLayoutY(680);
        cerHla4.setLayoutX(165);
        cerHla4.setLayoutY(645);
    }

    @FXML
    private void hratZnovu() {//Možnost resetovat htu po výhře
        moKostka.setVisible(true);
        zeKostka.setVisible(false);
        zlKostka.setVisible(false);
        ceKostka.setVisible(false);
        moPozice1 = 0;
        moPozice2 = 0;
        moPozice3 = 0;
        moPozice4 = 0;
        zePozice1 = -1;
        zePozice2 = -1;
        zePozice3 = -1;
        zePozice4 = -1;
        zlPozice1 = -2;
        zlPozice2 = -2;
        zlPozice3 = -2;
        zlPozice4 = -2;
        cePozice1 = -3;
        cePozice2 = -3;
        cePozice3 = -3;
        cePozice4 = -3;
        moStart1();
        moStart2();
        moStart3();
        moStart4();
        zeStart1();
        zeStart2();
        zeStart3();
        zeStart4();
        zlStart1();
        zlStart2();
        zlStart3();
        zlStart4();
        ceStart1();
        ceStart2();
        ceStart3();
        ceStart4();
        boolean zeBoo1 = false;
        boolean zeBoo2 = false;
        boolean zeBoo3 = false;
        boolean zeBoo4 = false;
        boolean zlBoo1 = false;
        boolean zlBoo2 = false;
        boolean zlBoo3 = false;
        boolean zlBoo4 = false;
        boolean ceBoo1 = false;
        boolean ceBoo2 = false;
        boolean ceBoo3 = false;
        boolean ceBoo4 = false;
        znovu.setVisible(false);
        vyhra.setVisible(false);

    }

    @FXML
    private void moVyhod() {//Na konci kola modré barvy zkontroluje, jestli dvě figurky nestojí na stejném místě. Pokud ano figurku, jiné barvy než modrá, vrátí zpět na start.
        if (moPozice1 == zePozice1 | moPozice2 == zePozice1 | moPozice3 == zePozice1 | moPozice4 == zePozice1) {
            zePozice1 = -1;
            zeStart1();
            zeBoo1 = false;
        }
        if (moPozice1 == zePozice2 | moPozice2 == zePozice2 | moPozice3 == zePozice2 | moPozice4 == zePozice2) {
            zePozice2 = -1;
            zeStart2();
            zeBoo2 = false;
        }
        if (moPozice1 == zePozice3 | moPozice2 == zePozice3 | moPozice3 == zePozice3 | moPozice4 == zePozice3) {
            zePozice3 = -1;
            zeStart3();
            zeBoo3 = false;
        }
        if (moPozice1 == zePozice4 | moPozice2 == zePozice4 | moPozice3 == zePozice4 | moPozice4 == zePozice4) {
            zePozice4 = -1;
            zeStart4();
            zeBoo4 = false;
        }
        if (moPozice1 == cePozice1 | moPozice2 == cePozice1 | moPozice3 == cePozice1 | moPozice4 == cePozice1) {
            cePozice1 = -3;
            ceStart1();
            ceBoo1 = false;
        }
        if (moPozice1 == cePozice2 | moPozice2 == cePozice2 | moPozice3 == cePozice2 | moPozice4 == cePozice2) {
            cePozice2 = -3;
            ceStart2();
            ceBoo2 = false;
        }
        if (moPozice1 == cePozice3 | moPozice2 == cePozice3 | moPozice3 == cePozice3 | moPozice4 == cePozice3) {
            cePozice3 = -3;
            ceStart3();
            ceBoo3 = false;
        }
        if (moPozice1 == cePozice4 | moPozice2 == cePozice4 | moPozice3 == cePozice4 | moPozice4 == cePozice4) {
            cePozice4 = -3;
            ceStart4();
            ceBoo4 = false;
        }
        if (moPozice1 == zlPozice1 | moPozice2 == zlPozice1 | moPozice3 == zlPozice1 | moPozice4 == zlPozice1) {
            zlPozice1 = -2;
            zlStart1();
            zlBoo1 = false;
        }
        if (moPozice1 == zlPozice2 | moPozice2 == zlPozice2 | moPozice3 == zlPozice2 | moPozice4 == zlPozice2) {
            zlPozice2 = -2;
            zlStart2();
            zlBoo2 = false;
        }
        if (moPozice1 == zlPozice3 | moPozice2 == zlPozice3 | moPozice3 == zlPozice3 | moPozice4 == zlPozice3) {
            zlPozice3 = -2;
            zlStart3();
            zlBoo3 = false;
        }
        if (moPozice1 == zlPozice4 | moPozice2 == zlPozice4 | moPozice3 == zlPozice4 | moPozice4 == zlPozice4) {
            zlPozice4 = -2;
            zlStart4();
            zlBoo4 = false;
        }
    }

    @FXML
    private void zeVyhod() {//Na konci kola zelené barvy zkontroluje, jestli dvě figurky nestojí na stejném místě. Pokud ano figurku, jiné barvy než zelená, vrátí zpět na start.
        if (zePozice1 == moPozice1 | zePozice2 == moPozice1 | zePozice3 == moPozice1 | zePozice4 == moPozice1) {
            moPozice1 = 0;
            moStart1();
        }
        if (zePozice1 == moPozice2 | zePozice2 == moPozice2 | zePozice3 == moPozice2 | zePozice4 == moPozice2) {
            moPozice2 = 0;
            moStart2();
        }
        if (zePozice1 == moPozice3 | zePozice2 == moPozice3 | zePozice3 == moPozice3 | zePozice4 == moPozice3) {
            moPozice3 = 0;
            moStart3();
        }
        if (zePozice1 == moPozice4 | zePozice2 == moPozice4 | zePozice3 == moPozice4 | zePozice4 == moPozice4) {
            moPozice4 = 0;
            moStart4();
        }
        if (zePozice1 == cePozice1 | zePozice2 == cePozice1 | zePozice3 == cePozice1 | zePozice4 == cePozice1) {
            cePozice1 = -3;
            ceStart1();
            ceBoo1 = false;
        }
        if (zePozice1 == cePozice2 | zePozice2 == cePozice2 | zePozice3 == cePozice2 | zePozice4 == cePozice2) {
            cePozice2 = -3;
            ceStart2();
            ceBoo2 = false;
        }
        if (zePozice1 == cePozice3 | zePozice2 == cePozice3 | zePozice3 == cePozice3 | zePozice4 == cePozice3) {
            cePozice3 = -3;
            ceStart3();
            ceBoo3 = false;
        }
        if (zePozice1 == cePozice4 | zePozice2 == cePozice4 | zePozice3 == cePozice4 | zePozice4 == cePozice4) {
            cePozice4 = -3;
            ceStart4();
            ceBoo4 = false;
        }
        if (zePozice1 == zlPozice1 | zePozice2 == zlPozice1 | zePozice3 == zlPozice1 | zePozice4 == zlPozice1) {
            zlPozice1 = -2;
            zlStart1();
            zlBoo1 = false;
        }
        if (zePozice1 == zlPozice2 | zePozice2 == zlPozice2 | zePozice3 == zlPozice2 | zePozice4 == zlPozice2) {
            zlPozice2 = -2;
            zlStart2();
            zlBoo2 = false;
        }
        if (zePozice1 == zlPozice3 | zePozice2 == zlPozice3 | zePozice3 == zlPozice3 | zePozice4 == zlPozice3) {
            zlPozice3 = -2;
            zlStart3();
            zlBoo3 = false;
        }
        if (zePozice1 == zlPozice4 | zePozice2 == zlPozice4 | zePozice3 == zlPozice4 | zePozice4 == zlPozice4) {
            zlPozice4 = -2;
            zlStart4();
            zlBoo4 = false;
        }
    }

    @FXML
    private void zlVyhod() {//Na konci kola žluté barvy zkontroluje, jestli dvě figurky nestojí na stejném místě. Pokud ano figurku, jiné barvy než žlutá, vrátí zpět na start.
        if (zlPozice1 == moPozice1 | zlPozice2 == moPozice1 | zlPozice3 == moPozice1 | zlPozice4 == moPozice1) {
            moPozice1 = 0;
            moStart1();
        }
        if (zlPozice1 == moPozice2 | zlPozice2 == moPozice2 | zlPozice3 == moPozice2 | zlPozice4 == moPozice2) {
            moPozice2 = 0;
            moStart2();
        }
        if (zlPozice1 == moPozice3 | zlPozice2 == moPozice3 | zlPozice3 == moPozice3 | zlPozice4 == moPozice3) {
            moPozice3 = 0;
            moStart3();
        }
        if (zlPozice1 == moPozice4 | zlPozice2 == moPozice4 | zlPozice3 == moPozice4 | zlPozice4 == moPozice4) {
            moPozice4 = 0;
            moStart4();
        }
        if (zlPozice1 == cePozice1 | zlPozice2 == cePozice1 | zlPozice3 == cePozice1 | zlPozice4 == cePozice1) {
            cePozice1 = -3;
            ceStart1();
            ceBoo1 = false;
        }
        if (zlPozice1 == cePozice2 | zlPozice2 == cePozice2 | zlPozice3 == cePozice2 | zlPozice4 == cePozice2) {
            cePozice2 = -3;
            ceStart2();
            ceBoo2 = false;
        }
        if (zlPozice1 == cePozice3 | zlPozice2 == cePozice3 | zlPozice3 == cePozice3 | zlPozice4 == cePozice3) {
            cePozice3 = -3;
            ceStart3();
            ceBoo3 = false;
        }
        if (zlPozice1 == cePozice4 | zlPozice2 == cePozice4 | zlPozice3 == cePozice4 | zlPozice4 == cePozice4) {
            cePozice4 = -3;
            ceStart4();
            ceBoo4 = false;
        }
        if (zlPozice1 == zePozice1 | zlPozice2 == zePozice1 | zlPozice3 == zePozice1 | zlPozice4 == zePozice1) {
            zePozice1 = -1;
            zeStart1();
            zeBoo1 = false;
        }
        if (zlPozice1 == zePozice2 | zlPozice2 == zePozice2 | zlPozice3 == zePozice2 | zlPozice4 == zePozice2) {
            zePozice2 = -1;
            zeStart2();
            zeBoo2 = false;
        }
        if (zlPozice1 == zePozice3 | zlPozice2 == zePozice3 | zlPozice3 == zePozice3 | zlPozice4 == zePozice3) {
            zePozice3 = -1;
            zeStart3();
            zeBoo3 = false;
        }
        if (zlPozice1 == zePozice4 | zlPozice2 == zePozice4 | zlPozice3 == zePozice4 | zlPozice4 == zePozice4) {
            zePozice4 = -1;
            zeStart4();
            zeBoo4 = false;
        }

    }

    @FXML
    private void ceVyhod() {//Na konci kola červené barvy zkontroluje, jestli dvě figurky nestojí na stejném místě. Pokud ano figurku, jiné barvy než řervená, vrátí zpět na start.
        if (cePozice1 == moPozice1 | cePozice2 == moPozice1 | cePozice3 == moPozice1 | cePozice4 == moPozice1) {
            moPozice1 = 0;
            moStart1();
        }
        if (cePozice1 == moPozice2 | cePozice2 == moPozice2 | cePozice3 == moPozice2 | cePozice4 == moPozice2) {
            moPozice2 = 0;
            moStart2();
        }
        if (cePozice1 == moPozice3 | cePozice2 == moPozice3 | cePozice3 == moPozice3 | cePozice4 == moPozice3) {
            moPozice3 = 0;
            moStart3();
        }
        if (cePozice1 == moPozice4 | cePozice2 == moPozice4 | cePozice3 == moPozice4 | cePozice4 == moPozice4) {
            moPozice4 = 0;
            moStart4();
        }
        if (cePozice1 == zlPozice1 | cePozice2 == zlPozice1 | cePozice3 == zlPozice1 | cePozice4 == zlPozice1) {
            zlPozice1 = -2;
            zlStart1();
            zlBoo1 = false;
        }
        if (cePozice1 == zlPozice2 | cePozice2 == zlPozice2 | cePozice3 == zlPozice2 | cePozice4 == zlPozice2) {
            zlPozice2 = -2;
            zlStart2();
            zlBoo2 = false;
        }
        if (cePozice1 == zlPozice3 | cePozice2 == zlPozice3 | cePozice3 == zlPozice3 | cePozice4 == zlPozice3) {
            zlPozice3 = -2;
            zlStart3();
            zlBoo3 = false;
        }
        if (cePozice1 == zlPozice4 | cePozice2 == zlPozice4 | cePozice3 == zlPozice4 | cePozice4 == zlPozice4) {
            zlPozice4 = -2;
            zlStart4();
            zlBoo4 = false;
        }
        if (cePozice1 == zePozice1 | cePozice2 == zePozice1 | cePozice3 == zePozice1 | cePozice4 == zePozice1) {
            zePozice1 = -1;
            zeStart1();
            zeBoo1 = false;
        }
        if (cePozice1 == zePozice2 | cePozice2 == zePozice2 | cePozice3 == zePozice2 | cePozice4 == zePozice2) {
            zePozice2 = -1;
            zeStart2();
            zeBoo2 = false;
        }
        if (cePozice1 == zePozice3 | cePozice2 == zePozice3 | cePozice3 == zePozice3 | cePozice4 == zePozice3) {
            zePozice3 = -1;
            zeStart3();
            zeBoo3 = false;
        }
        if (cePozice1 == zePozice4 | cePozice2 == zePozice4 | cePozice3 == zePozice4 | cePozice4 == zePozice4) {
            zePozice4 = -1;
            zeStart4();
            zeBoo4 = false;
        }
    }

    @FXML
    private void moPosunDal() {
        moVyhod();
        if (moPozice1 == 42 & moPozice2 == 42 & moPozice3 == 42 & moPozice4 == 42) {//Zkontroluje jestli modrá nevyhrává.
            moKostka.setVisible(false);
            vyhra.setEditable(false);
            vyhra.setVisible(true);
            znovu.setVisible(true);
            vyhra.setText("Modrá vyhrává");
        } else {                                         //Posune kostku zelené.
            moKostka.setVisible(false);
            zeKostka.setVisible(true);
            zlKostka.setVisible(false);
            ceKostka.setVisible(false);
        }
    }

    @FXML
    private void zePosunDal() {
        zeVyhod();
        if (zePozice1 == -8 & zePozice2 == -8 & zePozice3 == -8 & zePozice4 == -8) {//Zkontroluje jestli zelená nevyhrává.
            zeKostka.setVisible(false);
            vyhra.setVisible(true);
            vyhra.setEditable(false);
            znovu.setVisible(true);
            vyhra.setText("Zelená vyhrává");
        } else {                                  //Posune kostku žluté.
            moKostka.setVisible(false);
            zeKostka.setVisible(false);
            zlKostka.setVisible(true);
            ceKostka.setVisible(false);
        }
    }

    @FXML
    private void zlPosunDal() {
        zlVyhod();
        if (zlPozice1 == -9 & zlPozice2 == -9 & zlPozice3 == -9 & zlPozice4 == -9) {//Zkontroluje jestli žlutá nevyhrává.
            zlKostka.setVisible(false);
            vyhra.setVisible(true);
            vyhra.setEditable(false);
            znovu.setVisible(true);
            vyhra.setText("Žlutá vyhrává");
        } else {                                 //Posune kostku červené.
            moKostka.setVisible(false);
            zeKostka.setVisible(false);
            zlKostka.setVisible(false);
            ceKostka.setVisible(true);
        }
    }

    @FXML
    private void cePosunDal() {
        ceVyhod();
        if (cePozice1 == -10 & cePozice2 == -10 & cePozice3 == -10 & cePozice4 == -10) {//Zkontroluje jestli červená nevyhrává.
            ceKostka.setVisible(false);
            vyhra.setVisible(true);
            vyhra.setEditable(false);
            znovu.setVisible(true);
            vyhra.setText("Červená vyhrává");
        } else {                                                //Posune kostku modré.
            moKostka.setVisible(true);
            zeKostka.setVisible(false);
            zlKostka.setVisible(false);
            ceKostka.setVisible(false);
        }
    }

    @FXML
    private void moHod(ActionEvent event) {

        if (moPozice1 == 0) {//Pokud první modrá figurka je na startu hodí kostkou.
            moPozice1 = random();
            if (moPozice1 == 6) {//Pokud padne 6 posune figurku na hrací pole.
                modTel1.setLayoutX(hraciPol[0][0]);
                modTel1.setLayoutY(hraciPol[0][1]);
                modHla1.setLayoutX(hraciPol[0][0]);
                modHla1.setLayoutY(hraciPol[0][1] - 35);
                moPozice1 = 1;
                moPosunDal();

            } else {//Pokud nepadne 6 ponechá figurku na startu mimo hrací pole. 
                moPozice1 = 0;
                moPosunDal();

            }
        } else {
            if (moPozice1 < 41) {//Pokud je první modrá figurka v hracím poli hodí kostkou
                moPozice1 = moPozice1 + random();
                if (moPozice1 > 40) {//Pokud by hození kostkou umístilo figurku mimo hrací pole postaví ji do cíle
                    moDom1();
                    moPosunDal();
                } else {//Posune figurku na místo po hození kostkou.
                    modTel1.setLayoutX(hraciPol[moPozice1 - 1][0]);
                    modTel1.setLayoutY(hraciPol[moPozice1 - 1][1]);
                    modHla1.setLayoutX(hraciPol[moPozice1 - 1][0]);
                    modHla1.setLayoutY(hraciPol[moPozice1 - 1][1] - 35);
                    moPosunDal();

                }

            } else {
                if (moPozice1 > 40) {//Pokud je první modrá figurka v cíli a druhá modrá figurka mimo pole hodí kostkou
                    if (moPozice2 == 0) {
                        moPozice2 = random();
                        if (moPozice2 == 6) {//Pokud padne 6 posune figurku na hrací pole.
                            modTel2.setLayoutX(hraciPol[0][0]);
                            modTel2.setLayoutY(hraciPol[0][1]);
                            modHla2.setLayoutX(hraciPol[0][0]);
                            modHla2.setLayoutY(hraciPol[0][1] - 35);
                            moPozice2 = 1;
                            moPosunDal();
                            return;
                        } else {//Pokud nepadne 6 ponechá figurku na startu mimo hrací pole. 
                            moPozice2 = 0;
                            moPosunDal();
                            return;
                        }
                    }
                    if (moPozice2 < 41) {//Pokud je druhá modrá figurka v hracím poli hodí kostkou
                        moPozice2 = moPozice2 + random();
                        if (moPozice2 > 40) {//Pokud by hození kostkou umístilo figurku mimo hrací pole postaví ji do cíle
                            moDom2();
                            moPosunDal();
                        } else {//Posune figurku na místo po hození kostkou.
                            modTel2.setLayoutX(hraciPol[moPozice2 - 1][0]);
                            modTel2.setLayoutY(hraciPol[moPozice2 - 1][1]);
                            modHla2.setLayoutX(hraciPol[moPozice2 - 1][0]);
                            modHla2.setLayoutY(hraciPol[moPozice2 - 1][1] - 35);
                            moPosunDal();

                        }
                    } else {
                        if (moPozice2 > 40) {//Pokud je druhá modrá figurka v cíli a třetí modrá figurka mimo pole hodí kostkou
                            if (moPozice3 == 0) {
                                moPozice3 = random();
                                if (moPozice3 == 6) {//Pokud padne 6 posune figurku na hrací pole.
                                    modTel3.setLayoutX(hraciPol[0][0]);
                                    modTel3.setLayoutY(hraciPol[0][1]);
                                    modHla3.setLayoutX(hraciPol[0][0]);
                                    modHla3.setLayoutY(hraciPol[0][1] - 35);
                                    moPozice3 = 1;
                                    moPosunDal();
                                    return;
                                } else {//Pokud nepadne 6 ponechá figurku na startu mimo hrací pole. 
                                    moPozice3 = 0;
                                    moPosunDal();
                                    return;
                                }
                            }
                            if (moPozice3 < 41) {//Pokud je třetí modrá figurka v hracím poli hodí kostkou
                                moPozice3 = moPozice3 + random();
                                if (moPozice3 > 40) {//Pokud by hození kostkou umístilo figurku mimo hrací pole postaví ji do cíle
                                    moDom3();
                                    moPosunDal();
                                } else {//Posune figurku na místo po hození kostkou.
                                    modTel3.setLayoutX(hraciPol[moPozice3 - 1][0]);
                                    modTel3.setLayoutY(hraciPol[moPozice3 - 1][1]);
                                    modHla3.setLayoutX(hraciPol[moPozice3 - 1][0]);
                                    modHla3.setLayoutY(hraciPol[moPozice3 - 1][1] - 35);
                                    moPosunDal();
                                    return;
                                }
                            } else {
                                if (moPozice3 > 40) {//Pokud je třetí modrá figurka v cíli a čtvrtá modrá figurka mimo pole hodí kostkou
                                    if (moPozice4 == 0) {
                                        moPozice4 = random();
                                        if (moPozice4 == 6) {//Pokud padne 6 posune figurku na hrací pole.
                                            modTel4.setLayoutX(hraciPol[0][0]);
                                            modTel4.setLayoutY(hraciPol[0][1]);
                                            modHla4.setLayoutX(hraciPol[0][0]);
                                            modHla4.setLayoutY(hraciPol[0][1] - 35);
                                            moPozice4 = 1;
                                            moPosunDal();
                                            return;
                                        } else {//Pokud nepadne 6 ponechá figurku na startu mimo hrací pole. 
                                            moPozice4 = 0;
                                            moPosunDal();
                                            return;
                                        }
                                    }
                                    if (moPozice4 < 41) {//Pokud je čtvrtá modrá figurka v hracím poli hodí kostkou
                                        moPozice4 = moPozice4 + random();
                                        if (moPozice4 > 40) {//Pokud by hození kostkou umístilo figurku mimo hrací pole postaví ji do cíle
                                            moDom4();
                                            moPosunDal();
                                        } else {//Posune figurku na místo po hození kostkou.
                                            modTel4.setLayoutX(hraciPol[moPozice4 - 1][0]);
                                            modTel4.setLayoutY(hraciPol[moPozice4 - 1][1]);
                                            modHla4.setLayoutX(hraciPol[moPozice4 - 1][0]);
                                            modHla4.setLayoutY(hraciPol[moPozice4 - 1][1] - 35);
                                            moPosunDal();
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @FXML
    private void zeHod(ActionEvent event) {

        if (zePozice1 == -1) {//Pokud první zelená figurka je na startu hodí kostkou.
            zePozice1 = random();
            if (zePozice1 == 6) {//Pokud padne 6 posune figurku na hrací pole.
                zelTel1.setLayoutX(hraciPol[10][0]);
                zelTel1.setLayoutY(hraciPol[10][1]);
                zelHla1.setLayoutX(hraciPol[10][0]);
                zelHla1.setLayoutY(hraciPol[10][1] - 35);
                zePozice1 = 11;
                zePosunDal();

            } else {//Pokud nepadne 6 ponechá figurku na startu mimo hrací pole. 
                zePozice1 = -1;
                zePosunDal();

            }
        } else {
            if (zePozice1 < 41 & zePozice1 > -1) {//Pokud je první zelená figurka v hracím poli hodí kostkou
                zePozice1 = zePozice1 + random();
                if (zeBoo1 == true & zePozice1 > 10) {//Pokud by hození kostkou umístilo figurku mimo hrací pole postaví ji do cíle
                    zeDom1();
                    zePosunDal();
                } else {
                    if (zePozice1 > 40) {//Posune figurku na místo po hození kostkou.
                        zePozice1 = zePozice1 - 40;
                        zelTel1.setLayoutX(hraciPol[zePozice1 - 1][0]);
                        zelTel1.setLayoutY(hraciPol[zePozice1 - 1][1]);
                        zelHla1.setLayoutX(hraciPol[zePozice1 - 1][0]);
                        zelHla1.setLayoutY(hraciPol[zePozice1 - 1][1] - 35);
                        zeBoo1 = true;
                        zePosunDal();

                    } else {//Posune figurku na místo po hození kostkou.
                        zelTel1.setLayoutX(hraciPol[zePozice1 - 1][0]);
                        zelTel1.setLayoutY(hraciPol[zePozice1 - 1][1]);
                        zelHla1.setLayoutX(hraciPol[zePozice1 - 1][0]);
                        zelHla1.setLayoutY(hraciPol[zePozice1 - 1][1] - 35);
                        zePosunDal();

                    }
                }
            } else {//Pokud je první zelená figurka v cíli a druhá zelená figurka mimo pole hodí kostkou
                if (zePozice1 < -1) {
                    if (zePozice2 == -1) {
                        zePozice2 = random();
                        if (zePozice2 == 6) {//Pokud padne 6 posune figurku na hrací pole.
                            zelTel2.setLayoutX(hraciPol[10][0]);
                            zelTel2.setLayoutY(hraciPol[10][1]);
                            zelHla2.setLayoutX(hraciPol[10][0]);
                            zelHla2.setLayoutY(hraciPol[10][1] - 35);
                            zePozice2 = 11;
                            zePosunDal();
                            return;
                        } else {//Pokud nepadne 6 ponechá figurku na startu mimo hrací pole. 
                            zePozice2 = -1;
                            zePosunDal();
                            return;
                        }
                    }
                    if (zePozice2 < 41 & zePozice2 > -1) {//Pokud je druhá zelená figurka v hracím poli hodí kostkou
                        zePozice2 = zePozice2 + random();
                        if (zeBoo2 == true & zePozice2 > 10) {//Pokud by hození kostkou umístilo figurku mimo hrací pole postaví ji do cíle
                            zeDom2();
                            zePosunDal();
                        } else {
                            if (zePozice2 > 40) {//Posune figurku na místo po hození kostkou.
                                zePozice2 = zePozice2 - 40;
                                zelTel2.setLayoutX(hraciPol[zePozice2 - 1][0]);
                                zelTel2.setLayoutY(hraciPol[zePozice2 - 1][1]);
                                zelHla2.setLayoutX(hraciPol[zePozice2 - 1][0]);
                                zelHla2.setLayoutY(hraciPol[zePozice2 - 1][1] - 35);
                                zeBoo2 = true;
                                zePosunDal();

                            } else {//Posune figurku na místo po hození kostkou.
                                zelTel2.setLayoutX(hraciPol[zePozice2 - 1][0]);
                                zelTel2.setLayoutY(hraciPol[zePozice2 - 1][1]);
                                zelHla2.setLayoutX(hraciPol[zePozice2 - 1][0]);
                                zelHla2.setLayoutY(hraciPol[zePozice2 - 1][1] - 35);
                                zePosunDal();
                            }
                        }
                    } else {//Pokud je druhá zelená figurka v cíli a třetí zelená figurka mimo pole hodí kostkou
                        if (zePozice2 < -1) {
                            if (zePozice3 == -1) {
                                zePozice3 = random();
                                if (zePozice3 == 6) {//Pokud padne 6 posune figurku na hrací pole.
                                    zelTel3.setLayoutX(hraciPol[10][0]);
                                    zelTel3.setLayoutY(hraciPol[10][1]);
                                    zelHla3.setLayoutX(hraciPol[10][0]);
                                    zelHla3.setLayoutY(hraciPol[10][1] - 35);
                                    zePozice3 = 11;
                                    zePosunDal();
                                    return;
                                } else {//Pokud nepadne 6 ponechá figurku na startu mimo hrací pole. 
                                    zePozice3 = -1;
                                    zePosunDal();
                                    return;
                                }
                            }
                            if (zePozice3 < 41 & zePozice3 > -1) {//Pokud je třetí zelená figurka v hracím poli hodí kostkou
                                zePozice3 = zePozice3 + random();
                                if (zeBoo3 == true & zePozice3 > 10) {//Pokud by hození kostkou umístilo figurku mimo hrací pole postaví ji do cíle
                                    zeDom3();
                                    zePosunDal();
                                } else {
                                    if (zePozice3 > 40) {//Posune figurku na místo po hození kostkou.
                                        zePozice3 = zePozice3 - 40;
                                        zelTel3.setLayoutX(hraciPol[zePozice3 - 1][0]);
                                        zelTel3.setLayoutY(hraciPol[zePozice3 - 1][1]);
                                        zelHla3.setLayoutX(hraciPol[zePozice3 - 1][0]);
                                        zelHla3.setLayoutY(hraciPol[zePozice3 - 1][1] - 35);
                                        zeBoo3 = true;
                                        zePosunDal();

                                    } else {//Posune figurku na místo po hození kostkou.
                                        zelTel3.setLayoutX(hraciPol[zePozice3 - 1][0]);
                                        zelTel3.setLayoutY(hraciPol[zePozice3 - 1][1]);
                                        zelHla3.setLayoutX(hraciPol[zePozice3 - 1][0]);
                                        zelHla3.setLayoutY(hraciPol[zePozice3 - 1][1] - 35);
                                        zePosunDal();
                                    }
                                }
                            } else {//Pokud je třetí zelená figurka v cíli a čtvrtá zelená figurka mimo pole hodí kostkou
                                if (zePozice3 < -1) {
                                    if (zePozice4 == -1) {
                                        zePozice4 = random();
                                        if (zePozice4 == 6) {//Pokud padne 6 posune figurku na hrací pole.
                                            zelTel4.setLayoutX(hraciPol[10][0]);
                                            zelTel4.setLayoutY(hraciPol[10][1]);
                                            zelHla4.setLayoutX(hraciPol[10][0]);
                                            zelHla4.setLayoutY(hraciPol[10][1] - 35);
                                            zePozice4 = 11;
                                            zePosunDal();
                                            return;
                                        } else {//Pokud nepadne 6 ponechá figurku na startu mimo hrací pole. 
                                            zePozice4 = -1;
                                            zePosunDal();
                                            return;
                                        }
                                    }
                                    if (zePozice4 < 41 & zePozice4 > -1) {//Pokud je čtvrtá zelená figurka v hracím poli hodí kostkou
                                        zePozice4 = zePozice4 + random();
                                        if (zeBoo4 == true & zePozice4 > 10) {//Pokud by hození kostkou umístilo figurku mimo hrací pole postaví ji do cíle
                                            zeDom4();
                                            zePosunDal();
                                        } else {//Posune figurku na místo po hození kostkou.
                                            if (zePozice4 > 40) {
                                                zePozice4 = zePozice4 - 40;
                                                zelTel4.setLayoutX(hraciPol[zePozice4 - 1][0]);
                                                zelTel4.setLayoutY(hraciPol[zePozice4 - 1][1]);
                                                zelHla4.setLayoutX(hraciPol[zePozice4 - 1][0]);
                                                zelHla4.setLayoutY(hraciPol[zePozice4 - 1][1] - 35);
                                                zeBoo4 = true;
                                                zePosunDal();

                                            } else {//Posune figurku na místo po hození kostkou.
                                                zelTel4.setLayoutX(hraciPol[zePozice4 - 1][0]);
                                                zelTel4.setLayoutY(hraciPol[zePozice4 - 1][1]);
                                                zelHla4.setLayoutX(hraciPol[zePozice4 - 1][0]);
                                                zelHla4.setLayoutY(hraciPol[zePozice4 - 1][1] - 35);
                                                zePosunDal();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @FXML
    private void zlHod(ActionEvent event) {
        if (zlPozice1 == -2) {//Pokud je první žlutá figurka je na startu hodí kostkou.
            zlPozice1 = random();
            if (zlPozice1 == 6) {//Pokud padne 6 posune figurku na hrací pole.
                zluTel1.setLayoutX(hraciPol[20][0]);
                zluTel1.setLayoutY(hraciPol[20][1]);
                zluHla1.setLayoutX(hraciPol[20][0]);
                zluHla1.setLayoutY(hraciPol[20][1] - 35);
                zlPozice1 = 21;
                zlPosunDal();

            } else {//Pokud nepadne 6 ponechá figurku na startu mimo hrací pole. 
                zlPozice1 = -2;
                zlPosunDal();

            }
        } else {
            if (zlPozice1 < 41 & zlPozice1 > -1) {//Pokud je první žlutá figurka v hracím poli hodí kostkou
                zlPozice1 = zlPozice1 + random();
                if (zlBoo1 == true & zlPozice1 > 20) {//Pokud by hození kostkou umístilo figurku mimo hrací pole postaví ji do cíle
                    zlDom1();
                    zlPosunDal();
                } else {
                    if (zlPozice1 > 40) {//Posune figurku na místo po hození kostkou.
                        zlPozice1 = zlPozice1 - 40;
                        zluTel1.setLayoutX(hraciPol[zlPozice1 - 1][0]);
                        zluTel1.setLayoutY(hraciPol[zlPozice1 - 1][1]);
                        zluHla1.setLayoutX(hraciPol[zlPozice1 - 1][0]);
                        zluHla1.setLayoutY(hraciPol[zlPozice1 - 1][1] - 35);
                        zlBoo1 = true;
                        zlPosunDal();

                    } else {//Posune figurku na místo po hození kostkou.
                        zluTel1.setLayoutX(hraciPol[zlPozice1 - 1][0]);
                        zluTel1.setLayoutY(hraciPol[zlPozice1 - 1][1]);
                        zluHla1.setLayoutX(hraciPol[zlPozice1 - 1][0]);
                        zluHla1.setLayoutY(hraciPol[zlPozice1 - 1][1] - 35);
                        zlPosunDal();
                    }
                }

            } else {
                if (zlPozice1 < -1) {//Pokud je první žlutá figurka v cíli a druhá žlutá figurka mimo pole hodí kostkou
                    if (zlPozice2 == -2) {
                        zlPozice2 = random();
                        if (zlPozice2 == 6) {//Pokud padne 6 posune figurku na hrací pole.
                            zluTel2.setLayoutX(hraciPol[20][0]);
                            zluTel2.setLayoutY(hraciPol[20][1]);
                            zluHla2.setLayoutX(hraciPol[20][0]);
                            zluHla2.setLayoutY(hraciPol[20][1] - 35);
                            zlPozice2 = 21;
                            zlPosunDal();
                            return;
                        } else {//Pokud nepadne 6 ponechá figurku na startu mimo hrací pole. 
                            zlPozice2 = -2;
                            zlPosunDal();
                            return;
                        }
                    }
                    if (zlPozice2 < 41 & zlPozice2 > -1) {//Pokud je druhá žlutá figurka v hracím poli hodí kostkou
                        zlPozice2 = zlPozice2 + random();
                        if (zlBoo2 == true & zlPozice2 > 20) {//Pokud by hození kostkou umístilo figurku mimo hrací pole postaví ji do cíle
                            zlDom2();
                            zlPosunDal();
                        } else {
                            if (zlPozice2 > 40) {//Posune figurku na místo po hození kostkou.
                                zlPozice2 = zlPozice2 - 40;
                                zluTel2.setLayoutX(hraciPol[zlPozice2 - 1][0]);
                                zluTel2.setLayoutY(hraciPol[zlPozice2 - 1][1]);
                                zluHla2.setLayoutX(hraciPol[zlPozice2 - 1][0]);
                                zluHla2.setLayoutY(hraciPol[zlPozice2 - 1][1] - 35);
                                zlBoo2 = true;
                                zlPosunDal();

                            } else {//Posune figurku na místo po hození kostkou.
                                zluTel2.setLayoutX(hraciPol[zlPozice2 - 1][0]);
                                zluTel2.setLayoutY(hraciPol[zlPozice2 - 1][1]);
                                zluHla2.setLayoutX(hraciPol[zlPozice2 - 1][0]);
                                zluHla2.setLayoutY(hraciPol[zlPozice2 - 1][1] - 35);
                                zlPosunDal();
                            }
                        }
                    } else {
                        if (zlPozice2 < -1) {//Pokud je druhá žlutá figurka v cíli a třetí žlutá figurka mimo pole hodí kostkou
                            if (zlPozice3 == -2) {
                                zlPozice3 = random();
                                if (zlPozice3 == 6) {//Pokud padne 6 posune figurku na hrací pole.
                                    zluTel3.setLayoutX(hraciPol[20][0]);
                                    zluTel3.setLayoutY(hraciPol[20][1]);
                                    zluHla3.setLayoutX(hraciPol[20][0]);
                                    zluHla3.setLayoutY(hraciPol[20][1] - 35);
                                    zlPozice3 = 21;
                                    zlPosunDal();
                                    return;
                                } else {//Pokud nepadne 6 ponechá figurku na startu mimo hrací pole. 
                                    zlPozice3 = -2;
                                    zlPosunDal();
                                    return;
                                }
                            }
                            if (zlPozice3 < 41 & zlPozice3 > -1) {//Pokud je třetí žlutá figurka v hracím poli hodí kostkou
                                zlPozice3 = zlPozice3 + random();
                                if (zlBoo3 == true & zlPozice3 > 20) {//Pokud by hození kostkou umístilo figurku mimo hrací pole postaví ji do cíle
                                    zlDom3();
                                    zlPosunDal();
                                } else {
                                    if (zlPozice3 > 40) {//Posune figurku na místo po hození kostkou.
                                        zlPozice3 = zlPozice3 - 40;
                                        zluTel3.setLayoutX(hraciPol[zlPozice3 - 1][0]);
                                        zluTel3.setLayoutY(hraciPol[zlPozice3 - 1][1]);
                                        zluHla3.setLayoutX(hraciPol[zlPozice3 - 1][0]);
                                        zluHla3.setLayoutY(hraciPol[zlPozice3 - 1][1] - 35);
                                        zlBoo3 = true;
                                        zlPosunDal();

                                    } else {//Posune figurku na místo po hození kostkou.
                                        zluTel3.setLayoutX(hraciPol[zlPozice3 - 1][0]);
                                        zluTel3.setLayoutY(hraciPol[zlPozice3 - 1][1]);
                                        zluHla3.setLayoutX(hraciPol[zlPozice3 - 1][0]);
                                        zluHla3.setLayoutY(hraciPol[zlPozice3 - 1][1] - 35);
                                        zlPosunDal();
                                    }
                                }
                            } else {
                                if (zlPozice3 < -1) {//Pokud je třetí žlutá figurka v cíli a čtvrtá žlutá figurka mimo pole hodí kostkou
                                    if (zlPozice4 == -2) {
                                        zlPozice4 = random();
                                        if (zlPozice4 == 6) {//Pokud padne 6 posune figurku na hrací pole.
                                            zluTel4.setLayoutX(hraciPol[20][0]);
                                            zluTel4.setLayoutY(hraciPol[20][1]);
                                            zluHla4.setLayoutX(hraciPol[20][0]);
                                            zluHla4.setLayoutY(hraciPol[20][1] - 35);
                                            zlPozice4 = 21;
                                            zlPosunDal();
                                            return;
                                        } else {//Pokud nepadne 6 ponechá figurku na startu mimo hrací pole. 
                                            zlPozice4 = -2;
                                            zlPosunDal();
                                            return;
                                        }
                                    }
                                    if (zlPozice4 < 41 & zlPozice4 > -1) {//Pokud je čtvrtá žlutá figurka v hracím poli hodí kostkou
                                        zlPozice4 = zlPozice4 + random();
                                        if (zlBoo4 == true & zlPozice4 > 20) {//Pokud by hození kostkou umístilo figurku mimo hrací pole postaví ji do cíle
                                            zlDom4();
                                            zlPosunDal();
                                        } else {
                                            if (zlPozice4 > 40) {//Posune figurku na místo po hození kostkou.
                                                zlPozice4 = zlPozice4 - 40;
                                                zluTel4.setLayoutX(hraciPol[zlPozice4 - 1][0]);
                                                zluTel4.setLayoutY(hraciPol[zlPozice4 - 1][1]);
                                                zluHla4.setLayoutX(hraciPol[zlPozice4 - 1][0]);
                                                zluHla4.setLayoutY(hraciPol[zlPozice4 - 1][1] - 35);
                                                zlBoo4 = true;
                                                zlPosunDal();

                                            } else {//Posune figurku na místo po hození kostkou.
                                                zluTel4.setLayoutX(hraciPol[zlPozice4 - 1][0]);
                                                zluTel4.setLayoutY(hraciPol[zlPozice4 - 1][1]);
                                                zluHla4.setLayoutX(hraciPol[zlPozice4 - 1][0]);
                                                zluHla4.setLayoutY(hraciPol[zlPozice4 - 1][1] - 35);
                                                zlPosunDal();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @FXML
    private void ceHod(ActionEvent event) {
        int xd = 4;
        if (cePozice1 == -3) {//Pokud první červená figurka je na satrtu hodí kostkou
            cePozice1 = random();
            if (cePozice1 == 6) {//Pokud padne 6 posune figurku na hrací pole.
                cerTel1.setLayoutX(hraciPol[30][0]);
                cerTel1.setLayoutY(hraciPol[30][1]);
                cerHla1.setLayoutX(hraciPol[30][0]);
                cerHla1.setLayoutY(hraciPol[30][1] - 35);
                cePozice1 = 31;
                cePosunDal();

            } else {//Pokud nepadne 6 ponechá figurku na startu mimo hrací pole. 
                cePozice1 = -3;
                cePosunDal();

            }
        } else {
            if (cePozice1 < 41 & cePozice1 > -1) {//Pokud je první červená figurka v hracím poli hodí kostkou
                cePozice1 = cePozice1 + random();
                if (ceBoo1 == true & cePozice1 > 30) {//Pokud by hození kostkou umístilo figurku mimo hrací pole postaví ji do cíle
                    ceDom1();
                    cePosunDal();
                } else {
                    if (cePozice1 > 40) {//Posune figurku na místo po hození kostkou.
                        cePozice1 = cePozice1 - 40;
                        cerTel1.setLayoutX(hraciPol[cePozice1 - 1][0]);
                        cerTel1.setLayoutY(hraciPol[cePozice1 - 1][1]);
                        cerHla1.setLayoutX(hraciPol[cePozice1 - 1][0]);
                        cerHla1.setLayoutY(hraciPol[cePozice1 - 1][1] - 35);
                        ceBoo1 = true;
                        cePosunDal();

                    } else {//Posune figurku na místo po hození kostkou.
                        cerTel1.setLayoutX(hraciPol[cePozice1 - 1][0]);
                        cerTel1.setLayoutY(hraciPol[cePozice1 - 1][1]);
                        cerHla1.setLayoutX(hraciPol[cePozice1 - 1][0]);
                        cerHla1.setLayoutY(hraciPol[cePozice1 - 1][1] - 35);
                        cePosunDal();
                    }
                }

            } else {
                if (cePozice1 < -1) {//Pokud je první červená figurka v cíli a druhá červená figurka mimo pole hodí kostkou.
                    if (cePozice2 == -3) {
                        cePozice2 = random();
                        if (cePozice2 == 6) {//Pokud padne 6 posune figurku na hrací pole.
                            cerTel2.setLayoutX(hraciPol[30][0]);
                            cerTel2.setLayoutY(hraciPol[30][1]);
                            cerHla2.setLayoutX(hraciPol[30][0]);
                            cerHla2.setLayoutY(hraciPol[30][1] - 35);
                            cePozice2 = 31;
                            cePosunDal();
                            return;
                        } else {//Pokud nepadne 6 ponechá figurku na startu mimo hrací pole. 
                            cePozice2 = -3;
                            cePosunDal();
                            return;
                        }
                    }
                    if (cePozice2 < 41 & cePozice2 > -1) {//Pokud je druhá červená figurka v hracím poli hodí kostkou
                        cePozice2 = cePozice2 + random();
                        if (ceBoo2 == true & cePozice2 > 30) {//Pokud by hození kostkou umístilo figurku mimo hrací pole postaví ji do cíle
                            ceDom2();
                            cePosunDal();
                        } else {
                            if (cePozice2 > 40) {//Posune figurku na místo po hození kostkou.
                                cePozice2 = cePozice2 - 40;
                                cerTel2.setLayoutX(hraciPol[cePozice2 - 1][0]);
                                cerTel2.setLayoutY(hraciPol[cePozice2 - 1][1]);
                                cerHla2.setLayoutX(hraciPol[cePozice2 - 1][0]);
                                cerHla2.setLayoutY(hraciPol[cePozice2 - 1][1] - 35);
                                ceBoo2 = true;
                                cePosunDal();

                            } else {//Posune figurku na místo po hození kostkou.
                                cerTel2.setLayoutX(hraciPol[cePozice2 - 1][0]);
                                cerTel2.setLayoutY(hraciPol[cePozice2 - 1][1]);
                                cerHla2.setLayoutX(hraciPol[cePozice2 - 1][0]);
                                cerHla2.setLayoutY(hraciPol[cePozice2 - 1][1] - 35);
                                cePosunDal();
                            }
                        }
                    } else {
                        if (cePozice2 < -1) {//Pokud je druhá červená figurka v cíli a třetí červená figurka mimo pole hodí kostkou
                            if (cePozice3 == -3) {
                                cePozice3 = random();
                                if (cePozice3 == 6) {//Pokud padne 6 posune figurku na hrací pole.
                                    cerTel3.setLayoutX(hraciPol[30][0]);
                                    cerTel3.setLayoutY(hraciPol[30][1]);
                                    cerHla3.setLayoutX(hraciPol[30][0]);
                                    cerHla3.setLayoutY(hraciPol[30][1] - 35);
                                    cePozice3 = 31;
                                    cePosunDal();
                                    return;
                                } else {//Pokud nepadne 6 ponechá figurku na startu mimo hrací pole. 
                                    cePozice3 = -3;
                                    cePosunDal();
                                    return;
                                }
                            }
                            if (cePozice3 < 41 & cePozice3 > -1) {//Pokud je třetí červená figurka v hracím poli hodí kostkou
                                cePozice3 = cePozice3 + random();
                                if (ceBoo3 == true & cePozice3 > 30) {//Pokud by hození kostkou umístilo figurku mimo hrací pole postaví ji do cíle
                                    ceDom3();
                                    cePosunDal();
                                } else {
                                    if (cePozice3 > 40) {//Posune figurku na místo po hození kostkou.
                                        cePozice3 = cePozice3 - 40;
                                        cerTel3.setLayoutX(hraciPol[cePozice3 - 1][0]);
                                        cerTel3.setLayoutY(hraciPol[cePozice3 - 1][1]);
                                        cerHla3.setLayoutX(hraciPol[cePozice3 - 1][0]);
                                        cerHla3.setLayoutY(hraciPol[cePozice3 - 1][1] - 35);
                                        ceBoo3 = true;
                                        cePosunDal();

                                    } else {//Posune figurku na místo po hození kostkou.
                                        cerTel3.setLayoutX(hraciPol[cePozice3 - 1][0]);
                                        cerTel3.setLayoutY(hraciPol[cePozice3 - 1][1]);
                                        cerHla3.setLayoutX(hraciPol[cePozice3 - 1][0]);
                                        cerHla3.setLayoutY(hraciPol[cePozice3 - 1][1] - 35);
                                        cePosunDal();
                                    }
                                }
                            } else {
                                if (cePozice3 < -1) {//Pokud je třetí červená figurka v cíli a čtvrtá červená figurka mimo pole hodí kostkou
                                    if (cePozice4 == -3) {
                                        cePozice4 = random();
                                        if (cePozice4 == 6) {//Pokud padne 6 posune figurku na hrací pole.
                                            cerTel4.setLayoutX(hraciPol[30][0]);
                                            cerTel4.setLayoutY(hraciPol[30][1]);
                                            cerHla4.setLayoutX(hraciPol[30][0]);
                                            cerHla4.setLayoutY(hraciPol[30][1] - 35);
                                            cePozice4 = 31;
                                            cePosunDal();
                                            return;
                                        } else {//Pokud nepadne 6 ponechá figurku na startu mimo hrací pole. 
                                            cePozice4 = -3;
                                            cePosunDal();
                                            return;
                                        }
                                    }
                                    if (cePozice4 < 41 & cePozice4 > -1) {//Pokud je čtvrtá červená figurka v hracím poli hodí kostkou
                                        cePozice4 = cePozice4 + random();
                                        if (ceBoo4 == true & cePozice4 > 30) {//Pokud by hození kostkou umístilo figurku mimo hrací pole postaví ji do cíle
                                            ceDom4();
                                            cePosunDal();
                                        } else {
                                            if (cePozice4 > 40) {//Posune figurku na místo po hození kostkou.
                                                cePozice4 = cePozice4 - 40;
                                                cerTel4.setLayoutX(hraciPol[cePozice4 - 1][0]);
                                                cerTel4.setLayoutY(hraciPol[cePozice4 - 1][1]);
                                                cerHla4.setLayoutX(hraciPol[cePozice4 - 1][0]);
                                                cerHla4.setLayoutY(hraciPol[cePozice4 - 1][1] - 35);
                                                ceBoo4 = true;
                                                cePosunDal();

                                            } else {//Posune figurku na místo po hození kostkou.
                                                cerTel4.setLayoutX(hraciPol[cePozice4 - 1][0]);
                                                cerTel4.setLayoutY(hraciPol[cePozice4 - 1][1]);
                                                cerHla4.setLayoutX(hraciPol[cePozice4 - 1][0]);
                                                cerHla4.setLayoutY(hraciPol[cePozice4 - 1][1] - 35);
                                                cePosunDal();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pole.setVisible(false);
        figurkyVis(false);
        cePosunDal();
        vyhra.setVisible(false);
        znovu.setVisible(false);
    }
}
