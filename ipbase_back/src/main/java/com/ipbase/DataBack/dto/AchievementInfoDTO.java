package com.ipbase.DataBack.dto;

import com.ipbase.DataBack.entity.AchievementInfo;
import com.ipbase.DataBack.entity.PictureInfo;

import java.util.List;

/**
 * 包含图片数组的成果数据传输类(Data Transfer Object)
 * @author tianyi
 * @date 2019-05-13 23:37
 */
public class AchievementInfoDTO extends AchievementInfo {

    public AchievementInfoDTO(AchievementInfo achievementInfo){
        super(achievementInfo.getId(),
                achievementInfo.getName(),
                achievementInfo.getBrief(),
                achievementInfo.getAuthor(),
                achievementInfo.getAuthorId(),
                achievementInfo.getCreateTime());
    }

    private List<PictureInfo> pictures;

    public List<PictureInfo> getPictures() {
        return pictures;
    }

    public void setPictures(List<PictureInfo> pictures) {
        this.pictures = pictures;
    }
}
