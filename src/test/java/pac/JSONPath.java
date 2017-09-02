package pac;

/**
 * Created by denys on 7/29/17.
 */
public class JSONPath {
/**
    //Data from first book
    $.store.book[0]

    //All books after first
    $.store.book[1:]

    //All books except the last
    $.store.book[-1:]

    //Only first and second books
    $.store.book[0, 1]

    //All author
    $.store.book[*].author

    //Second author
    $.store.book[1].author

    //All books where is 'id' node
    $.store.book[?(@.id)]

    //All books where category="reference"
    $.store.book[?(@.category="reference")]

    //All books where price > 15
    $.store.book[?(@.price>15)]
*/
}
