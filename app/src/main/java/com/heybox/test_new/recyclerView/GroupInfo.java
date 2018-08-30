package com.heybox.test_new.recyclerView;

public class GroupInfo {

     int groupId, groupIndex, groupLength;

    public GroupInfo(int groupId, int groupIndex, int groupLength) {
        this.groupId = groupId;
        this.groupIndex = groupIndex;
        this.groupLength = groupLength;
    }

    public boolean isFirstInGroup() {
        return groupIndex == 0;
    }

    public boolean isLastInGroup() {
        return groupIndex == groupLength - 1 && groupIndex >= 0;
    }
}
