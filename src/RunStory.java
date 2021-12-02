import Objects.*;
import Utility.Size;
import Utility.Status;

public class RunStory {
    public static void main(String[] args) {
        Tree rowan = new Tree("рябина", Size.BIG, true);
        House hall = new House("хол");
        hall.fillIn(rowan);
        Birds birds = new Birds("птицы", 3);
        Spider spider = new Spider("паук",8);
        birds.fly("под самым потолком ");
        birds.hunt(spider);
        Ferrets mu = new Ferrets("Мю",Status.NORMAL,Size.SMALL);
        Ant ant = new Ant("муравей",6,Size.BIG,Status.TERRIBLE);
        mu.meet(ant,hall,"повстречала в");
        All all = new All("все");
        House theater = new House("театр");
        all.view("заметили, что",theater.move("плыл уже", "в лесу"));
        Bear emma = new Bear("Эмма",Status.TERRIBLE,Size.BIG);
        emma.intimidation(all);
        all.moralAction(emma, all.move("сгрудились","у самой воды"));
        House house = new House("дом");
        Ferrets mumiFather = new Ferrets("Муми-Папа");
        all.attach("привязали", house, rowan);
        mumiFather.attach("прикрепил", "канат", "к палке");
        mumiFather.attach("воткнул", "палку", "в крышку чулана ");
    }
}