package udb.gl.moneytransfer.domain;

public class Response {
    private String data;
    private User user;

    public Response(String data, User user) {
        this.data = data;
        this.user = user;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
