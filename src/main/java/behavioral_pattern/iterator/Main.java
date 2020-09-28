package behavioral_pattern.iterator;

/*
* The participants of iterator pattern are as follows:
    Iterator: An interface to access or traverse the elements collection. Provide methods which concrete iterators must implement.
    ConcreteIterator: implements the Iterator interface methods. It can also keep track of the current position in the traversal of the aggregate collection.
    Aggregate: It is typically a collection interface which defines a method that can create an Iterator object.
    ConcreteAggregate: It implements the Aggregate interface and its specific method returns an instance of ConcreteIterator.

 !!! Iterator pattern is useful when you want to provide a standard way to iterate over a collection and hide the implementation logic from client program.
     The logic for iteration is embedded in the collection itself and it helps client program to iterate over them easily.

     JDK examples of iterator: Iterator from Collection framework
     * and Scanner class from java.util.Scanner
*
* */
public class Main {
    public static void main(String[] args) {

        ChannelCollection channels = populateChannels();
        ChannelIterator iterator = channels.iterator(ChannelTypeEnum.ALL);
        while(iterator.hasNext()) {
            Channel c = iterator.next();
            System.out.println(c.toString());
        }

        System.out.println("**************");

        ChannelIterator engIterator = channels.iterator(ChannelTypeEnum.ENGLISH);
        while(iterator.hasNext()) {
            Channel c = iterator.next();
            System.out.println(c);
        }

    }

    private static ChannelCollection populateChannels() {
        ChannelCollection channels = new ChannelCollectionImpl();
        channels.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(99.5, ChannelTypeEnum.ROMANIAN));
        channels.addChannel(new Channel(100.5, ChannelTypeEnum.SPANISH));
        channels.addChannel(new Channel(101.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(102.5, ChannelTypeEnum.ITALIAN));
        channels.addChannel(new Channel(103.5, ChannelTypeEnum.RUSSIAN));
        channels.addChannel(new Channel(104.5, ChannelTypeEnum.ENGLISH));
        return channels;
    }
}
