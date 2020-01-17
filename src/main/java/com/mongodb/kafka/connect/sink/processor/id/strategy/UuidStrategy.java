/*
 * Copyright 2008-present MongoDB, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Original Work: Apache License, Version 2.0, Copyright 2017 Hans-Peter Grahsl.
 */

package com.mongodb.kafka.connect.sink.processor.id.strategy;

import java.util.UUID;

import org.apache.kafka.connect.sink.SinkRecord;

import org.bson.BsonString;
import org.bson.BsonValue;

import com.mongodb.kafka.connect.sink.converter.SinkDocument;

public class UuidStrategy implements IdStrategy {

    @Override
    public BsonValue generateId(final SinkDocument doc, final SinkRecord orig) {
        return new BsonString(UUID.randomUUID().toString());
    }

}
