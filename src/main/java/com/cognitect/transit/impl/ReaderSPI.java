// Copyright (c) Cognitect, Inc.
// All rights reserved.

package com.cognitect.transit.impl;

import com.cognitect.transit.Reader;

public interface ReaderSPI {
    public Reader setBuilders(MapBuilder mapBuilder,
                              ArrayBuilder arrayBuilder);
}
