package com.mygdx.resources.enums;

public enum TextureEnum {
    PLAYER_IDLE_DOWN,
    PLAYER_IDLE_UP,
    PLAYER_IDLE_LEFT,
    PLAYER_IDLE_RIGHT,
    PLAYER_WALK_DOWN(3),
    PLAYER_WALK_UP(3),
    PLAYER_WALK_LEFT(1),
    PLAYER_WALK_RIGHT(1),

    TEST_CAT(3),

    // MAP COMPONENTS
    LAMP(2),
    LONG_LAMP,
    TRAFFIC_LIGHT,
    GLASS_DOOR(9, 0.1f, 3),
    SIDE_WALK(1),
    RUBBISH(3),
    DOUBLE_DOOR_OPENING(32, 0.02f, 0f),
    DOUBLE_DOOR_CLOSING(32, 0.02f, 0f),
    GLASS_DOOR_OPENING(32, 0.01f, 0f),
    GLASS_DOOR_CLOSING(32, 0.01f, 0);

    public String path;
    public float animationRate = -1;
    public float delay = -1;
    public int frameCount = 1;

    /**
     * Animation included in a textureatlas
     * Path is trivial, should always be the same name as the enum
     * 
     * @param animationRate
     * @param delay
     * @param frameCount
     */
    TextureEnum(int frameCount, float animationRate, float delay) {
        this.path = name().toLowerCase();
        this.animationRate = animationRate;
        this.delay = delay;
        this.frameCount = frameCount;
    }

    /**
     * Animation included in a textureatlas with default rate and delay
     * Lable is trivial, should always be the same name as the enum
     * 
     * @param animationRate
     * @param delay
     * @param frameCount
     */
    TextureEnum(int frameCount) {
        this.path = name().toLowerCase();
        this.frameCount = frameCount;
    }

    TextureEnum() {
        this(1);
    }

}
