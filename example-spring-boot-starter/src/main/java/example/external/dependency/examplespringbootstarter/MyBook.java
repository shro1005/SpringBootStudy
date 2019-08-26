package example.external.dependency.examplespringbootstarter;

/**
 * MyBook
 */
public class MyBook {

    String name;
    int page;
    String writer;

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @param page the page to set
     */
    public void setPage(int page) {
        this.page = page;
    }
    /**
     * @param writer the writer to set
     */
    public void setWriter(String writer) {
        this.writer = writer;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return the page
     */
    public int getPage() {
        return page;
    }
    /**
     * @return the writer
     */
    public String getWriter() {
        return writer;
    }
    @Override
    public String toString() {
        return "Kyun's Book {name : " + name + " / page : " + page + " / writer : " + writer + "}";
    }
}