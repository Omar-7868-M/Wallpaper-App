package com.example.wallpaper;

public class ImageModel
{
    private urlModel src;

    public ImageModel(urlModel src) {
        this.src = src;
    }

    public urlModel getSrc() {
        return src;
    }

    public void setSrc(urlModel src) {
        this.src = src;
    }
}
