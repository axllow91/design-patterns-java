package behavioral_pattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {

    private List<Channel> channelList;

    public ChannelCollectionImpl() {
        channelList = new ArrayList<>();
    }

    @Override
    public void addChannel(Channel channel) {
        this.channelList.add(channel);
    }

    @Override
    public void removeChannel(Channel channel) {
        this.channelList.remove(channel);
    }

    @Override
    public ChannelIterator iterator(ChannelTypeEnum type) {
        return new ChannelIteratorImpl(type, this.channelList);
    }

    private class ChannelIteratorImpl implements ChannelIterator {

        private ChannelTypeEnum TYPE;
        private List<Channel> channels;
        private int position;

        public ChannelIteratorImpl(ChannelTypeEnum TYPE, List<Channel> channels) {
            this.TYPE = TYPE;
            this.channels = channels;
        }

        @Override
        public boolean hasNext() {
            while(position < channels.size()) {
                Channel c = channels.get(position);
                if(c.getTYPE().equals(TYPE) || TYPE.equals(ChannelTypeEnum.ALL))
                    return true;
                else
                    position++;
            }
            return false;
        }

        @Override
        public Channel next() {
            Channel c = channels.get(position);
            position++;
            return c;
        }
    }


}

