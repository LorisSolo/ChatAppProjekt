package ChatAppProjekt.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String groupId;
    private String groupName;
    private Boolean isDM;
    private String groupAdminNumber;


    public String getGroupAdminNumber() {
        return groupAdminNumber;
    }

    public void setGroupAdminNumber(String groupAdminNumber) {
        this.groupAdminNumber = groupAdminNumber;
    }

    public Group() {
        UUID uuid = UUID.randomUUID();
        String smallerId = uuid.toString().substring(0, 3);
        groupId = smallerId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Boolean getDM() {
        return isDM;
    }

    public void setDM(Boolean DM) {
        isDM = DM;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", groupName='" + groupName + '\'' +
                ", isDM=" + isDM +
                '}';
    }
}
