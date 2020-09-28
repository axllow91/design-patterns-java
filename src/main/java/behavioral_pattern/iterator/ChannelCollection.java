package behavioral_pattern.iterator;

public interface ChannelCollection {
    void addChannel(Channel channel);
    void removeChannel(Channel channel);
    ChannelIterator iterator(ChannelTypeEnum type);
}
