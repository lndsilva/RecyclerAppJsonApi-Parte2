package br.com.local.recyclerappjsonapi;

public class ListarItens {
    private String title;
    private String opening_crawl;

    public ListarItens(String title, String opening_crawl) {
        this.title = title;
        this.opening_crawl = opening_crawl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOpening_crawl() {
        return opening_crawl;
    }

    public void setOpening_crawl(String opening_crawl) {
        this.opening_crawl = opening_crawl;
    }
}
