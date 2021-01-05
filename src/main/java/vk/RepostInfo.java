package vk;

public class RepostInfo {
    private int count;
    private boolean userReposted;
    private boolean canRepost;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanRepost() {
        return canRepost;
    }

    public boolean isUserReposted() {
        return userReposted;
    }

    public void setUserReposted(boolean userReposted) {
        this.userReposted = userReposted;
    }

    public void setCanRepost(boolean canRepost) {
        this.canRepost = canRepost;
    }
}
