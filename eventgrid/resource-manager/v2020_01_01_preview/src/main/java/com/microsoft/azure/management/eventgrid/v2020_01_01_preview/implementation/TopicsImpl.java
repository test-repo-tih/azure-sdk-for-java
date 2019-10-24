/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.eventgrid.v2020_01_01_preview.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.eventgrid.v2020_01_01_preview.Topics;
import com.microsoft.azure.management.eventgrid.v2020_01_01_preview.Topic;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.eventgrid.v2020_01_01_preview.TopicSharedAccessKeys;
import java.util.List;
import com.microsoft.azure.management.eventgrid.v2020_01_01_preview.EventType;

class TopicsImpl extends GroupableResourcesCoreImpl<Topic, TopicImpl, TopicInner, TopicsInner, EventGridManager>  implements Topics {
    protected TopicsImpl(EventGridManager manager) {
        super(manager.inner().topics(), manager);
    }

    @Override
    protected Observable<TopicInner> getInnerAsync(String resourceGroupName, String name) {
        TopicsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        TopicsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<Topic> listByResourceGroup(String resourceGroupName) {
        TopicsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<Topic> listByResourceGroupAsync(String resourceGroupName) {
        TopicsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<TopicInner>, Iterable<TopicInner>>() {
            @Override
            public Iterable<TopicInner> call(Page<TopicInner> page) {
                return page.items();
            }
        })
        .map(new Func1<TopicInner, Topic>() {
            @Override
            public Topic call(TopicInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<Topic> list() {
        TopicsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<Topic> listAsync() {
        TopicsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<TopicInner>, Iterable<TopicInner>>() {
            @Override
            public Iterable<TopicInner> call(Page<TopicInner> page) {
                return page.items();
            }
        })
        .map(new Func1<TopicInner, Topic>() {
            @Override
            public Topic call(TopicInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public TopicImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<TopicSharedAccessKeys> listSharedAccessKeysAsync(String resourceGroupName, String topicName) {
        TopicsInner client = this.inner();
        return client.listSharedAccessKeysAsync(resourceGroupName, topicName)
        .map(new Func1<TopicSharedAccessKeysInner, TopicSharedAccessKeys>() {
            @Override
            public TopicSharedAccessKeys call(TopicSharedAccessKeysInner inner) {
                return new TopicSharedAccessKeysImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<TopicSharedAccessKeys> regenerateKeyAsync(String resourceGroupName, String topicName, String keyName) {
        TopicsInner client = this.inner();
        return client.regenerateKeyAsync(resourceGroupName, topicName, keyName)
        .map(new Func1<TopicSharedAccessKeysInner, TopicSharedAccessKeys>() {
            @Override
            public TopicSharedAccessKeys call(TopicSharedAccessKeysInner inner) {
                return new TopicSharedAccessKeysImpl(inner, manager());
            }
        });
    }

    @Override
    protected TopicImpl wrapModel(TopicInner inner) {
        return  new TopicImpl(inner.name(), inner, manager());
    }

    @Override
    protected TopicImpl wrapModel(String name) {
        return new TopicImpl(name, new TopicInner(), this.manager());
    }

    @Override
    public Observable<EventType> listEventTypesAsync(String resourceGroupName, String providerNamespace, String resourceTypeName, String resourceName) {
        TopicsInner client = this.inner();
        return client.listEventTypesAsync(resourceGroupName, providerNamespace, resourceTypeName, resourceName)
        .flatMap(new Func1<List<EventTypeInner>, Observable<EventTypeInner>>() {
            @Override
            public Observable<EventTypeInner> call(List<EventTypeInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<EventTypeInner, EventType>() {
            @Override
            public EventType call(EventTypeInner inner) {
                return new EventTypeImpl(inner, manager());
            }
        });
    }

}
