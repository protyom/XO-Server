package nolife;

import java.io.Serializable;

public class MessageMove extends Message implements Serializable {

    private static final long serialVersionUID = 1L;

    public String usrNic;
    public String move;

    public MessageMove( String usrNic, String move ) {

        super( Protocol.CMD_OFFER );
        this.usrNic = usrNic;
        this.move = move;
    }

}
