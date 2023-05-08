import akka.actor.AbstractActor;
import akka.actor.Props;

public class SimpleActor extends AbstractActor {
    public static void main(String[] args) {


        private final LoggingAdapter log = Logging.getLogger(getContext().getSystem(). this);

        public static Props props () {
            return Props.create(SimpleActor.class);

        }

        @Override
        public Receive createReceive () {
            return receiveBuilder().match(String.class, s -> {
                log.info
            });

        }
    }

}
