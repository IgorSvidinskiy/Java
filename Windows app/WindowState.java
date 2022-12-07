import java.awt.*;

public class WindowState extends Frame
{
    public void iconify()
    {
        int state = this.getExtendedState();
        state |= Frame.ICONIFIED;

        this.setExtendedState(state);
    }

    public void deiconify()
    {
        int state = this.getExtendedState();
        state &= ~Frame.ICONIFIED;

        this.setExtendedState(state);
    }

    public void maximize()
    {
        int state = this.getExtendedState();
        state |= Frame.MAXIMIZED_BOTH;
        
        this.setExtendedState(state);
    }

    public void restore()
    {
        int state = this.getExtendedState();
        state &= ~Frame.MAXIMIZED_BOTH;

        this.setExtendedState(state);
    }
}