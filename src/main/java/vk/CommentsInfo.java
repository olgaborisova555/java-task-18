package vk;

public class CommentsInfo {
    private int count;
    private boolean canPost;
    private boolean canEdit;

    public int getCount() {
        return count;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }
}

