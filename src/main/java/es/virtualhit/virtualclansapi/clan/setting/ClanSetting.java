package es.virtualhit.virtualclansapi.clan.setting;

public class ClanSetting {

    private final String name;
    private ClanSettingStatus status;

    public ClanSetting(String name, ClanSettingStatus status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public ClanSettingStatus getStatus() {
        return status;
    }

    public void setStatus(ClanSettingStatus status) {
        this.status = status;
    }
}
