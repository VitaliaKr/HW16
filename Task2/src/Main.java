public class Main {
    public static String TEXT = "The company was founded on June 5, 1998, by two college students with a shared vision of connecting the world. By 2001, they had expanded operations into Europe and Asia, establishing offices in London, Tokyo, and Berlin. On March 12, 2005, the first mobile version of their platform was launched, attracting over 1 million users in just three months. In 2010, after a decade of innovation, they introduced AI-driven services that revolutionized user interaction. The release of their cloud infrastructure in April 2015 enabled faster, more secure data processing. As of May 2025, the company serves over 500 million users worldwide, continuing to lead in digital transformation and technological advancement.";

    public static void main(String[] args) {
        printWords(TEXT);
    }

    public static void printWords(String inputText) {
        System.out.println(inputText.replaceAll("[\\d,.:;?!]", "").replaceAll("\\s+","\n").trim());
    }


}