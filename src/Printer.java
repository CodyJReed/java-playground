public class Printer {

    private int tonerLevel = 25;
    private int pagesPrinted = 0;
    private int pagesLeft = 10;
    
    public void print(int pages) {
        if (pages > pagesLeft || pagesLeft == 0 ) {
            System.out.println("Please add paper.");
        } else if (pages > tonerLevel  || tonerLevel == 0) {
            System.out.println("Please add toner.");
        } else {
        this.pagesLeft = this.pagesLeft -= pages;
        this.tonerLevel = this.tonerLevel -= pages;
        System.out.println(pages + " pages printed.");
        }
    }

    public void addPaper(int paper) {
        this.pagesLeft = this.pagesLeft += paper;
        System.out.println(paper + " pages of paper added. " + pagesLeft + " pages left.");
    }

    public void addToner(int toner) {
        this.tonerLevel = this.tonerLevel += toner;
        System.out.println("Toner added... Toner level at " + tonerLevel);
    }

    public int checkPaperTray() {
        return this.pagesLeft;
    }




}