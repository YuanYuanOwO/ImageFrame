/*
 * This file is part of ImageFrame.
 *
 * Copyright (C) 2022. LoohpJames <jamesloohp@gmail.com>
 * Copyright (C) 2022. Contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package com.loohp.imageframe.objectholders;

import it.unimi.dsi.fastutil.ints.IntList;
import org.bukkit.map.MapView;

import java.util.List;
import java.util.UUID;

public abstract class URLImageMap extends ImageMap {

    protected String url;

    public URLImageMap(ImageMapManager manager, int imageIndex, String name, String url, List<MapView> mapViews, IntList mapIds, int width, int height, UUID creator, long creationTime) {
        super(manager, imageIndex, name, mapViews, mapIds, width, height, creator, creationTime);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
