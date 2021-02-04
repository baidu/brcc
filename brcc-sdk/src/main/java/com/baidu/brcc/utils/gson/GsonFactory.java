/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.utils.gson;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

public class GsonFactory {

    public static Gson createGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        // 注册numberAdapter
        Gson gson = registerAdapter(gsonBuilder).create();
        return gson;
    }

    private static GsonBuilder registerAdapter(GsonBuilder gsonBuilder) {
        gsonBuilder
                // date
                .registerTypeAdapter(Date.class, new GsonDateDefaultAdapter())

                // byte
                .registerTypeAdapter(Byte.class, new GsonNumberDefaultAdapter<Byte>() {
                    @Override
                    public Byte returnNull() {
                        return null;
                    }

                    @Override
                    public Byte returnValue(JsonElement json) {
                        return json.getAsByte();
                    }
                })
                .registerTypeAdapter(byte.class, new GsonNumberDefaultAdapter<Byte>() {
                    @Override
                    public Byte returnNull() {
                        return 0;
                    }

                    @Override
                    public Byte returnValue(JsonElement json) {
                        return json.getAsByte();
                    }
                })

                // short
                .registerTypeAdapter(Short.class, new GsonNumberDefaultAdapter<Short>() {
                    @Override
                    public Short returnNull() {
                        return null;
                    }

                    @Override
                    public Short returnValue(JsonElement json) {
                        return json.getAsShort();
                    }
                })
                .registerTypeAdapter(short.class, new GsonNumberDefaultAdapter<Short>() {
                    @Override
                    public Short returnNull() {
                        return 0;
                    }

                    @Override
                    public Short returnValue(JsonElement json) {
                        return json.getAsShort();
                    }
                })

                // int
                .registerTypeAdapter(Integer.class, new GsonNumberDefaultAdapter<Integer>() {
                    @Override
                    public Integer returnNull() {
                        return null;
                    }

                    @Override
                    public Integer returnValue(JsonElement json) {
                        return json.getAsInt();
                    }
                })
                .registerTypeAdapter(int.class, new GsonNumberDefaultAdapter<Integer>() {
                    @Override
                    public Integer returnNull() {
                        return 0;
                    }

                    @Override
                    public Integer returnValue(JsonElement json) {
                        return json.getAsInt();
                    }
                })

                // long
                .registerTypeAdapter(Long.class, new GsonNumberDefaultAdapter<Long>() {
                    @Override
                    public Long returnNull() {
                        return null;
                    }

                    @Override
                    public Long returnValue(JsonElement json) {
                        return json.getAsLong();
                    }
                })
                .registerTypeAdapter(long.class, new GsonNumberDefaultAdapter<Long>() {
                    @Override
                    public Long returnNull() {
                        return 0L;
                    }

                    @Override
                    public Long returnValue(JsonElement json) {
                        return json.getAsLong();
                    }
                })

                // bigint
                .registerTypeAdapter(BigInteger.class, new GsonNumberDefaultAdapter<BigInteger>() {
                    @Override
                    public BigInteger returnNull() {
                        return null;
                    }

                    @Override
                    public BigInteger returnValue(JsonElement json) {
                        return json.getAsBigInteger();
                    }
                })

                // float
                .registerTypeAdapter(Float.class, new GsonNumberDefaultAdapter<Float>() {
                    @Override
                    public Float returnNull() {
                        return null;
                    }

                    @Override
                    public Float returnValue(JsonElement json) {
                        return json.getAsFloat();
                    }
                })
                .registerTypeAdapter(float.class, new GsonNumberDefaultAdapter<Float>() {
                    @Override
                    public Float returnNull() {
                        return 0f;
                    }

                    @Override
                    public Float returnValue(JsonElement json) {
                        return json.getAsFloat();
                    }
                })

                // double
                .registerTypeAdapter(Double.class, new GsonNumberDefaultAdapter<Double>() {
                    @Override
                    public Double returnNull() {
                        return null;
                    }

                    @Override
                    public Double returnValue(JsonElement json) {
                        return json.getAsDouble();
                    }
                })
                .registerTypeAdapter(double.class, new GsonNumberDefaultAdapter<Double>() {
                    @Override
                    public Double returnNull() {
                        return 0d;
                    }

                    @Override
                    public Double returnValue(JsonElement json) {
                        return json.getAsDouble();
                    }
                })

                // BigDecimal
                .registerTypeAdapter(BigDecimal.class, new GsonNumberDefaultAdapter<BigDecimal>() {
                    @Override
                    public BigDecimal returnNull() {
                        return null;
                    }

                    @Override
                    public BigDecimal returnValue(JsonElement json) {
                        return json.getAsBigDecimal();
                    }
                });

        return gsonBuilder;
    }
}
