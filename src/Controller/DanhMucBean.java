package Controller;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class DanhMucBean {
    private String kind;
    private JLabel jlb;
    private JPanel jpn;

    public DanhMucBean() {
    }

    public DanhMucBean(String kind, JLabel jlb, JPanel jpn) {
        this.kind = kind;
        this.jlb = jlb;
        this.jpn = jpn;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public JLabel getJlb() {
        return jlb;
    }

    public void setJlb(JLabel jlb) {
        this.jlb = jlb;
    }

    public JPanel getJpn() {
        return jpn;
    }

    public void setJpn(JPanel jpn) {
        this.jpn = jpn;
    }
}
