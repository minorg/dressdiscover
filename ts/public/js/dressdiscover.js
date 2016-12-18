(function webpackUniversalModuleDefinition(root, factory) {
	if(typeof exports === 'object' && typeof module === 'object')
		module.exports = factory(require("jQuery"), require("_"));
	else if(typeof define === 'function' && define.amd)
		define(["jQuery", "_"], factory);
	else {
		var a = typeof exports === 'object' ? factory(require("jQuery"), require("_")) : factory(root["jQuery"], root["_"]);
		for(var i in a) (typeof exports === 'object' ? exports : root)[i] = a[i];
	}
})(this, function(__WEBPACK_EXTERNAL_MODULE_2__, __WEBPACK_EXTERNAL_MODULE_3__) {
return /******/ (function(modules) { // webpackBootstrap
/******/ 	// The module cache
/******/ 	var installedModules = {};
/******/
/******/ 	// The require function
/******/ 	function __webpack_require__(moduleId) {
/******/
/******/ 		// Check if module is in cache
/******/ 		if(installedModules[moduleId])
/******/ 			return installedModules[moduleId].exports;
/******/
/******/ 		// Create a new module (and put it into the cache)
/******/ 		var module = installedModules[moduleId] = {
/******/ 			exports: {},
/******/ 			id: moduleId,
/******/ 			loaded: false
/******/ 		};
/******/
/******/ 		// Execute the module function
/******/ 		modules[moduleId].call(module.exports, module, module.exports, __webpack_require__);
/******/
/******/ 		// Flag the module as loaded
/******/ 		module.loaded = true;
/******/
/******/ 		// Return the exports of the module
/******/ 		return module.exports;
/******/ 	}
/******/
/******/
/******/ 	// expose the modules object (__webpack_modules__)
/******/ 	__webpack_require__.m = modules;
/******/
/******/ 	// expose the module cache
/******/ 	__webpack_require__.c = installedModules;
/******/
/******/ 	// __webpack_public_path__
/******/ 	__webpack_require__.p = "";
/******/
/******/ 	// Load entry module and return exports
/******/ 	return __webpack_require__(0);
/******/ })
/************************************************************************/
/******/ ([
/* 0 */
/***/ function(module, exports, __webpack_require__) {

	module.exports = __webpack_require__(1);


/***/ },
/* 1 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var $ = __webpack_require__(2);
	var _ = __webpack_require__(3);
	var Backbone = __webpack_require__(4);
	var Marionette = __webpack_require__(5);
	var radio_1 = __webpack_require__(8);
	var router_1 = __webpack_require__(10);
	var modal_region_1 = __webpack_require__(81);
	__webpack_require__(82);
	__webpack_require__(83);
	__webpack_require__(85);
	__webpack_require__(86);
	__webpack_require__(88);
	var Application = (function (_super) {
	    __extends(Application, _super);
	    function Application() {
	        _super.apply(this, arguments);
	    }
	    Application.prototype.onStart = function () {
	        this._modalRegion = new modal_region_1.ModalRegion();
	        this._radio = new radio_1.Radio();
	        this._router = new router_1.Router();
	        if (!Backbone.history.start({ hashChange: true, pushState: false })) {
	            console.error("didn't route");
	        }
	    };
	    Object.defineProperty(Application, "instance", {
	        get: function () {
	            return Application._instance;
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(Application.prototype, "radio", {
	        get: function () {
	            return this._radio;
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(Application.prototype, "modalRegion", {
	        get: function () {
	            return this._modalRegion;
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(Application.prototype, "router", {
	        get: function () {
	            return this._router;
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Application._instance = new Application();
	    return Application;
	}(Marionette.Application));
	exports.Application = Application;
	$(function () {
	    _.extend(Backbone.Model.prototype, Backbone.Validation.mixin);
	    Application.instance.start();
	});


/***/ },
/* 2 */
/***/ function(module, exports) {

	module.exports = __WEBPACK_EXTERNAL_MODULE_2__;

/***/ },
/* 3 */
/***/ function(module, exports) {

	module.exports = __WEBPACK_EXTERNAL_MODULE_3__;

/***/ },
/* 4 */
/***/ function(module, exports, __webpack_require__) {

	var __WEBPACK_AMD_DEFINE_ARRAY__, __WEBPACK_AMD_DEFINE_RESULT__;/* WEBPACK VAR INJECTION */(function(global) {//     Backbone.js 1.3.3
	
	//     (c) 2010-2016 Jeremy Ashkenas, DocumentCloud and Investigative Reporters & Editors
	//     Backbone may be freely distributed under the MIT license.
	//     For all details and documentation:
	//     http://backbonejs.org
	
	(function(factory) {
	
	  // Establish the root object, `window` (`self`) in the browser, or `global` on the server.
	  // We use `self` instead of `window` for `WebWorker` support.
	  var root = (typeof self == 'object' && self.self === self && self) ||
	            (typeof global == 'object' && global.global === global && global);
	
	  // Set up Backbone appropriately for the environment. Start with AMD.
	  if (true) {
	    !(__WEBPACK_AMD_DEFINE_ARRAY__ = [__webpack_require__(3), __webpack_require__(2), exports], __WEBPACK_AMD_DEFINE_RESULT__ = function(_, $, exports) {
	      // Export global even in AMD case in case this script is loaded with
	      // others that may still expect a global Backbone.
	      root.Backbone = factory(root, exports, _, $);
	    }.apply(exports, __WEBPACK_AMD_DEFINE_ARRAY__), __WEBPACK_AMD_DEFINE_RESULT__ !== undefined && (module.exports = __WEBPACK_AMD_DEFINE_RESULT__));
	
	  // Next for Node.js or CommonJS. jQuery may not be needed as a module.
	  } else if (typeof exports !== 'undefined') {
	    var _ = require('underscore'), $;
	    try { $ = require('jquery'); } catch (e) {}
	    factory(root, exports, _, $);
	
	  // Finally, as a browser global.
	  } else {
	    root.Backbone = factory(root, {}, root._, (root.jQuery || root.Zepto || root.ender || root.$));
	  }
	
	})(function(root, Backbone, _, $) {
	
	  // Initial Setup
	  // -------------
	
	  // Save the previous value of the `Backbone` variable, so that it can be
	  // restored later on, if `noConflict` is used.
	  var previousBackbone = root.Backbone;
	
	  // Create a local reference to a common array method we'll want to use later.
	  var slice = Array.prototype.slice;
	
	  // Current version of the library. Keep in sync with `package.json`.
	  Backbone.VERSION = '1.3.3';
	
	  // For Backbone's purposes, jQuery, Zepto, Ender, or My Library (kidding) owns
	  // the `$` variable.
	  Backbone.$ = $;
	
	  // Runs Backbone.js in *noConflict* mode, returning the `Backbone` variable
	  // to its previous owner. Returns a reference to this Backbone object.
	  Backbone.noConflict = function() {
	    root.Backbone = previousBackbone;
	    return this;
	  };
	
	  // Turn on `emulateHTTP` to support legacy HTTP servers. Setting this option
	  // will fake `"PATCH"`, `"PUT"` and `"DELETE"` requests via the `_method` parameter and
	  // set a `X-Http-Method-Override` header.
	  Backbone.emulateHTTP = false;
	
	  // Turn on `emulateJSON` to support legacy servers that can't deal with direct
	  // `application/json` requests ... this will encode the body as
	  // `application/x-www-form-urlencoded` instead and will send the model in a
	  // form param named `model`.
	  Backbone.emulateJSON = false;
	
	  // Proxy Backbone class methods to Underscore functions, wrapping the model's
	  // `attributes` object or collection's `models` array behind the scenes.
	  //
	  // collection.filter(function(model) { return model.get('age') > 10 });
	  // collection.each(this.addView);
	  //
	  // `Function#apply` can be slow so we use the method's arg count, if we know it.
	  var addMethod = function(length, method, attribute) {
	    switch (length) {
	      case 1: return function() {
	        return _[method](this[attribute]);
	      };
	      case 2: return function(value) {
	        return _[method](this[attribute], value);
	      };
	      case 3: return function(iteratee, context) {
	        return _[method](this[attribute], cb(iteratee, this), context);
	      };
	      case 4: return function(iteratee, defaultVal, context) {
	        return _[method](this[attribute], cb(iteratee, this), defaultVal, context);
	      };
	      default: return function() {
	        var args = slice.call(arguments);
	        args.unshift(this[attribute]);
	        return _[method].apply(_, args);
	      };
	    }
	  };
	  var addUnderscoreMethods = function(Class, methods, attribute) {
	    _.each(methods, function(length, method) {
	      if (_[method]) Class.prototype[method] = addMethod(length, method, attribute);
	    });
	  };
	
	  // Support `collection.sortBy('attr')` and `collection.findWhere({id: 1})`.
	  var cb = function(iteratee, instance) {
	    if (_.isFunction(iteratee)) return iteratee;
	    if (_.isObject(iteratee) && !instance._isModel(iteratee)) return modelMatcher(iteratee);
	    if (_.isString(iteratee)) return function(model) { return model.get(iteratee); };
	    return iteratee;
	  };
	  var modelMatcher = function(attrs) {
	    var matcher = _.matches(attrs);
	    return function(model) {
	      return matcher(model.attributes);
	    };
	  };
	
	  // Backbone.Events
	  // ---------------
	
	  // A module that can be mixed in to *any object* in order to provide it with
	  // a custom event channel. You may bind a callback to an event with `on` or
	  // remove with `off`; `trigger`-ing an event fires all callbacks in
	  // succession.
	  //
	  //     var object = {};
	  //     _.extend(object, Backbone.Events);
	  //     object.on('expand', function(){ alert('expanded'); });
	  //     object.trigger('expand');
	  //
	  var Events = Backbone.Events = {};
	
	  // Regular expression used to split event strings.
	  var eventSplitter = /\s+/;
	
	  // Iterates over the standard `event, callback` (as well as the fancy multiple
	  // space-separated events `"change blur", callback` and jQuery-style event
	  // maps `{event: callback}`).
	  var eventsApi = function(iteratee, events, name, callback, opts) {
	    var i = 0, names;
	    if (name && typeof name === 'object') {
	      // Handle event maps.
	      if (callback !== void 0 && 'context' in opts && opts.context === void 0) opts.context = callback;
	      for (names = _.keys(name); i < names.length ; i++) {
	        events = eventsApi(iteratee, events, names[i], name[names[i]], opts);
	      }
	    } else if (name && eventSplitter.test(name)) {
	      // Handle space-separated event names by delegating them individually.
	      for (names = name.split(eventSplitter); i < names.length; i++) {
	        events = iteratee(events, names[i], callback, opts);
	      }
	    } else {
	      // Finally, standard events.
	      events = iteratee(events, name, callback, opts);
	    }
	    return events;
	  };
	
	  // Bind an event to a `callback` function. Passing `"all"` will bind
	  // the callback to all events fired.
	  Events.on = function(name, callback, context) {
	    return internalOn(this, name, callback, context);
	  };
	
	  // Guard the `listening` argument from the public API.
	  var internalOn = function(obj, name, callback, context, listening) {
	    obj._events = eventsApi(onApi, obj._events || {}, name, callback, {
	      context: context,
	      ctx: obj,
	      listening: listening
	    });
	
	    if (listening) {
	      var listeners = obj._listeners || (obj._listeners = {});
	      listeners[listening.id] = listening;
	    }
	
	    return obj;
	  };
	
	  // Inversion-of-control versions of `on`. Tell *this* object to listen to
	  // an event in another object... keeping track of what it's listening to
	  // for easier unbinding later.
	  Events.listenTo = function(obj, name, callback) {
	    if (!obj) return this;
	    var id = obj._listenId || (obj._listenId = _.uniqueId('l'));
	    var listeningTo = this._listeningTo || (this._listeningTo = {});
	    var listening = listeningTo[id];
	
	    // This object is not listening to any other events on `obj` yet.
	    // Setup the necessary references to track the listening callbacks.
	    if (!listening) {
	      var thisId = this._listenId || (this._listenId = _.uniqueId('l'));
	      listening = listeningTo[id] = {obj: obj, objId: id, id: thisId, listeningTo: listeningTo, count: 0};
	    }
	
	    // Bind callbacks on obj, and keep track of them on listening.
	    internalOn(obj, name, callback, this, listening);
	    return this;
	  };
	
	  // The reducing API that adds a callback to the `events` object.
	  var onApi = function(events, name, callback, options) {
	    if (callback) {
	      var handlers = events[name] || (events[name] = []);
	      var context = options.context, ctx = options.ctx, listening = options.listening;
	      if (listening) listening.count++;
	
	      handlers.push({callback: callback, context: context, ctx: context || ctx, listening: listening});
	    }
	    return events;
	  };
	
	  // Remove one or many callbacks. If `context` is null, removes all
	  // callbacks with that function. If `callback` is null, removes all
	  // callbacks for the event. If `name` is null, removes all bound
	  // callbacks for all events.
	  Events.off = function(name, callback, context) {
	    if (!this._events) return this;
	    this._events = eventsApi(offApi, this._events, name, callback, {
	      context: context,
	      listeners: this._listeners
	    });
	    return this;
	  };
	
	  // Tell this object to stop listening to either specific events ... or
	  // to every object it's currently listening to.
	  Events.stopListening = function(obj, name, callback) {
	    var listeningTo = this._listeningTo;
	    if (!listeningTo) return this;
	
	    var ids = obj ? [obj._listenId] : _.keys(listeningTo);
	
	    for (var i = 0; i < ids.length; i++) {
	      var listening = listeningTo[ids[i]];
	
	      // If listening doesn't exist, this object is not currently
	      // listening to obj. Break out early.
	      if (!listening) break;
	
	      listening.obj.off(name, callback, this);
	    }
	
	    return this;
	  };
	
	  // The reducing API that removes a callback from the `events` object.
	  var offApi = function(events, name, callback, options) {
	    if (!events) return;
	
	    var i = 0, listening;
	    var context = options.context, listeners = options.listeners;
	
	    // Delete all events listeners and "drop" events.
	    if (!name && !callback && !context) {
	      var ids = _.keys(listeners);
	      for (; i < ids.length; i++) {
	        listening = listeners[ids[i]];
	        delete listeners[listening.id];
	        delete listening.listeningTo[listening.objId];
	      }
	      return;
	    }
	
	    var names = name ? [name] : _.keys(events);
	    for (; i < names.length; i++) {
	      name = names[i];
	      var handlers = events[name];
	
	      // Bail out if there are no events stored.
	      if (!handlers) break;
	
	      // Replace events if there are any remaining.  Otherwise, clean up.
	      var remaining = [];
	      for (var j = 0; j < handlers.length; j++) {
	        var handler = handlers[j];
	        if (
	          callback && callback !== handler.callback &&
	            callback !== handler.callback._callback ||
	              context && context !== handler.context
	        ) {
	          remaining.push(handler);
	        } else {
	          listening = handler.listening;
	          if (listening && --listening.count === 0) {
	            delete listeners[listening.id];
	            delete listening.listeningTo[listening.objId];
	          }
	        }
	      }
	
	      // Update tail event if the list has any events.  Otherwise, clean up.
	      if (remaining.length) {
	        events[name] = remaining;
	      } else {
	        delete events[name];
	      }
	    }
	    return events;
	  };
	
	  // Bind an event to only be triggered a single time. After the first time
	  // the callback is invoked, its listener will be removed. If multiple events
	  // are passed in using the space-separated syntax, the handler will fire
	  // once for each event, not once for a combination of all events.
	  Events.once = function(name, callback, context) {
	    // Map the event into a `{event: once}` object.
	    var events = eventsApi(onceMap, {}, name, callback, _.bind(this.off, this));
	    if (typeof name === 'string' && context == null) callback = void 0;
	    return this.on(events, callback, context);
	  };
	
	  // Inversion-of-control versions of `once`.
	  Events.listenToOnce = function(obj, name, callback) {
	    // Map the event into a `{event: once}` object.
	    var events = eventsApi(onceMap, {}, name, callback, _.bind(this.stopListening, this, obj));
	    return this.listenTo(obj, events);
	  };
	
	  // Reduces the event callbacks into a map of `{event: onceWrapper}`.
	  // `offer` unbinds the `onceWrapper` after it has been called.
	  var onceMap = function(map, name, callback, offer) {
	    if (callback) {
	      var once = map[name] = _.once(function() {
	        offer(name, once);
	        callback.apply(this, arguments);
	      });
	      once._callback = callback;
	    }
	    return map;
	  };
	
	  // Trigger one or many events, firing all bound callbacks. Callbacks are
	  // passed the same arguments as `trigger` is, apart from the event name
	  // (unless you're listening on `"all"`, which will cause your callback to
	  // receive the true name of the event as the first argument).
	  Events.trigger = function(name) {
	    if (!this._events) return this;
	
	    var length = Math.max(0, arguments.length - 1);
	    var args = Array(length);
	    for (var i = 0; i < length; i++) args[i] = arguments[i + 1];
	
	    eventsApi(triggerApi, this._events, name, void 0, args);
	    return this;
	  };
	
	  // Handles triggering the appropriate event callbacks.
	  var triggerApi = function(objEvents, name, callback, args) {
	    if (objEvents) {
	      var events = objEvents[name];
	      var allEvents = objEvents.all;
	      if (events && allEvents) allEvents = allEvents.slice();
	      if (events) triggerEvents(events, args);
	      if (allEvents) triggerEvents(allEvents, [name].concat(args));
	    }
	    return objEvents;
	  };
	
	  // A difficult-to-believe, but optimized internal dispatch function for
	  // triggering events. Tries to keep the usual cases speedy (most internal
	  // Backbone events have 3 arguments).
	  var triggerEvents = function(events, args) {
	    var ev, i = -1, l = events.length, a1 = args[0], a2 = args[1], a3 = args[2];
	    switch (args.length) {
	      case 0: while (++i < l) (ev = events[i]).callback.call(ev.ctx); return;
	      case 1: while (++i < l) (ev = events[i]).callback.call(ev.ctx, a1); return;
	      case 2: while (++i < l) (ev = events[i]).callback.call(ev.ctx, a1, a2); return;
	      case 3: while (++i < l) (ev = events[i]).callback.call(ev.ctx, a1, a2, a3); return;
	      default: while (++i < l) (ev = events[i]).callback.apply(ev.ctx, args); return;
	    }
	  };
	
	  // Aliases for backwards compatibility.
	  Events.bind   = Events.on;
	  Events.unbind = Events.off;
	
	  // Allow the `Backbone` object to serve as a global event bus, for folks who
	  // want global "pubsub" in a convenient place.
	  _.extend(Backbone, Events);
	
	  // Backbone.Model
	  // --------------
	
	  // Backbone **Models** are the basic data object in the framework --
	  // frequently representing a row in a table in a database on your server.
	  // A discrete chunk of data and a bunch of useful, related methods for
	  // performing computations and transformations on that data.
	
	  // Create a new model with the specified attributes. A client id (`cid`)
	  // is automatically generated and assigned for you.
	  var Model = Backbone.Model = function(attributes, options) {
	    var attrs = attributes || {};
	    options || (options = {});
	    this.cid = _.uniqueId(this.cidPrefix);
	    this.attributes = {};
	    if (options.collection) this.collection = options.collection;
	    if (options.parse) attrs = this.parse(attrs, options) || {};
	    var defaults = _.result(this, 'defaults');
	    attrs = _.defaults(_.extend({}, defaults, attrs), defaults);
	    this.set(attrs, options);
	    this.changed = {};
	    this.initialize.apply(this, arguments);
	  };
	
	  // Attach all inheritable methods to the Model prototype.
	  _.extend(Model.prototype, Events, {
	
	    // A hash of attributes whose current and previous value differ.
	    changed: null,
	
	    // The value returned during the last failed validation.
	    validationError: null,
	
	    // The default name for the JSON `id` attribute is `"id"`. MongoDB and
	    // CouchDB users may want to set this to `"_id"`.
	    idAttribute: 'id',
	
	    // The prefix is used to create the client id which is used to identify models locally.
	    // You may want to override this if you're experiencing name clashes with model ids.
	    cidPrefix: 'c',
	
	    // Initialize is an empty function by default. Override it with your own
	    // initialization logic.
	    initialize: function(){},
	
	    // Return a copy of the model's `attributes` object.
	    toJSON: function(options) {
	      return _.clone(this.attributes);
	    },
	
	    // Proxy `Backbone.sync` by default -- but override this if you need
	    // custom syncing semantics for *this* particular model.
	    sync: function() {
	      return Backbone.sync.apply(this, arguments);
	    },
	
	    // Get the value of an attribute.
	    get: function(attr) {
	      return this.attributes[attr];
	    },
	
	    // Get the HTML-escaped value of an attribute.
	    escape: function(attr) {
	      return _.escape(this.get(attr));
	    },
	
	    // Returns `true` if the attribute contains a value that is not null
	    // or undefined.
	    has: function(attr) {
	      return this.get(attr) != null;
	    },
	
	    // Special-cased proxy to underscore's `_.matches` method.
	    matches: function(attrs) {
	      return !!_.iteratee(attrs, this)(this.attributes);
	    },
	
	    // Set a hash of model attributes on the object, firing `"change"`. This is
	    // the core primitive operation of a model, updating the data and notifying
	    // anyone who needs to know about the change in state. The heart of the beast.
	    set: function(key, val, options) {
	      if (key == null) return this;
	
	      // Handle both `"key", value` and `{key: value}` -style arguments.
	      var attrs;
	      if (typeof key === 'object') {
	        attrs = key;
	        options = val;
	      } else {
	        (attrs = {})[key] = val;
	      }
	
	      options || (options = {});
	
	      // Run validation.
	      if (!this._validate(attrs, options)) return false;
	
	      // Extract attributes and options.
	      var unset      = options.unset;
	      var silent     = options.silent;
	      var changes    = [];
	      var changing   = this._changing;
	      this._changing = true;
	
	      if (!changing) {
	        this._previousAttributes = _.clone(this.attributes);
	        this.changed = {};
	      }
	
	      var current = this.attributes;
	      var changed = this.changed;
	      var prev    = this._previousAttributes;
	
	      // For each `set` attribute, update or delete the current value.
	      for (var attr in attrs) {
	        val = attrs[attr];
	        if (!_.isEqual(current[attr], val)) changes.push(attr);
	        if (!_.isEqual(prev[attr], val)) {
	          changed[attr] = val;
	        } else {
	          delete changed[attr];
	        }
	        unset ? delete current[attr] : current[attr] = val;
	      }
	
	      // Update the `id`.
	      if (this.idAttribute in attrs) this.id = this.get(this.idAttribute);
	
	      // Trigger all relevant attribute changes.
	      if (!silent) {
	        if (changes.length) this._pending = options;
	        for (var i = 0; i < changes.length; i++) {
	          this.trigger('change:' + changes[i], this, current[changes[i]], options);
	        }
	      }
	
	      // You might be wondering why there's a `while` loop here. Changes can
	      // be recursively nested within `"change"` events.
	      if (changing) return this;
	      if (!silent) {
	        while (this._pending) {
	          options = this._pending;
	          this._pending = false;
	          this.trigger('change', this, options);
	        }
	      }
	      this._pending = false;
	      this._changing = false;
	      return this;
	    },
	
	    // Remove an attribute from the model, firing `"change"`. `unset` is a noop
	    // if the attribute doesn't exist.
	    unset: function(attr, options) {
	      return this.set(attr, void 0, _.extend({}, options, {unset: true}));
	    },
	
	    // Clear all attributes on the model, firing `"change"`.
	    clear: function(options) {
	      var attrs = {};
	      for (var key in this.attributes) attrs[key] = void 0;
	      return this.set(attrs, _.extend({}, options, {unset: true}));
	    },
	
	    // Determine if the model has changed since the last `"change"` event.
	    // If you specify an attribute name, determine if that attribute has changed.
	    hasChanged: function(attr) {
	      if (attr == null) return !_.isEmpty(this.changed);
	      return _.has(this.changed, attr);
	    },
	
	    // Return an object containing all the attributes that have changed, or
	    // false if there are no changed attributes. Useful for determining what
	    // parts of a view need to be updated and/or what attributes need to be
	    // persisted to the server. Unset attributes will be set to undefined.
	    // You can also pass an attributes object to diff against the model,
	    // determining if there *would be* a change.
	    changedAttributes: function(diff) {
	      if (!diff) return this.hasChanged() ? _.clone(this.changed) : false;
	      var old = this._changing ? this._previousAttributes : this.attributes;
	      var changed = {};
	      for (var attr in diff) {
	        var val = diff[attr];
	        if (_.isEqual(old[attr], val)) continue;
	        changed[attr] = val;
	      }
	      return _.size(changed) ? changed : false;
	    },
	
	    // Get the previous value of an attribute, recorded at the time the last
	    // `"change"` event was fired.
	    previous: function(attr) {
	      if (attr == null || !this._previousAttributes) return null;
	      return this._previousAttributes[attr];
	    },
	
	    // Get all of the attributes of the model at the time of the previous
	    // `"change"` event.
	    previousAttributes: function() {
	      return _.clone(this._previousAttributes);
	    },
	
	    // Fetch the model from the server, merging the response with the model's
	    // local attributes. Any changed attributes will trigger a "change" event.
	    fetch: function(options) {
	      options = _.extend({parse: true}, options);
	      var model = this;
	      var success = options.success;
	      options.success = function(resp) {
	        var serverAttrs = options.parse ? model.parse(resp, options) : resp;
	        if (!model.set(serverAttrs, options)) return false;
	        if (success) success.call(options.context, model, resp, options);
	        model.trigger('sync', model, resp, options);
	      };
	      wrapError(this, options);
	      return this.sync('read', this, options);
	    },
	
	    // Set a hash of model attributes, and sync the model to the server.
	    // If the server returns an attributes hash that differs, the model's
	    // state will be `set` again.
	    save: function(key, val, options) {
	      // Handle both `"key", value` and `{key: value}` -style arguments.
	      var attrs;
	      if (key == null || typeof key === 'object') {
	        attrs = key;
	        options = val;
	      } else {
	        (attrs = {})[key] = val;
	      }
	
	      options = _.extend({validate: true, parse: true}, options);
	      var wait = options.wait;
	
	      // If we're not waiting and attributes exist, save acts as
	      // `set(attr).save(null, opts)` with validation. Otherwise, check if
	      // the model will be valid when the attributes, if any, are set.
	      if (attrs && !wait) {
	        if (!this.set(attrs, options)) return false;
	      } else if (!this._validate(attrs, options)) {
	        return false;
	      }
	
	      // After a successful server-side save, the client is (optionally)
	      // updated with the server-side state.
	      var model = this;
	      var success = options.success;
	      var attributes = this.attributes;
	      options.success = function(resp) {
	        // Ensure attributes are restored during synchronous saves.
	        model.attributes = attributes;
	        var serverAttrs = options.parse ? model.parse(resp, options) : resp;
	        if (wait) serverAttrs = _.extend({}, attrs, serverAttrs);
	        if (serverAttrs && !model.set(serverAttrs, options)) return false;
	        if (success) success.call(options.context, model, resp, options);
	        model.trigger('sync', model, resp, options);
	      };
	      wrapError(this, options);
	
	      // Set temporary attributes if `{wait: true}` to properly find new ids.
	      if (attrs && wait) this.attributes = _.extend({}, attributes, attrs);
	
	      var method = this.isNew() ? 'create' : (options.patch ? 'patch' : 'update');
	      if (method === 'patch' && !options.attrs) options.attrs = attrs;
	      var xhr = this.sync(method, this, options);
	
	      // Restore attributes.
	      this.attributes = attributes;
	
	      return xhr;
	    },
	
	    // Destroy this model on the server if it was already persisted.
	    // Optimistically removes the model from its collection, if it has one.
	    // If `wait: true` is passed, waits for the server to respond before removal.
	    destroy: function(options) {
	      options = options ? _.clone(options) : {};
	      var model = this;
	      var success = options.success;
	      var wait = options.wait;
	
	      var destroy = function() {
	        model.stopListening();
	        model.trigger('destroy', model, model.collection, options);
	      };
	
	      options.success = function(resp) {
	        if (wait) destroy();
	        if (success) success.call(options.context, model, resp, options);
	        if (!model.isNew()) model.trigger('sync', model, resp, options);
	      };
	
	      var xhr = false;
	      if (this.isNew()) {
	        _.defer(options.success);
	      } else {
	        wrapError(this, options);
	        xhr = this.sync('delete', this, options);
	      }
	      if (!wait) destroy();
	      return xhr;
	    },
	
	    // Default URL for the model's representation on the server -- if you're
	    // using Backbone's restful methods, override this to change the endpoint
	    // that will be called.
	    url: function() {
	      var base =
	        _.result(this, 'urlRoot') ||
	        _.result(this.collection, 'url') ||
	        urlError();
	      if (this.isNew()) return base;
	      var id = this.get(this.idAttribute);
	      return base.replace(/[^\/]$/, '$&/') + encodeURIComponent(id);
	    },
	
	    // **parse** converts a response into the hash of attributes to be `set` on
	    // the model. The default implementation is just to pass the response along.
	    parse: function(resp, options) {
	      return resp;
	    },
	
	    // Create a new model with identical attributes to this one.
	    clone: function() {
	      return new this.constructor(this.attributes);
	    },
	
	    // A model is new if it has never been saved to the server, and lacks an id.
	    isNew: function() {
	      return !this.has(this.idAttribute);
	    },
	
	    // Check if the model is currently in a valid state.
	    isValid: function(options) {
	      return this._validate({}, _.extend({}, options, {validate: true}));
	    },
	
	    // Run validation against the next complete set of model attributes,
	    // returning `true` if all is well. Otherwise, fire an `"invalid"` event.
	    _validate: function(attrs, options) {
	      if (!options.validate || !this.validate) return true;
	      attrs = _.extend({}, this.attributes, attrs);
	      var error = this.validationError = this.validate(attrs, options) || null;
	      if (!error) return true;
	      this.trigger('invalid', this, error, _.extend(options, {validationError: error}));
	      return false;
	    }
	
	  });
	
	  // Underscore methods that we want to implement on the Model, mapped to the
	  // number of arguments they take.
	  var modelMethods = {keys: 1, values: 1, pairs: 1, invert: 1, pick: 0,
	      omit: 0, chain: 1, isEmpty: 1};
	
	  // Mix in each Underscore method as a proxy to `Model#attributes`.
	  addUnderscoreMethods(Model, modelMethods, 'attributes');
	
	  // Backbone.Collection
	  // -------------------
	
	  // If models tend to represent a single row of data, a Backbone Collection is
	  // more analogous to a table full of data ... or a small slice or page of that
	  // table, or a collection of rows that belong together for a particular reason
	  // -- all of the messages in this particular folder, all of the documents
	  // belonging to this particular author, and so on. Collections maintain
	  // indexes of their models, both in order, and for lookup by `id`.
	
	  // Create a new **Collection**, perhaps to contain a specific type of `model`.
	  // If a `comparator` is specified, the Collection will maintain
	  // its models in sort order, as they're added and removed.
	  var Collection = Backbone.Collection = function(models, options) {
	    options || (options = {});
	    if (options.model) this.model = options.model;
	    if (options.comparator !== void 0) this.comparator = options.comparator;
	    this._reset();
	    this.initialize.apply(this, arguments);
	    if (models) this.reset(models, _.extend({silent: true}, options));
	  };
	
	  // Default options for `Collection#set`.
	  var setOptions = {add: true, remove: true, merge: true};
	  var addOptions = {add: true, remove: false};
	
	  // Splices `insert` into `array` at index `at`.
	  var splice = function(array, insert, at) {
	    at = Math.min(Math.max(at, 0), array.length);
	    var tail = Array(array.length - at);
	    var length = insert.length;
	    var i;
	    for (i = 0; i < tail.length; i++) tail[i] = array[i + at];
	    for (i = 0; i < length; i++) array[i + at] = insert[i];
	    for (i = 0; i < tail.length; i++) array[i + length + at] = tail[i];
	  };
	
	  // Define the Collection's inheritable methods.
	  _.extend(Collection.prototype, Events, {
	
	    // The default model for a collection is just a **Backbone.Model**.
	    // This should be overridden in most cases.
	    model: Model,
	
	    // Initialize is an empty function by default. Override it with your own
	    // initialization logic.
	    initialize: function(){},
	
	    // The JSON representation of a Collection is an array of the
	    // models' attributes.
	    toJSON: function(options) {
	      return this.map(function(model) { return model.toJSON(options); });
	    },
	
	    // Proxy `Backbone.sync` by default.
	    sync: function() {
	      return Backbone.sync.apply(this, arguments);
	    },
	
	    // Add a model, or list of models to the set. `models` may be Backbone
	    // Models or raw JavaScript objects to be converted to Models, or any
	    // combination of the two.
	    add: function(models, options) {
	      return this.set(models, _.extend({merge: false}, options, addOptions));
	    },
	
	    // Remove a model, or a list of models from the set.
	    remove: function(models, options) {
	      options = _.extend({}, options);
	      var singular = !_.isArray(models);
	      models = singular ? [models] : models.slice();
	      var removed = this._removeModels(models, options);
	      if (!options.silent && removed.length) {
	        options.changes = {added: [], merged: [], removed: removed};
	        this.trigger('update', this, options);
	      }
	      return singular ? removed[0] : removed;
	    },
	
	    // Update a collection by `set`-ing a new list of models, adding new ones,
	    // removing models that are no longer present, and merging models that
	    // already exist in the collection, as necessary. Similar to **Model#set**,
	    // the core operation for updating the data contained by the collection.
	    set: function(models, options) {
	      if (models == null) return;
	
	      options = _.extend({}, setOptions, options);
	      if (options.parse && !this._isModel(models)) {
	        models = this.parse(models, options) || [];
	      }
	
	      var singular = !_.isArray(models);
	      models = singular ? [models] : models.slice();
	
	      var at = options.at;
	      if (at != null) at = +at;
	      if (at > this.length) at = this.length;
	      if (at < 0) at += this.length + 1;
	
	      var set = [];
	      var toAdd = [];
	      var toMerge = [];
	      var toRemove = [];
	      var modelMap = {};
	
	      var add = options.add;
	      var merge = options.merge;
	      var remove = options.remove;
	
	      var sort = false;
	      var sortable = this.comparator && at == null && options.sort !== false;
	      var sortAttr = _.isString(this.comparator) ? this.comparator : null;
	
	      // Turn bare objects into model references, and prevent invalid models
	      // from being added.
	      var model, i;
	      for (i = 0; i < models.length; i++) {
	        model = models[i];
	
	        // If a duplicate is found, prevent it from being added and
	        // optionally merge it into the existing model.
	        var existing = this.get(model);
	        if (existing) {
	          if (merge && model !== existing) {
	            var attrs = this._isModel(model) ? model.attributes : model;
	            if (options.parse) attrs = existing.parse(attrs, options);
	            existing.set(attrs, options);
	            toMerge.push(existing);
	            if (sortable && !sort) sort = existing.hasChanged(sortAttr);
	          }
	          if (!modelMap[existing.cid]) {
	            modelMap[existing.cid] = true;
	            set.push(existing);
	          }
	          models[i] = existing;
	
	        // If this is a new, valid model, push it to the `toAdd` list.
	        } else if (add) {
	          model = models[i] = this._prepareModel(model, options);
	          if (model) {
	            toAdd.push(model);
	            this._addReference(model, options);
	            modelMap[model.cid] = true;
	            set.push(model);
	          }
	        }
	      }
	
	      // Remove stale models.
	      if (remove) {
	        for (i = 0; i < this.length; i++) {
	          model = this.models[i];
	          if (!modelMap[model.cid]) toRemove.push(model);
	        }
	        if (toRemove.length) this._removeModels(toRemove, options);
	      }
	
	      // See if sorting is needed, update `length` and splice in new models.
	      var orderChanged = false;
	      var replace = !sortable && add && remove;
	      if (set.length && replace) {
	        orderChanged = this.length !== set.length || _.some(this.models, function(m, index) {
	          return m !== set[index];
	        });
	        this.models.length = 0;
	        splice(this.models, set, 0);
	        this.length = this.models.length;
	      } else if (toAdd.length) {
	        if (sortable) sort = true;
	        splice(this.models, toAdd, at == null ? this.length : at);
	        this.length = this.models.length;
	      }
	
	      // Silently sort the collection if appropriate.
	      if (sort) this.sort({silent: true});
	
	      // Unless silenced, it's time to fire all appropriate add/sort/update events.
	      if (!options.silent) {
	        for (i = 0; i < toAdd.length; i++) {
	          if (at != null) options.index = at + i;
	          model = toAdd[i];
	          model.trigger('add', model, this, options);
	        }
	        if (sort || orderChanged) this.trigger('sort', this, options);
	        if (toAdd.length || toRemove.length || toMerge.length) {
	          options.changes = {
	            added: toAdd,
	            removed: toRemove,
	            merged: toMerge
	          };
	          this.trigger('update', this, options);
	        }
	      }
	
	      // Return the added (or merged) model (or models).
	      return singular ? models[0] : models;
	    },
	
	    // When you have more items than you want to add or remove individually,
	    // you can reset the entire set with a new list of models, without firing
	    // any granular `add` or `remove` events. Fires `reset` when finished.
	    // Useful for bulk operations and optimizations.
	    reset: function(models, options) {
	      options = options ? _.clone(options) : {};
	      for (var i = 0; i < this.models.length; i++) {
	        this._removeReference(this.models[i], options);
	      }
	      options.previousModels = this.models;
	      this._reset();
	      models = this.add(models, _.extend({silent: true}, options));
	      if (!options.silent) this.trigger('reset', this, options);
	      return models;
	    },
	
	    // Add a model to the end of the collection.
	    push: function(model, options) {
	      return this.add(model, _.extend({at: this.length}, options));
	    },
	
	    // Remove a model from the end of the collection.
	    pop: function(options) {
	      var model = this.at(this.length - 1);
	      return this.remove(model, options);
	    },
	
	    // Add a model to the beginning of the collection.
	    unshift: function(model, options) {
	      return this.add(model, _.extend({at: 0}, options));
	    },
	
	    // Remove a model from the beginning of the collection.
	    shift: function(options) {
	      var model = this.at(0);
	      return this.remove(model, options);
	    },
	
	    // Slice out a sub-array of models from the collection.
	    slice: function() {
	      return slice.apply(this.models, arguments);
	    },
	
	    // Get a model from the set by id, cid, model object with id or cid
	    // properties, or an attributes object that is transformed through modelId.
	    get: function(obj) {
	      if (obj == null) return void 0;
	      return this._byId[obj] ||
	        this._byId[this.modelId(obj.attributes || obj)] ||
	        obj.cid && this._byId[obj.cid];
	    },
	
	    // Returns `true` if the model is in the collection.
	    has: function(obj) {
	      return this.get(obj) != null;
	    },
	
	    // Get the model at the given index.
	    at: function(index) {
	      if (index < 0) index += this.length;
	      return this.models[index];
	    },
	
	    // Return models with matching attributes. Useful for simple cases of
	    // `filter`.
	    where: function(attrs, first) {
	      return this[first ? 'find' : 'filter'](attrs);
	    },
	
	    // Return the first model with matching attributes. Useful for simple cases
	    // of `find`.
	    findWhere: function(attrs) {
	      return this.where(attrs, true);
	    },
	
	    // Force the collection to re-sort itself. You don't need to call this under
	    // normal circumstances, as the set will maintain sort order as each item
	    // is added.
	    sort: function(options) {
	      var comparator = this.comparator;
	      if (!comparator) throw new Error('Cannot sort a set without a comparator');
	      options || (options = {});
	
	      var length = comparator.length;
	      if (_.isFunction(comparator)) comparator = _.bind(comparator, this);
	
	      // Run sort based on type of `comparator`.
	      if (length === 1 || _.isString(comparator)) {
	        this.models = this.sortBy(comparator);
	      } else {
	        this.models.sort(comparator);
	      }
	      if (!options.silent) this.trigger('sort', this, options);
	      return this;
	    },
	
	    // Pluck an attribute from each model in the collection.
	    pluck: function(attr) {
	      return this.map(attr + '');
	    },
	
	    // Fetch the default set of models for this collection, resetting the
	    // collection when they arrive. If `reset: true` is passed, the response
	    // data will be passed through the `reset` method instead of `set`.
	    fetch: function(options) {
	      options = _.extend({parse: true}, options);
	      var success = options.success;
	      var collection = this;
	      options.success = function(resp) {
	        var method = options.reset ? 'reset' : 'set';
	        collection[method](resp, options);
	        if (success) success.call(options.context, collection, resp, options);
	        collection.trigger('sync', collection, resp, options);
	      };
	      wrapError(this, options);
	      return this.sync('read', this, options);
	    },
	
	    // Create a new instance of a model in this collection. Add the model to the
	    // collection immediately, unless `wait: true` is passed, in which case we
	    // wait for the server to agree.
	    create: function(model, options) {
	      options = options ? _.clone(options) : {};
	      var wait = options.wait;
	      model = this._prepareModel(model, options);
	      if (!model) return false;
	      if (!wait) this.add(model, options);
	      var collection = this;
	      var success = options.success;
	      options.success = function(m, resp, callbackOpts) {
	        if (wait) collection.add(m, callbackOpts);
	        if (success) success.call(callbackOpts.context, m, resp, callbackOpts);
	      };
	      model.save(null, options);
	      return model;
	    },
	
	    // **parse** converts a response into a list of models to be added to the
	    // collection. The default implementation is just to pass it through.
	    parse: function(resp, options) {
	      return resp;
	    },
	
	    // Create a new collection with an identical list of models as this one.
	    clone: function() {
	      return new this.constructor(this.models, {
	        model: this.model,
	        comparator: this.comparator
	      });
	    },
	
	    // Define how to uniquely identify models in the collection.
	    modelId: function(attrs) {
	      return attrs[this.model.prototype.idAttribute || 'id'];
	    },
	
	    // Private method to reset all internal state. Called when the collection
	    // is first initialized or reset.
	    _reset: function() {
	      this.length = 0;
	      this.models = [];
	      this._byId  = {};
	    },
	
	    // Prepare a hash of attributes (or other model) to be added to this
	    // collection.
	    _prepareModel: function(attrs, options) {
	      if (this._isModel(attrs)) {
	        if (!attrs.collection) attrs.collection = this;
	        return attrs;
	      }
	      options = options ? _.clone(options) : {};
	      options.collection = this;
	      var model = new this.model(attrs, options);
	      if (!model.validationError) return model;
	      this.trigger('invalid', this, model.validationError, options);
	      return false;
	    },
	
	    // Internal method called by both remove and set.
	    _removeModels: function(models, options) {
	      var removed = [];
	      for (var i = 0; i < models.length; i++) {
	        var model = this.get(models[i]);
	        if (!model) continue;
	
	        var index = this.indexOf(model);
	        this.models.splice(index, 1);
	        this.length--;
	
	        // Remove references before triggering 'remove' event to prevent an
	        // infinite loop. #3693
	        delete this._byId[model.cid];
	        var id = this.modelId(model.attributes);
	        if (id != null) delete this._byId[id];
	
	        if (!options.silent) {
	          options.index = index;
	          model.trigger('remove', model, this, options);
	        }
	
	        removed.push(model);
	        this._removeReference(model, options);
	      }
	      return removed;
	    },
	
	    // Method for checking whether an object should be considered a model for
	    // the purposes of adding to the collection.
	    _isModel: function(model) {
	      return model instanceof Model;
	    },
	
	    // Internal method to create a model's ties to a collection.
	    _addReference: function(model, options) {
	      this._byId[model.cid] = model;
	      var id = this.modelId(model.attributes);
	      if (id != null) this._byId[id] = model;
	      model.on('all', this._onModelEvent, this);
	    },
	
	    // Internal method to sever a model's ties to a collection.
	    _removeReference: function(model, options) {
	      delete this._byId[model.cid];
	      var id = this.modelId(model.attributes);
	      if (id != null) delete this._byId[id];
	      if (this === model.collection) delete model.collection;
	      model.off('all', this._onModelEvent, this);
	    },
	
	    // Internal method called every time a model in the set fires an event.
	    // Sets need to update their indexes when models change ids. All other
	    // events simply proxy through. "add" and "remove" events that originate
	    // in other collections are ignored.
	    _onModelEvent: function(event, model, collection, options) {
	      if (model) {
	        if ((event === 'add' || event === 'remove') && collection !== this) return;
	        if (event === 'destroy') this.remove(model, options);
	        if (event === 'change') {
	          var prevId = this.modelId(model.previousAttributes());
	          var id = this.modelId(model.attributes);
	          if (prevId !== id) {
	            if (prevId != null) delete this._byId[prevId];
	            if (id != null) this._byId[id] = model;
	          }
	        }
	      }
	      this.trigger.apply(this, arguments);
	    }
	
	  });
	
	  // Underscore methods that we want to implement on the Collection.
	  // 90% of the core usefulness of Backbone Collections is actually implemented
	  // right here:
	  var collectionMethods = {forEach: 3, each: 3, map: 3, collect: 3, reduce: 0,
	      foldl: 0, inject: 0, reduceRight: 0, foldr: 0, find: 3, detect: 3, filter: 3,
	      select: 3, reject: 3, every: 3, all: 3, some: 3, any: 3, include: 3, includes: 3,
	      contains: 3, invoke: 0, max: 3, min: 3, toArray: 1, size: 1, first: 3,
	      head: 3, take: 3, initial: 3, rest: 3, tail: 3, drop: 3, last: 3,
	      without: 0, difference: 0, indexOf: 3, shuffle: 1, lastIndexOf: 3,
	      isEmpty: 1, chain: 1, sample: 3, partition: 3, groupBy: 3, countBy: 3,
	      sortBy: 3, indexBy: 3, findIndex: 3, findLastIndex: 3};
	
	  // Mix in each Underscore method as a proxy to `Collection#models`.
	  addUnderscoreMethods(Collection, collectionMethods, 'models');
	
	  // Backbone.View
	  // -------------
	
	  // Backbone Views are almost more convention than they are actual code. A View
	  // is simply a JavaScript object that represents a logical chunk of UI in the
	  // DOM. This might be a single item, an entire list, a sidebar or panel, or
	  // even the surrounding frame which wraps your whole app. Defining a chunk of
	  // UI as a **View** allows you to define your DOM events declaratively, without
	  // having to worry about render order ... and makes it easy for the view to
	  // react to specific changes in the state of your models.
	
	  // Creating a Backbone.View creates its initial element outside of the DOM,
	  // if an existing element is not provided...
	  var View = Backbone.View = function(options) {
	    this.cid = _.uniqueId('view');
	    _.extend(this, _.pick(options, viewOptions));
	    this._ensureElement();
	    this.initialize.apply(this, arguments);
	  };
	
	  // Cached regex to split keys for `delegate`.
	  var delegateEventSplitter = /^(\S+)\s*(.*)$/;
	
	  // List of view options to be set as properties.
	  var viewOptions = ['model', 'collection', 'el', 'id', 'attributes', 'className', 'tagName', 'events'];
	
	  // Set up all inheritable **Backbone.View** properties and methods.
	  _.extend(View.prototype, Events, {
	
	    // The default `tagName` of a View's element is `"div"`.
	    tagName: 'div',
	
	    // jQuery delegate for element lookup, scoped to DOM elements within the
	    // current view. This should be preferred to global lookups where possible.
	    $: function(selector) {
	      return this.$el.find(selector);
	    },
	
	    // Initialize is an empty function by default. Override it with your own
	    // initialization logic.
	    initialize: function(){},
	
	    // **render** is the core function that your view should override, in order
	    // to populate its element (`this.el`), with the appropriate HTML. The
	    // convention is for **render** to always return `this`.
	    render: function() {
	      return this;
	    },
	
	    // Remove this view by taking the element out of the DOM, and removing any
	    // applicable Backbone.Events listeners.
	    remove: function() {
	      this._removeElement();
	      this.stopListening();
	      return this;
	    },
	
	    // Remove this view's element from the document and all event listeners
	    // attached to it. Exposed for subclasses using an alternative DOM
	    // manipulation API.
	    _removeElement: function() {
	      this.$el.remove();
	    },
	
	    // Change the view's element (`this.el` property) and re-delegate the
	    // view's events on the new element.
	    setElement: function(element) {
	      this.undelegateEvents();
	      this._setElement(element);
	      this.delegateEvents();
	      return this;
	    },
	
	    // Creates the `this.el` and `this.$el` references for this view using the
	    // given `el`. `el` can be a CSS selector or an HTML string, a jQuery
	    // context or an element. Subclasses can override this to utilize an
	    // alternative DOM manipulation API and are only required to set the
	    // `this.el` property.
	    _setElement: function(el) {
	      this.$el = el instanceof Backbone.$ ? el : Backbone.$(el);
	      this.el = this.$el[0];
	    },
	
	    // Set callbacks, where `this.events` is a hash of
	    //
	    // *{"event selector": "callback"}*
	    //
	    //     {
	    //       'mousedown .title':  'edit',
	    //       'click .button':     'save',
	    //       'click .open':       function(e) { ... }
	    //     }
	    //
	    // pairs. Callbacks will be bound to the view, with `this` set properly.
	    // Uses event delegation for efficiency.
	    // Omitting the selector binds the event to `this.el`.
	    delegateEvents: function(events) {
	      events || (events = _.result(this, 'events'));
	      if (!events) return this;
	      this.undelegateEvents();
	      for (var key in events) {
	        var method = events[key];
	        if (!_.isFunction(method)) method = this[method];
	        if (!method) continue;
	        var match = key.match(delegateEventSplitter);
	        this.delegate(match[1], match[2], _.bind(method, this));
	      }
	      return this;
	    },
	
	    // Add a single event listener to the view's element (or a child element
	    // using `selector`). This only works for delegate-able events: not `focus`,
	    // `blur`, and not `change`, `submit`, and `reset` in Internet Explorer.
	    delegate: function(eventName, selector, listener) {
	      this.$el.on(eventName + '.delegateEvents' + this.cid, selector, listener);
	      return this;
	    },
	
	    // Clears all callbacks previously bound to the view by `delegateEvents`.
	    // You usually don't need to use this, but may wish to if you have multiple
	    // Backbone views attached to the same DOM element.
	    undelegateEvents: function() {
	      if (this.$el) this.$el.off('.delegateEvents' + this.cid);
	      return this;
	    },
	
	    // A finer-grained `undelegateEvents` for removing a single delegated event.
	    // `selector` and `listener` are both optional.
	    undelegate: function(eventName, selector, listener) {
	      this.$el.off(eventName + '.delegateEvents' + this.cid, selector, listener);
	      return this;
	    },
	
	    // Produces a DOM element to be assigned to your view. Exposed for
	    // subclasses using an alternative DOM manipulation API.
	    _createElement: function(tagName) {
	      return document.createElement(tagName);
	    },
	
	    // Ensure that the View has a DOM element to render into.
	    // If `this.el` is a string, pass it through `$()`, take the first
	    // matching element, and re-assign it to `el`. Otherwise, create
	    // an element from the `id`, `className` and `tagName` properties.
	    _ensureElement: function() {
	      if (!this.el) {
	        var attrs = _.extend({}, _.result(this, 'attributes'));
	        if (this.id) attrs.id = _.result(this, 'id');
	        if (this.className) attrs['class'] = _.result(this, 'className');
	        this.setElement(this._createElement(_.result(this, 'tagName')));
	        this._setAttributes(attrs);
	      } else {
	        this.setElement(_.result(this, 'el'));
	      }
	    },
	
	    // Set attributes from a hash on this view's element.  Exposed for
	    // subclasses using an alternative DOM manipulation API.
	    _setAttributes: function(attributes) {
	      this.$el.attr(attributes);
	    }
	
	  });
	
	  // Backbone.sync
	  // -------------
	
	  // Override this function to change the manner in which Backbone persists
	  // models to the server. You will be passed the type of request, and the
	  // model in question. By default, makes a RESTful Ajax request
	  // to the model's `url()`. Some possible customizations could be:
	  //
	  // * Use `setTimeout` to batch rapid-fire updates into a single request.
	  // * Send up the models as XML instead of JSON.
	  // * Persist models via WebSockets instead of Ajax.
	  //
	  // Turn on `Backbone.emulateHTTP` in order to send `PUT` and `DELETE` requests
	  // as `POST`, with a `_method` parameter containing the true HTTP method,
	  // as well as all requests with the body as `application/x-www-form-urlencoded`
	  // instead of `application/json` with the model in a param named `model`.
	  // Useful when interfacing with server-side languages like **PHP** that make
	  // it difficult to read the body of `PUT` requests.
	  Backbone.sync = function(method, model, options) {
	    var type = methodMap[method];
	
	    // Default options, unless specified.
	    _.defaults(options || (options = {}), {
	      emulateHTTP: Backbone.emulateHTTP,
	      emulateJSON: Backbone.emulateJSON
	    });
	
	    // Default JSON-request options.
	    var params = {type: type, dataType: 'json'};
	
	    // Ensure that we have a URL.
	    if (!options.url) {
	      params.url = _.result(model, 'url') || urlError();
	    }
	
	    // Ensure that we have the appropriate request data.
	    if (options.data == null && model && (method === 'create' || method === 'update' || method === 'patch')) {
	      params.contentType = 'application/json';
	      params.data = JSON.stringify(options.attrs || model.toJSON(options));
	    }
	
	    // For older servers, emulate JSON by encoding the request into an HTML-form.
	    if (options.emulateJSON) {
	      params.contentType = 'application/x-www-form-urlencoded';
	      params.data = params.data ? {model: params.data} : {};
	    }
	
	    // For older servers, emulate HTTP by mimicking the HTTP method with `_method`
	    // And an `X-HTTP-Method-Override` header.
	    if (options.emulateHTTP && (type === 'PUT' || type === 'DELETE' || type === 'PATCH')) {
	      params.type = 'POST';
	      if (options.emulateJSON) params.data._method = type;
	      var beforeSend = options.beforeSend;
	      options.beforeSend = function(xhr) {
	        xhr.setRequestHeader('X-HTTP-Method-Override', type);
	        if (beforeSend) return beforeSend.apply(this, arguments);
	      };
	    }
	
	    // Don't process data on a non-GET request.
	    if (params.type !== 'GET' && !options.emulateJSON) {
	      params.processData = false;
	    }
	
	    // Pass along `textStatus` and `errorThrown` from jQuery.
	    var error = options.error;
	    options.error = function(xhr, textStatus, errorThrown) {
	      options.textStatus = textStatus;
	      options.errorThrown = errorThrown;
	      if (error) error.call(options.context, xhr, textStatus, errorThrown);
	    };
	
	    // Make the request, allowing the user to override any Ajax options.
	    var xhr = options.xhr = Backbone.ajax(_.extend(params, options));
	    model.trigger('request', model, xhr, options);
	    return xhr;
	  };
	
	  // Map from CRUD to HTTP for our default `Backbone.sync` implementation.
	  var methodMap = {
	    'create': 'POST',
	    'update': 'PUT',
	    'patch': 'PATCH',
	    'delete': 'DELETE',
	    'read': 'GET'
	  };
	
	  // Set the default implementation of `Backbone.ajax` to proxy through to `$`.
	  // Override this if you'd like to use a different library.
	  Backbone.ajax = function() {
	    return Backbone.$.ajax.apply(Backbone.$, arguments);
	  };
	
	  // Backbone.Router
	  // ---------------
	
	  // Routers map faux-URLs to actions, and fire events when routes are
	  // matched. Creating a new one sets its `routes` hash, if not set statically.
	  var Router = Backbone.Router = function(options) {
	    options || (options = {});
	    if (options.routes) this.routes = options.routes;
	    this._bindRoutes();
	    this.initialize.apply(this, arguments);
	  };
	
	  // Cached regular expressions for matching named param parts and splatted
	  // parts of route strings.
	  var optionalParam = /\((.*?)\)/g;
	  var namedParam    = /(\(\?)?:\w+/g;
	  var splatParam    = /\*\w+/g;
	  var escapeRegExp  = /[\-{}\[\]+?.,\\\^$|#\s]/g;
	
	  // Set up all inheritable **Backbone.Router** properties and methods.
	  _.extend(Router.prototype, Events, {
	
	    // Initialize is an empty function by default. Override it with your own
	    // initialization logic.
	    initialize: function(){},
	
	    // Manually bind a single named route to a callback. For example:
	    //
	    //     this.route('search/:query/p:num', 'search', function(query, num) {
	    //       ...
	    //     });
	    //
	    route: function(route, name, callback) {
	      if (!_.isRegExp(route)) route = this._routeToRegExp(route);
	      if (_.isFunction(name)) {
	        callback = name;
	        name = '';
	      }
	      if (!callback) callback = this[name];
	      var router = this;
	      Backbone.history.route(route, function(fragment) {
	        var args = router._extractParameters(route, fragment);
	        if (router.execute(callback, args, name) !== false) {
	          router.trigger.apply(router, ['route:' + name].concat(args));
	          router.trigger('route', name, args);
	          Backbone.history.trigger('route', router, name, args);
	        }
	      });
	      return this;
	    },
	
	    // Execute a route handler with the provided parameters.  This is an
	    // excellent place to do pre-route setup or post-route cleanup.
	    execute: function(callback, args, name) {
	      if (callback) callback.apply(this, args);
	    },
	
	    // Simple proxy to `Backbone.history` to save a fragment into the history.
	    navigate: function(fragment, options) {
	      Backbone.history.navigate(fragment, options);
	      return this;
	    },
	
	    // Bind all defined routes to `Backbone.history`. We have to reverse the
	    // order of the routes here to support behavior where the most general
	    // routes can be defined at the bottom of the route map.
	    _bindRoutes: function() {
	      if (!this.routes) return;
	      this.routes = _.result(this, 'routes');
	      var route, routes = _.keys(this.routes);
	      while ((route = routes.pop()) != null) {
	        this.route(route, this.routes[route]);
	      }
	    },
	
	    // Convert a route string into a regular expression, suitable for matching
	    // against the current location hash.
	    _routeToRegExp: function(route) {
	      route = route.replace(escapeRegExp, '\\$&')
	                   .replace(optionalParam, '(?:$1)?')
	                   .replace(namedParam, function(match, optional) {
	                     return optional ? match : '([^/?]+)';
	                   })
	                   .replace(splatParam, '([^?]*?)');
	      return new RegExp('^' + route + '(?:\\?([\\s\\S]*))?$');
	    },
	
	    // Given a route, and a URL fragment that it matches, return the array of
	    // extracted decoded parameters. Empty or unmatched parameters will be
	    // treated as `null` to normalize cross-browser behavior.
	    _extractParameters: function(route, fragment) {
	      var params = route.exec(fragment).slice(1);
	      return _.map(params, function(param, i) {
	        // Don't decode the search params.
	        if (i === params.length - 1) return param || null;
	        return param ? decodeURIComponent(param) : null;
	      });
	    }
	
	  });
	
	  // Backbone.History
	  // ----------------
	
	  // Handles cross-browser history management, based on either
	  // [pushState](http://diveintohtml5.info/history.html) and real URLs, or
	  // [onhashchange](https://developer.mozilla.org/en-US/docs/DOM/window.onhashchange)
	  // and URL fragments. If the browser supports neither (old IE, natch),
	  // falls back to polling.
	  var History = Backbone.History = function() {
	    this.handlers = [];
	    this.checkUrl = _.bind(this.checkUrl, this);
	
	    // Ensure that `History` can be used outside of the browser.
	    if (typeof window !== 'undefined') {
	      this.location = window.location;
	      this.history = window.history;
	    }
	  };
	
	  // Cached regex for stripping a leading hash/slash and trailing space.
	  var routeStripper = /^[#\/]|\s+$/g;
	
	  // Cached regex for stripping leading and trailing slashes.
	  var rootStripper = /^\/+|\/+$/g;
	
	  // Cached regex for stripping urls of hash.
	  var pathStripper = /#.*$/;
	
	  // Has the history handling already been started?
	  History.started = false;
	
	  // Set up all inheritable **Backbone.History** properties and methods.
	  _.extend(History.prototype, Events, {
	
	    // The default interval to poll for hash changes, if necessary, is
	    // twenty times a second.
	    interval: 50,
	
	    // Are we at the app root?
	    atRoot: function() {
	      var path = this.location.pathname.replace(/[^\/]$/, '$&/');
	      return path === this.root && !this.getSearch();
	    },
	
	    // Does the pathname match the root?
	    matchRoot: function() {
	      var path = this.decodeFragment(this.location.pathname);
	      var rootPath = path.slice(0, this.root.length - 1) + '/';
	      return rootPath === this.root;
	    },
	
	    // Unicode characters in `location.pathname` are percent encoded so they're
	    // decoded for comparison. `%25` should not be decoded since it may be part
	    // of an encoded parameter.
	    decodeFragment: function(fragment) {
	      return decodeURI(fragment.replace(/%25/g, '%2525'));
	    },
	
	    // In IE6, the hash fragment and search params are incorrect if the
	    // fragment contains `?`.
	    getSearch: function() {
	      var match = this.location.href.replace(/#.*/, '').match(/\?.+/);
	      return match ? match[0] : '';
	    },
	
	    // Gets the true hash value. Cannot use location.hash directly due to bug
	    // in Firefox where location.hash will always be decoded.
	    getHash: function(window) {
	      var match = (window || this).location.href.match(/#(.*)$/);
	      return match ? match[1] : '';
	    },
	
	    // Get the pathname and search params, without the root.
	    getPath: function() {
	      var path = this.decodeFragment(
	        this.location.pathname + this.getSearch()
	      ).slice(this.root.length - 1);
	      return path.charAt(0) === '/' ? path.slice(1) : path;
	    },
	
	    // Get the cross-browser normalized URL fragment from the path or hash.
	    getFragment: function(fragment) {
	      if (fragment == null) {
	        if (this._usePushState || !this._wantsHashChange) {
	          fragment = this.getPath();
	        } else {
	          fragment = this.getHash();
	        }
	      }
	      return fragment.replace(routeStripper, '');
	    },
	
	    // Start the hash change handling, returning `true` if the current URL matches
	    // an existing route, and `false` otherwise.
	    start: function(options) {
	      if (History.started) throw new Error('Backbone.history has already been started');
	      History.started = true;
	
	      // Figure out the initial configuration. Do we need an iframe?
	      // Is pushState desired ... is it available?
	      this.options          = _.extend({root: '/'}, this.options, options);
	      this.root             = this.options.root;
	      this._wantsHashChange = this.options.hashChange !== false;
	      this._hasHashChange   = 'onhashchange' in window && (document.documentMode === void 0 || document.documentMode > 7);
	      this._useHashChange   = this._wantsHashChange && this._hasHashChange;
	      this._wantsPushState  = !!this.options.pushState;
	      this._hasPushState    = !!(this.history && this.history.pushState);
	      this._usePushState    = this._wantsPushState && this._hasPushState;
	      this.fragment         = this.getFragment();
	
	      // Normalize root to always include a leading and trailing slash.
	      this.root = ('/' + this.root + '/').replace(rootStripper, '/');
	
	      // Transition from hashChange to pushState or vice versa if both are
	      // requested.
	      if (this._wantsHashChange && this._wantsPushState) {
	
	        // If we've started off with a route from a `pushState`-enabled
	        // browser, but we're currently in a browser that doesn't support it...
	        if (!this._hasPushState && !this.atRoot()) {
	          var rootPath = this.root.slice(0, -1) || '/';
	          this.location.replace(rootPath + '#' + this.getPath());
	          // Return immediately as browser will do redirect to new url
	          return true;
	
	        // Or if we've started out with a hash-based route, but we're currently
	        // in a browser where it could be `pushState`-based instead...
	        } else if (this._hasPushState && this.atRoot()) {
	          this.navigate(this.getHash(), {replace: true});
	        }
	
	      }
	
	      // Proxy an iframe to handle location events if the browser doesn't
	      // support the `hashchange` event, HTML5 history, or the user wants
	      // `hashChange` but not `pushState`.
	      if (!this._hasHashChange && this._wantsHashChange && !this._usePushState) {
	        this.iframe = document.createElement('iframe');
	        this.iframe.src = 'javascript:0';
	        this.iframe.style.display = 'none';
	        this.iframe.tabIndex = -1;
	        var body = document.body;
	        // Using `appendChild` will throw on IE < 9 if the document is not ready.
	        var iWindow = body.insertBefore(this.iframe, body.firstChild).contentWindow;
	        iWindow.document.open();
	        iWindow.document.close();
	        iWindow.location.hash = '#' + this.fragment;
	      }
	
	      // Add a cross-platform `addEventListener` shim for older browsers.
	      var addEventListener = window.addEventListener || function(eventName, listener) {
	        return attachEvent('on' + eventName, listener);
	      };
	
	      // Depending on whether we're using pushState or hashes, and whether
	      // 'onhashchange' is supported, determine how we check the URL state.
	      if (this._usePushState) {
	        addEventListener('popstate', this.checkUrl, false);
	      } else if (this._useHashChange && !this.iframe) {
	        addEventListener('hashchange', this.checkUrl, false);
	      } else if (this._wantsHashChange) {
	        this._checkUrlInterval = setInterval(this.checkUrl, this.interval);
	      }
	
	      if (!this.options.silent) return this.loadUrl();
	    },
	
	    // Disable Backbone.history, perhaps temporarily. Not useful in a real app,
	    // but possibly useful for unit testing Routers.
	    stop: function() {
	      // Add a cross-platform `removeEventListener` shim for older browsers.
	      var removeEventListener = window.removeEventListener || function(eventName, listener) {
	        return detachEvent('on' + eventName, listener);
	      };
	
	      // Remove window listeners.
	      if (this._usePushState) {
	        removeEventListener('popstate', this.checkUrl, false);
	      } else if (this._useHashChange && !this.iframe) {
	        removeEventListener('hashchange', this.checkUrl, false);
	      }
	
	      // Clean up the iframe if necessary.
	      if (this.iframe) {
	        document.body.removeChild(this.iframe);
	        this.iframe = null;
	      }
	
	      // Some environments will throw when clearing an undefined interval.
	      if (this._checkUrlInterval) clearInterval(this._checkUrlInterval);
	      History.started = false;
	    },
	
	    // Add a route to be tested when the fragment changes. Routes added later
	    // may override previous routes.
	    route: function(route, callback) {
	      this.handlers.unshift({route: route, callback: callback});
	    },
	
	    // Checks the current URL to see if it has changed, and if it has,
	    // calls `loadUrl`, normalizing across the hidden iframe.
	    checkUrl: function(e) {
	      var current = this.getFragment();
	
	      // If the user pressed the back button, the iframe's hash will have
	      // changed and we should use that for comparison.
	      if (current === this.fragment && this.iframe) {
	        current = this.getHash(this.iframe.contentWindow);
	      }
	
	      if (current === this.fragment) return false;
	      if (this.iframe) this.navigate(current);
	      this.loadUrl();
	    },
	
	    // Attempt to load the current URL fragment. If a route succeeds with a
	    // match, returns `true`. If no defined routes matches the fragment,
	    // returns `false`.
	    loadUrl: function(fragment) {
	      // If the root doesn't match, no routes can match either.
	      if (!this.matchRoot()) return false;
	      fragment = this.fragment = this.getFragment(fragment);
	      return _.some(this.handlers, function(handler) {
	        if (handler.route.test(fragment)) {
	          handler.callback(fragment);
	          return true;
	        }
	      });
	    },
	
	    // Save a fragment into the hash history, or replace the URL state if the
	    // 'replace' option is passed. You are responsible for properly URL-encoding
	    // the fragment in advance.
	    //
	    // The options object can contain `trigger: true` if you wish to have the
	    // route callback be fired (not usually desirable), or `replace: true`, if
	    // you wish to modify the current URL without adding an entry to the history.
	    navigate: function(fragment, options) {
	      if (!History.started) return false;
	      if (!options || options === true) options = {trigger: !!options};
	
	      // Normalize the fragment.
	      fragment = this.getFragment(fragment || '');
	
	      // Don't include a trailing slash on the root.
	      var rootPath = this.root;
	      if (fragment === '' || fragment.charAt(0) === '?') {
	        rootPath = rootPath.slice(0, -1) || '/';
	      }
	      var url = rootPath + fragment;
	
	      // Strip the hash and decode for matching.
	      fragment = this.decodeFragment(fragment.replace(pathStripper, ''));
	
	      if (this.fragment === fragment) return;
	      this.fragment = fragment;
	
	      // If pushState is available, we use it to set the fragment as a real URL.
	      if (this._usePushState) {
	        this.history[options.replace ? 'replaceState' : 'pushState']({}, document.title, url);
	
	      // If hash changes haven't been explicitly disabled, update the hash
	      // fragment to store history.
	      } else if (this._wantsHashChange) {
	        this._updateHash(this.location, fragment, options.replace);
	        if (this.iframe && fragment !== this.getHash(this.iframe.contentWindow)) {
	          var iWindow = this.iframe.contentWindow;
	
	          // Opening and closing the iframe tricks IE7 and earlier to push a
	          // history entry on hash-tag change.  When replace is true, we don't
	          // want this.
	          if (!options.replace) {
	            iWindow.document.open();
	            iWindow.document.close();
	          }
	
	          this._updateHash(iWindow.location, fragment, options.replace);
	        }
	
	      // If you've told us that you explicitly don't want fallback hashchange-
	      // based history, then `navigate` becomes a page refresh.
	      } else {
	        return this.location.assign(url);
	      }
	      if (options.trigger) return this.loadUrl(fragment);
	    },
	
	    // Update the hash location, either replacing the current entry, or adding
	    // a new one to the browser history.
	    _updateHash: function(location, fragment, replace) {
	      if (replace) {
	        var href = location.href.replace(/(javascript:|#).*$/, '');
	        location.replace(href + '#' + fragment);
	      } else {
	        // Some browsers require that `hash` contains a leading #.
	        location.hash = '#' + fragment;
	      }
	    }
	
	  });
	
	  // Create the default Backbone.history.
	  Backbone.history = new History;
	
	  // Helpers
	  // -------
	
	  // Helper function to correctly set up the prototype chain for subclasses.
	  // Similar to `goog.inherits`, but uses a hash of prototype properties and
	  // class properties to be extended.
	  var extend = function(protoProps, staticProps) {
	    var parent = this;
	    var child;
	
	    // The constructor function for the new subclass is either defined by you
	    // (the "constructor" property in your `extend` definition), or defaulted
	    // by us to simply call the parent constructor.
	    if (protoProps && _.has(protoProps, 'constructor')) {
	      child = protoProps.constructor;
	    } else {
	      child = function(){ return parent.apply(this, arguments); };
	    }
	
	    // Add static properties to the constructor function, if supplied.
	    _.extend(child, parent, staticProps);
	
	    // Set the prototype chain to inherit from `parent`, without calling
	    // `parent`'s constructor function and add the prototype properties.
	    child.prototype = _.create(parent.prototype, protoProps);
	    child.prototype.constructor = child;
	
	    // Set a convenience property in case the parent's prototype is needed
	    // later.
	    child.__super__ = parent.prototype;
	
	    return child;
	  };
	
	  // Set up inheritance for the model, collection, router, view and history.
	  Model.extend = Collection.extend = Router.extend = View.extend = History.extend = extend;
	
	  // Throw an error when a URL is needed, and none is supplied.
	  var urlError = function() {
	    throw new Error('A "url" property or function must be specified');
	  };
	
	  // Wrap an optional error callback with a fallback error event.
	  var wrapError = function(model, options) {
	    var error = options.error;
	    options.error = function(resp) {
	      if (error) error.call(options.context, model, resp, options);
	      model.trigger('error', model, resp, options);
	    };
	  };
	
	  return Backbone;
	});
	
	/* WEBPACK VAR INJECTION */}.call(exports, (function() { return this; }())))

/***/ },
/* 5 */
/***/ function(module, exports, __webpack_require__) {

	var __WEBPACK_AMD_DEFINE_ARRAY__, __WEBPACK_AMD_DEFINE_RESULT__;// MarionetteJS (Backbone.Marionette)
	// ----------------------------------
	// v2.4.7
	//
	// Copyright (c)2016 Derick Bailey, Muted Solutions, LLC.
	// Distributed under MIT license
	//
	// http://marionettejs.com
	
	(function(root, factory) {
	
	  if (true) {
	    !(__WEBPACK_AMD_DEFINE_ARRAY__ = [__webpack_require__(4), __webpack_require__(3), __webpack_require__(6), __webpack_require__(7)], __WEBPACK_AMD_DEFINE_RESULT__ = function(Backbone, _) {
	      return (root.Marionette = root.Mn = factory(root, Backbone, _));
	    }.apply(exports, __WEBPACK_AMD_DEFINE_ARRAY__), __WEBPACK_AMD_DEFINE_RESULT__ !== undefined && (module.exports = __WEBPACK_AMD_DEFINE_RESULT__));
	  } else if (typeof exports !== 'undefined') {
	    var Backbone = require('backbone');
	    var _ = require('underscore');
	    var Wreqr = require('backbone.wreqr');
	    var BabySitter = require('backbone.babysitter');
	    module.exports = factory(root, Backbone, _);
	  } else {
	    root.Marionette = root.Mn = factory(root, root.Backbone, root._);
	  }
	
	}(this, function(root, Backbone, _) {
	  'use strict';
	
	  var previousMarionette = root.Marionette;
	  var previousMn = root.Mn;
	
	  var Marionette = Backbone.Marionette = {};
	
	  Marionette.VERSION = '2.4.7';
	
	  Marionette.noConflict = function() {
	    root.Marionette = previousMarionette;
	    root.Mn = previousMn;
	    return this;
	  };
	
	  // Get the Deferred creator for later use
	  Marionette.Deferred = Backbone.$.Deferred;
	
	  Marionette.FEATURES = {
	  };
	  
	  Marionette.isEnabled = function(name) {
	    return !!Marionette.FEATURES[name];
	  };
	  
	  /* jshint unused: false *//* global console */
	  
	  // Helpers
	  // -------
	  
	  // Marionette.extend
	  // -----------------
	  
	  // Borrow the Backbone `extend` method so we can use it as needed
	  Marionette.extend = Backbone.Model.extend;
	  
	  // Marionette.isNodeAttached
	  // -------------------------
	  
	  // Determine if `el` is a child of the document
	  Marionette.isNodeAttached = function(el) {
	    return Backbone.$.contains(document.documentElement, el);
	  };
	  
	  // Merge `keys` from `options` onto `this`
	  Marionette.mergeOptions = function(options, keys) {
	    if (!options) { return; }
	    _.extend(this, _.pick(options, keys));
	  };
	  
	  // Marionette.getOption
	  // --------------------
	  
	  // Retrieve an object, function or other value from a target
	  // object or its `options`, with `options` taking precedence.
	  Marionette.getOption = function(target, optionName) {
	    if (!target || !optionName) { return; }
	    if (target.options && (target.options[optionName] !== undefined)) {
	      return target.options[optionName];
	    } else {
	      return target[optionName];
	    }
	  };
	  
	  // Proxy `Marionette.getOption`
	  Marionette.proxyGetOption = function(optionName) {
	    return Marionette.getOption(this, optionName);
	  };
	  
	  // Similar to `_.result`, this is a simple helper
	  // If a function is provided we call it with context
	  // otherwise just return the value. If the value is
	  // undefined return a default value
	  Marionette._getValue = function(value, context, params) {
	    if (_.isFunction(value)) {
	      value = params ? value.apply(context, params) : value.call(context);
	    }
	    return value;
	  };
	  
	  // Marionette.normalizeMethods
	  // ----------------------
	  
	  // Pass in a mapping of events => functions or function names
	  // and return a mapping of events => functions
	  Marionette.normalizeMethods = function(hash) {
	    return _.reduce(hash, function(normalizedHash, method, name) {
	      if (!_.isFunction(method)) {
	        method = this[method];
	      }
	      if (method) {
	        normalizedHash[name] = method;
	      }
	      return normalizedHash;
	    }, {}, this);
	  };
	  
	  // utility method for parsing @ui. syntax strings
	  // into associated selector
	  Marionette.normalizeUIString = function(uiString, ui) {
	    return uiString.replace(/@ui\.[a-zA-Z-_$0-9]*/g, function(r) {
	      return ui[r.slice(4)];
	    });
	  };
	  
	  // allows for the use of the @ui. syntax within
	  // a given key for triggers and events
	  // swaps the @ui with the associated selector.
	  // Returns a new, non-mutated, parsed events hash.
	  Marionette.normalizeUIKeys = function(hash, ui) {
	    return _.reduce(hash, function(memo, val, key) {
	      var normalizedKey = Marionette.normalizeUIString(key, ui);
	      memo[normalizedKey] = val;
	      return memo;
	    }, {});
	  };
	  
	  // allows for the use of the @ui. syntax within
	  // a given value for regions
	  // swaps the @ui with the associated selector
	  Marionette.normalizeUIValues = function(hash, ui, properties) {
	    _.each(hash, function(val, key) {
	      if (_.isString(val)) {
	        hash[key] = Marionette.normalizeUIString(val, ui);
	      } else if (_.isObject(val) && _.isArray(properties)) {
	        _.extend(val, Marionette.normalizeUIValues(_.pick(val, properties), ui));
	        /* Value is an object, and we got an array of embedded property names to normalize. */
	        _.each(properties, function(property) {
	          var propertyVal = val[property];
	          if (_.isString(propertyVal)) {
	            val[property] = Marionette.normalizeUIString(propertyVal, ui);
	          }
	        });
	      }
	    });
	    return hash;
	  };
	  
	  // Mix in methods from Underscore, for iteration, and other
	  // collection related features.
	  // Borrowing this code from Backbone.Collection:
	  // http://backbonejs.org/docs/backbone.html#section-121
	  Marionette.actAsCollection = function(object, listProperty) {
	    var methods = ['forEach', 'each', 'map', 'find', 'detect', 'filter',
	      'select', 'reject', 'every', 'all', 'some', 'any', 'include',
	      'contains', 'invoke', 'toArray', 'first', 'initial', 'rest',
	      'last', 'without', 'isEmpty', 'pluck'];
	  
	    _.each(methods, function(method) {
	      object[method] = function() {
	        var list = _.values(_.result(this, listProperty));
	        var args = [list].concat(_.toArray(arguments));
	        return _[method].apply(_, args);
	      };
	    });
	  };
	  
	  var deprecate = Marionette.deprecate = function(message, test) {
	    if (_.isObject(message)) {
	      message = (
	        message.prev + ' is going to be removed in the future. ' +
	        'Please use ' + message.next + ' instead.' +
	        (message.url ? ' See: ' + message.url : '')
	      );
	    }
	  
	    if ((test === undefined || !test) && !deprecate._cache[message]) {
	      deprecate._warn('Deprecation warning: ' + message);
	      deprecate._cache[message] = true;
	    }
	  };
	  
	  deprecate._console = typeof console !== 'undefined' ? console : {};
	  deprecate._warn = function() {
	    var warn = deprecate._console.warn || deprecate._console.log || function() {};
	    return warn.apply(deprecate._console, arguments);
	  };
	  deprecate._cache = {};
	  
	  /* jshint maxstatements: 14, maxcomplexity: 7 */
	  
	  // Trigger Method
	  // --------------
	  
	  Marionette._triggerMethod = (function() {
	    // split the event name on the ":"
	    var splitter = /(^|:)(\w)/gi;
	  
	    // take the event section ("section1:section2:section3")
	    // and turn it in to uppercase name
	    function getEventName(match, prefix, eventName) {
	      return eventName.toUpperCase();
	    }
	  
	    return function(context, event, args) {
	      var noEventArg = arguments.length < 3;
	      if (noEventArg) {
	        args = event;
	        event = args[0];
	      }
	  
	      // get the method name from the event name
	      var methodName = 'on' + event.replace(splitter, getEventName);
	      var method = context[methodName];
	      var result;
	  
	      // call the onMethodName if it exists
	      if (_.isFunction(method)) {
	        // pass all args, except the event name
	        result = method.apply(context, noEventArg ? _.rest(args) : args);
	      }
	  
	      // trigger the event, if a trigger method exists
	      if (_.isFunction(context.trigger)) {
	        if (noEventArg + args.length > 1) {
	          context.trigger.apply(context, noEventArg ? args : [event].concat(_.drop(args, 0)));
	        } else {
	          context.trigger(event);
	        }
	      }
	  
	      return result;
	    };
	  })();
	  
	  // Trigger an event and/or a corresponding method name. Examples:
	  //
	  // `this.triggerMethod("foo")` will trigger the "foo" event and
	  // call the "onFoo" method.
	  //
	  // `this.triggerMethod("foo:bar")` will trigger the "foo:bar" event and
	  // call the "onFooBar" method.
	  Marionette.triggerMethod = function(event) {
	    return Marionette._triggerMethod(this, arguments);
	  };
	  
	  // triggerMethodOn invokes triggerMethod on a specific context
	  //
	  // e.g. `Marionette.triggerMethodOn(view, 'show')`
	  // will trigger a "show" event or invoke onShow the view.
	  Marionette.triggerMethodOn = function(context) {
	    var fnc = _.isFunction(context.triggerMethod) ?
	                  context.triggerMethod :
	                  Marionette.triggerMethod;
	  
	    return fnc.apply(context, _.rest(arguments));
	  };
	  
	  // DOM Refresh
	  // -----------
	  
	  // Monitor a view's state, and after it has been rendered and shown
	  // in the DOM, trigger a "dom:refresh" event every time it is
	  // re-rendered.
	  
	  Marionette.MonitorDOMRefresh = function(view) {
	    if (view._isDomRefreshMonitored) { return; }
	    view._isDomRefreshMonitored = true;
	  
	    // track when the view has been shown in the DOM,
	    // using a Marionette.Region (or by other means of triggering "show")
	    function handleShow() {
	      view._isShown = true;
	      triggerDOMRefresh();
	    }
	  
	    // track when the view has been rendered
	    function handleRender() {
	      view._isRendered = true;
	      triggerDOMRefresh();
	    }
	  
	    // Trigger the "dom:refresh" event and corresponding "onDomRefresh" method
	    function triggerDOMRefresh() {
	      if (view._isShown && view._isRendered && Marionette.isNodeAttached(view.el)) {
	        Marionette.triggerMethodOn(view, 'dom:refresh', view);
	      }
	    }
	  
	    view.on({
	      show: handleShow,
	      render: handleRender
	    });
	  };
	  
	  /* jshint maxparams: 5 */
	  
	  // Bind Entity Events & Unbind Entity Events
	  // -----------------------------------------
	  //
	  // These methods are used to bind/unbind a backbone "entity" (e.g. collection/model)
	  // to methods on a target object.
	  //
	  // The first parameter, `target`, must have the Backbone.Events module mixed in.
	  //
	  // The second parameter is the `entity` (Backbone.Model, Backbone.Collection or
	  // any object that has Backbone.Events mixed in) to bind the events from.
	  //
	  // The third parameter is a hash of { "event:name": "eventHandler" }
	  // configuration. Multiple handlers can be separated by a space. A
	  // function can be supplied instead of a string handler name.
	  
	  (function(Marionette) {
	    'use strict';
	  
	    // Bind the event to handlers specified as a string of
	    // handler names on the target object
	    function bindFromStrings(target, entity, evt, methods) {
	      var methodNames = methods.split(/\s+/);
	  
	      _.each(methodNames, function(methodName) {
	  
	        var method = target[methodName];
	        if (!method) {
	          throw new Marionette.Error('Method "' + methodName +
	            '" was configured as an event handler, but does not exist.');
	        }
	  
	        target.listenTo(entity, evt, method);
	      });
	    }
	  
	    // Bind the event to a supplied callback function
	    function bindToFunction(target, entity, evt, method) {
	      target.listenTo(entity, evt, method);
	    }
	  
	    // Bind the event to handlers specified as a string of
	    // handler names on the target object
	    function unbindFromStrings(target, entity, evt, methods) {
	      var methodNames = methods.split(/\s+/);
	  
	      _.each(methodNames, function(methodName) {
	        var method = target[methodName];
	        target.stopListening(entity, evt, method);
	      });
	    }
	  
	    // Bind the event to a supplied callback function
	    function unbindToFunction(target, entity, evt, method) {
	      target.stopListening(entity, evt, method);
	    }
	  
	    // generic looping function
	    function iterateEvents(target, entity, bindings, functionCallback, stringCallback) {
	      if (!entity || !bindings) { return; }
	  
	      // type-check bindings
	      if (!_.isObject(bindings)) {
	        throw new Marionette.Error({
	          message: 'Bindings must be an object or function.',
	          url: 'marionette.functions.html#marionettebindentityevents'
	        });
	      }
	  
	      // allow the bindings to be a function
	      bindings = Marionette._getValue(bindings, target);
	  
	      // iterate the bindings and bind them
	      _.each(bindings, function(methods, evt) {
	  
	        // allow for a function as the handler,
	        // or a list of event names as a string
	        if (_.isFunction(methods)) {
	          functionCallback(target, entity, evt, methods);
	        } else {
	          stringCallback(target, entity, evt, methods);
	        }
	  
	      });
	    }
	  
	    // Export Public API
	    Marionette.bindEntityEvents = function(target, entity, bindings) {
	      iterateEvents(target, entity, bindings, bindToFunction, bindFromStrings);
	    };
	  
	    Marionette.unbindEntityEvents = function(target, entity, bindings) {
	      iterateEvents(target, entity, bindings, unbindToFunction, unbindFromStrings);
	    };
	  
	    // Proxy `bindEntityEvents`
	    Marionette.proxyBindEntityEvents = function(entity, bindings) {
	      return Marionette.bindEntityEvents(this, entity, bindings);
	    };
	  
	    // Proxy `unbindEntityEvents`
	    Marionette.proxyUnbindEntityEvents = function(entity, bindings) {
	      return Marionette.unbindEntityEvents(this, entity, bindings);
	    };
	  })(Marionette);
	  
	
	  // Error
	  // -----
	  
	  var errorProps = ['description', 'fileName', 'lineNumber', 'name', 'message', 'number'];
	  
	  Marionette.Error = Marionette.extend.call(Error, {
	    urlRoot: 'http://marionettejs.com/docs/v' + Marionette.VERSION + '/',
	  
	    constructor: function(message, options) {
	      if (_.isObject(message)) {
	        options = message;
	        message = options.message;
	      } else if (!options) {
	        options = {};
	      }
	  
	      var error = Error.call(this, message);
	      _.extend(this, _.pick(error, errorProps), _.pick(options, errorProps));
	  
	      this.captureStackTrace();
	  
	      if (options.url) {
	        this.url = this.urlRoot + options.url;
	      }
	    },
	  
	    captureStackTrace: function() {
	      if (Error.captureStackTrace) {
	        Error.captureStackTrace(this, Marionette.Error);
	      }
	    },
	  
	    toString: function() {
	      return this.name + ': ' + this.message + (this.url ? ' See: ' + this.url : '');
	    }
	  });
	  
	  Marionette.Error.extend = Marionette.extend;
	  
	  // Callbacks
	  // ---------
	  
	  // A simple way of managing a collection of callbacks
	  // and executing them at a later point in time, using jQuery's
	  // `Deferred` object.
	  Marionette.Callbacks = function() {
	    this._deferred = Marionette.Deferred();
	    this._callbacks = [];
	  };
	  
	  _.extend(Marionette.Callbacks.prototype, {
	  
	    // Add a callback to be executed. Callbacks added here are
	    // guaranteed to execute, even if they are added after the
	    // `run` method is called.
	    add: function(callback, contextOverride) {
	      var promise = _.result(this._deferred, 'promise');
	  
	      this._callbacks.push({cb: callback, ctx: contextOverride});
	  
	      promise.then(function(args) {
	        if (contextOverride) { args.context = contextOverride; }
	        callback.call(args.context, args.options);
	      });
	    },
	  
	    // Run all registered callbacks with the context specified.
	    // Additional callbacks can be added after this has been run
	    // and they will still be executed.
	    run: function(options, context) {
	      this._deferred.resolve({
	        options: options,
	        context: context
	      });
	    },
	  
	    // Resets the list of callbacks to be run, allowing the same list
	    // to be run multiple times - whenever the `run` method is called.
	    reset: function() {
	      var callbacks = this._callbacks;
	      this._deferred = Marionette.Deferred();
	      this._callbacks = [];
	  
	      _.each(callbacks, function(cb) {
	        this.add(cb.cb, cb.ctx);
	      }, this);
	    }
	  });
	  
	  // Controller
	  // ----------
	  
	  // A multi-purpose object to use as a controller for
	  // modules and routers, and as a mediator for workflow
	  // and coordination of other objects, views, and more.
	  Marionette.Controller = function(options) {
	    this.options = options || {};
	  
	    if (_.isFunction(this.initialize)) {
	      this.initialize(this.options);
	    }
	  };
	  
	  Marionette.Controller.extend = Marionette.extend;
	  
	  // Controller Methods
	  // --------------
	  
	  // Ensure it can trigger events with Backbone.Events
	  _.extend(Marionette.Controller.prototype, Backbone.Events, {
	    destroy: function() {
	      Marionette._triggerMethod(this, 'before:destroy', arguments);
	      Marionette._triggerMethod(this, 'destroy', arguments);
	  
	      this.stopListening();
	      this.off();
	      return this;
	    },
	  
	    // import the `triggerMethod` to trigger events with corresponding
	    // methods if the method exists
	    triggerMethod: Marionette.triggerMethod,
	  
	    // A handy way to merge options onto the instance
	    mergeOptions: Marionette.mergeOptions,
	  
	    // Proxy `getOption` to enable getting options from this or this.options by name.
	    getOption: Marionette.proxyGetOption
	  
	  });
	  
	  // Object
	  // ------
	  
	  // A Base Class that other Classes should descend from.
	  // Object borrows many conventions and utilities from Backbone.
	  Marionette.Object = function(options) {
	    this.options = _.extend({}, _.result(this, 'options'), options);
	  
	    this.initialize.apply(this, arguments);
	  };
	  
	  Marionette.Object.extend = Marionette.extend;
	  
	  // Object Methods
	  // --------------
	  
	  // Ensure it can trigger events with Backbone.Events
	  _.extend(Marionette.Object.prototype, Backbone.Events, {
	  
	    //this is a noop method intended to be overridden by classes that extend from this base
	    initialize: function() {},
	  
	    destroy: function(options) {
	      options = options || {};
	  
	      this.triggerMethod('before:destroy', options);
	      this.triggerMethod('destroy', options);
	      this.stopListening();
	  
	      return this;
	    },
	  
	    // Import the `triggerMethod` to trigger events with corresponding
	    // methods if the method exists
	    triggerMethod: Marionette.triggerMethod,
	  
	    // A handy way to merge options onto the instance
	    mergeOptions: Marionette.mergeOptions,
	  
	    // Proxy `getOption` to enable getting options from this or this.options by name.
	    getOption: Marionette.proxyGetOption,
	  
	    // Proxy `bindEntityEvents` to enable binding view's events from another entity.
	    bindEntityEvents: Marionette.proxyBindEntityEvents,
	  
	    // Proxy `unbindEntityEvents` to enable unbinding view's events from another entity.
	    unbindEntityEvents: Marionette.proxyUnbindEntityEvents
	  });
	  
	  /* jshint maxcomplexity: 16, maxstatements: 45, maxlen: 120 */
	  
	  // Region
	  // ------
	  
	  // Manage the visual regions of your composite application. See
	  // http://lostechies.com/derickbailey/2011/12/12/composite-js-apps-regions-and-region-managers/
	  
	  Marionette.Region = Marionette.Object.extend({
	    constructor: function(options) {
	  
	      // set options temporarily so that we can get `el`.
	      // options will be overriden by Object.constructor
	      this.options = options || {};
	      this.el = this.getOption('el');
	  
	      // Handle when this.el is passed in as a $ wrapped element.
	      this.el = this.el instanceof Backbone.$ ? this.el[0] : this.el;
	  
	      if (!this.el) {
	        throw new Marionette.Error({
	          name: 'NoElError',
	          message: 'An "el" must be specified for a region.'
	        });
	      }
	  
	      this.$el = this.getEl(this.el);
	      Marionette.Object.call(this, options);
	    },
	  
	    // Displays a backbone view instance inside of the region.
	    // Handles calling the `render` method for you. Reads content
	    // directly from the `el` attribute. Also calls an optional
	    // `onShow` and `onDestroy` method on your view, just after showing
	    // or just before destroying the view, respectively.
	    // The `preventDestroy` option can be used to prevent a view from
	    // the old view being destroyed on show.
	    // The `forceShow` option can be used to force a view to be
	    // re-rendered if it's already shown in the region.
	    show: function(view, options) {
	      if (!this._ensureElement()) {
	        return;
	      }
	  
	      this._ensureViewIsIntact(view);
	      Marionette.MonitorDOMRefresh(view);
	  
	      var showOptions     = options || {};
	      var isDifferentView = view !== this.currentView;
	      var preventDestroy  = !!showOptions.preventDestroy;
	      var forceShow       = !!showOptions.forceShow;
	  
	      // We are only changing the view if there is a current view to change to begin with
	      var isChangingView = !!this.currentView;
	  
	      // Only destroy the current view if we don't want to `preventDestroy` and if
	      // the view given in the first argument is different than `currentView`
	      var _shouldDestroyView = isDifferentView && !preventDestroy;
	  
	      // Only show the view given in the first argument if it is different than
	      // the current view or if we want to re-show the view. Note that if
	      // `_shouldDestroyView` is true, then `_shouldShowView` is also necessarily true.
	      var _shouldShowView = isDifferentView || forceShow;
	  
	      if (isChangingView) {
	        this.triggerMethod('before:swapOut', this.currentView, this, options);
	      }
	  
	      if (this.currentView && isDifferentView) {
	        delete this.currentView._parent;
	      }
	  
	      if (_shouldDestroyView) {
	        this.empty();
	  
	      // A `destroy` event is attached to the clean up manually removed views.
	      // We need to detach this event when a new view is going to be shown as it
	      // is no longer relevant.
	      } else if (isChangingView && _shouldShowView) {
	        this.currentView.off('destroy', this.empty, this);
	      }
	  
	      if (_shouldShowView) {
	  
	        // We need to listen for if a view is destroyed
	        // in a way other than through the region.
	        // If this happens we need to remove the reference
	        // to the currentView since once a view has been destroyed
	        // we can not reuse it.
	        view.once('destroy', this.empty, this);
	  
	        // make this region the view's parent,
	        // It's important that this parent binding happens before rendering
	        // so that any events the child may trigger during render can also be
	        // triggered on the child's ancestor views
	        view._parent = this;
	        this._renderView(view);
	  
	        if (isChangingView) {
	          this.triggerMethod('before:swap', view, this, options);
	        }
	  
	        this.triggerMethod('before:show', view, this, options);
	        Marionette.triggerMethodOn(view, 'before:show', view, this, options);
	  
	        if (isChangingView) {
	          this.triggerMethod('swapOut', this.currentView, this, options);
	        }
	  
	        // An array of views that we're about to display
	        var attachedRegion = Marionette.isNodeAttached(this.el);
	  
	        // The views that we're about to attach to the document
	        // It's important that we prevent _getNestedViews from being executed unnecessarily
	        // as it's a potentially-slow method
	        var displayedViews = [];
	  
	        var attachOptions = _.extend({
	          triggerBeforeAttach: this.triggerBeforeAttach,
	          triggerAttach: this.triggerAttach
	        }, showOptions);
	  
	        if (attachedRegion && attachOptions.triggerBeforeAttach) {
	          displayedViews = this._displayedViews(view);
	          this._triggerAttach(displayedViews, 'before:');
	        }
	  
	        this.attachHtml(view);
	        this.currentView = view;
	  
	        if (attachedRegion && attachOptions.triggerAttach) {
	          displayedViews = this._displayedViews(view);
	          this._triggerAttach(displayedViews);
	        }
	  
	        if (isChangingView) {
	          this.triggerMethod('swap', view, this, options);
	        }
	  
	        this.triggerMethod('show', view, this, options);
	        Marionette.triggerMethodOn(view, 'show', view, this, options);
	  
	        return this;
	      }
	  
	      return this;
	    },
	  
	    triggerBeforeAttach: true,
	    triggerAttach: true,
	  
	    _triggerAttach: function(views, prefix) {
	      var eventName = (prefix || '') + 'attach';
	      _.each(views, function(view) {
	        Marionette.triggerMethodOn(view, eventName, view, this);
	      }, this);
	    },
	  
	    _displayedViews: function(view) {
	      return _.union([view], _.result(view, '_getNestedViews') || []);
	    },
	  
	    _renderView: function(view) {
	      if (!view.supportsRenderLifecycle) {
	        Marionette.triggerMethodOn(view, 'before:render', view);
	      }
	      view.render();
	      if (!view.supportsRenderLifecycle) {
	        Marionette.triggerMethodOn(view, 'render', view);
	      }
	    },
	  
	    _ensureElement: function() {
	      if (!_.isObject(this.el)) {
	        this.$el = this.getEl(this.el);
	        this.el = this.$el[0];
	      }
	  
	      if (!this.$el || this.$el.length === 0) {
	        if (this.getOption('allowMissingEl')) {
	          return false;
	        } else {
	          throw new Marionette.Error('An "el" ' + this.$el.selector + ' must exist in DOM');
	        }
	      }
	      return true;
	    },
	  
	    _ensureViewIsIntact: function(view) {
	      if (!view) {
	        throw new Marionette.Error({
	          name: 'ViewNotValid',
	          message: 'The view passed is undefined and therefore invalid. You must pass a view instance to show.'
	        });
	      }
	  
	      if (view.isDestroyed) {
	        throw new Marionette.Error({
	          name: 'ViewDestroyedError',
	          message: 'View (cid: "' + view.cid + '") has already been destroyed and cannot be used.'
	        });
	      }
	    },
	  
	    // Override this method to change how the region finds the DOM
	    // element that it manages. Return a jQuery selector object scoped
	    // to a provided parent el or the document if none exists.
	    getEl: function(el) {
	      return Backbone.$(el, Marionette._getValue(this.options.parentEl, this));
	    },
	  
	    // Override this method to change how the new view is
	    // appended to the `$el` that the region is managing
	    attachHtml: function(view) {
	      this.$el.contents().detach();
	  
	      this.el.appendChild(view.el);
	    },
	  
	    // Destroy the current view, if there is one. If there is no
	    // current view, it does nothing and returns immediately.
	    empty: function(options) {
	      var view = this.currentView;
	  
	      var emptyOptions = options || {};
	      var preventDestroy  = !!emptyOptions.preventDestroy;
	      // If there is no view in the region
	      // we should not remove anything
	      if (!view) { return this; }
	  
	      view.off('destroy', this.empty, this);
	      this.triggerMethod('before:empty', view);
	      if (!preventDestroy) {
	        this._destroyView();
	      }
	      this.triggerMethod('empty', view);
	  
	      // Remove region pointer to the currentView
	      delete this.currentView;
	  
	      if (preventDestroy) {
	        this.$el.contents().detach();
	      }
	  
	      return this;
	    },
	  
	    // call 'destroy' or 'remove', depending on which is found
	    // on the view (if showing a raw Backbone view or a Marionette View)
	    _destroyView: function() {
	      var view = this.currentView;
	      if (view.isDestroyed) { return; }
	  
	      if (!view.supportsDestroyLifecycle) {
	        Marionette.triggerMethodOn(view, 'before:destroy', view);
	      }
	      if (view.destroy) {
	        view.destroy();
	      } else {
	        view.remove();
	  
	        // appending isDestroyed to raw Backbone View allows regions
	        // to throw a ViewDestroyedError for this view
	        view.isDestroyed = true;
	      }
	      if (!view.supportsDestroyLifecycle) {
	        Marionette.triggerMethodOn(view, 'destroy', view);
	      }
	    },
	  
	    // Attach an existing view to the region. This
	    // will not call `render` or `onShow` for the new view,
	    // and will not replace the current HTML for the `el`
	    // of the region.
	    attachView: function(view) {
	      if (this.currentView) {
	        delete this.currentView._parent;
	      }
	      view._parent = this;
	      this.currentView = view;
	      return this;
	    },
	  
	    // Checks whether a view is currently present within
	    // the region. Returns `true` if there is and `false` if
	    // no view is present.
	    hasView: function() {
	      return !!this.currentView;
	    },
	  
	    // Reset the region by destroying any existing view and
	    // clearing out the cached `$el`. The next time a view
	    // is shown via this region, the region will re-query the
	    // DOM for the region's `el`.
	    reset: function() {
	      this.empty();
	  
	      if (this.$el) {
	        this.el = this.$el.selector;
	      }
	  
	      delete this.$el;
	      return this;
	    }
	  
	  },
	  
	  // Static Methods
	  {
	  
	    // Build an instance of a region by passing in a configuration object
	    // and a default region class to use if none is specified in the config.
	    //
	    // The config object should either be a string as a jQuery DOM selector,
	    // a Region class directly, or an object literal that specifies a selector,
	    // a custom regionClass, and any options to be supplied to the region:
	    //
	    // ```js
	    // {
	    //   selector: "#foo",
	    //   regionClass: MyCustomRegion,
	    //   allowMissingEl: false
	    // }
	    // ```
	    //
	    buildRegion: function(regionConfig, DefaultRegionClass) {
	      if (_.isString(regionConfig)) {
	        return this._buildRegionFromSelector(regionConfig, DefaultRegionClass);
	      }
	  
	      if (regionConfig.selector || regionConfig.el || regionConfig.regionClass) {
	        return this._buildRegionFromObject(regionConfig, DefaultRegionClass);
	      }
	  
	      if (_.isFunction(regionConfig)) {
	        return this._buildRegionFromRegionClass(regionConfig);
	      }
	  
	      throw new Marionette.Error({
	        message: 'Improper region configuration type.',
	        url: 'marionette.region.html#region-configuration-types'
	      });
	    },
	  
	    // Build the region from a string selector like '#foo-region'
	    _buildRegionFromSelector: function(selector, DefaultRegionClass) {
	      return new DefaultRegionClass({el: selector});
	    },
	  
	    // Build the region from a configuration object
	    // ```js
	    // { selector: '#foo', regionClass: FooRegion, allowMissingEl: false }
	    // ```
	    _buildRegionFromObject: function(regionConfig, DefaultRegionClass) {
	      var RegionClass = regionConfig.regionClass || DefaultRegionClass;
	      var options = _.omit(regionConfig, 'selector', 'regionClass');
	  
	      if (regionConfig.selector && !options.el) {
	        options.el = regionConfig.selector;
	      }
	  
	      return new RegionClass(options);
	    },
	  
	    // Build the region directly from a given `RegionClass`
	    _buildRegionFromRegionClass: function(RegionClass) {
	      return new RegionClass();
	    }
	  });
	  
	  // Region Manager
	  // --------------
	  
	  // Manage one or more related `Marionette.Region` objects.
	  Marionette.RegionManager = Marionette.Controller.extend({
	    constructor: function(options) {
	      this._regions = {};
	      this.length = 0;
	  
	      Marionette.Controller.call(this, options);
	  
	      this.addRegions(this.getOption('regions'));
	    },
	  
	    // Add multiple regions using an object literal or a
	    // function that returns an object literal, where
	    // each key becomes the region name, and each value is
	    // the region definition.
	    addRegions: function(regionDefinitions, defaults) {
	      regionDefinitions = Marionette._getValue(regionDefinitions, this, arguments);
	  
	      return _.reduce(regionDefinitions, function(regions, definition, name) {
	        if (_.isString(definition)) {
	          definition = {selector: definition};
	        }
	        if (definition.selector) {
	          definition = _.defaults({}, definition, defaults);
	        }
	  
	        regions[name] = this.addRegion(name, definition);
	        return regions;
	      }, {}, this);
	    },
	  
	    // Add an individual region to the region manager,
	    // and return the region instance
	    addRegion: function(name, definition) {
	      var region;
	  
	      if (definition instanceof Marionette.Region) {
	        region = definition;
	      } else {
	        region = Marionette.Region.buildRegion(definition, Marionette.Region);
	      }
	  
	      this.triggerMethod('before:add:region', name, region);
	  
	      region._parent = this;
	      this._store(name, region);
	  
	      this.triggerMethod('add:region', name, region);
	      return region;
	    },
	  
	    // Get a region by name
	    get: function(name) {
	      return this._regions[name];
	    },
	  
	    // Gets all the regions contained within
	    // the `regionManager` instance.
	    getRegions: function() {
	      return _.clone(this._regions);
	    },
	  
	    // Remove a region by name
	    removeRegion: function(name) {
	      var region = this._regions[name];
	      this._remove(name, region);
	  
	      return region;
	    },
	  
	    // Empty all regions in the region manager, and
	    // remove them
	    removeRegions: function() {
	      var regions = this.getRegions();
	      _.each(this._regions, function(region, name) {
	        this._remove(name, region);
	      }, this);
	  
	      return regions;
	    },
	  
	    // Empty all regions in the region manager, but
	    // leave them attached
	    emptyRegions: function() {
	      var regions = this.getRegions();
	      _.invoke(regions, 'empty');
	      return regions;
	    },
	  
	    // Destroy all regions and shut down the region
	    // manager entirely
	    destroy: function() {
	      this.removeRegions();
	      return Marionette.Controller.prototype.destroy.apply(this, arguments);
	    },
	  
	    // internal method to store regions
	    _store: function(name, region) {
	      if (!this._regions[name]) {
	        this.length++;
	      }
	  
	      this._regions[name] = region;
	    },
	  
	    // internal method to remove a region
	    _remove: function(name, region) {
	      this.triggerMethod('before:remove:region', name, region);
	      region.empty();
	      region.stopListening();
	  
	      delete region._parent;
	      delete this._regions[name];
	      this.length--;
	      this.triggerMethod('remove:region', name, region);
	    }
	  });
	  
	  Marionette.actAsCollection(Marionette.RegionManager.prototype, '_regions');
	  
	
	  // Template Cache
	  // --------------
	  
	  // Manage templates stored in `<script>` blocks,
	  // caching them for faster access.
	  Marionette.TemplateCache = function(templateId) {
	    this.templateId = templateId;
	  };
	  
	  // TemplateCache object-level methods. Manage the template
	  // caches from these method calls instead of creating
	  // your own TemplateCache instances
	  _.extend(Marionette.TemplateCache, {
	    templateCaches: {},
	  
	    // Get the specified template by id. Either
	    // retrieves the cached version, or loads it
	    // from the DOM.
	    get: function(templateId, options) {
	      var cachedTemplate = this.templateCaches[templateId];
	  
	      if (!cachedTemplate) {
	        cachedTemplate = new Marionette.TemplateCache(templateId);
	        this.templateCaches[templateId] = cachedTemplate;
	      }
	  
	      return cachedTemplate.load(options);
	    },
	  
	    // Clear templates from the cache. If no arguments
	    // are specified, clears all templates:
	    // `clear()`
	    //
	    // If arguments are specified, clears each of the
	    // specified templates from the cache:
	    // `clear("#t1", "#t2", "...")`
	    clear: function() {
	      var i;
	      var args = _.toArray(arguments);
	      var length = args.length;
	  
	      if (length > 0) {
	        for (i = 0; i < length; i++) {
	          delete this.templateCaches[args[i]];
	        }
	      } else {
	        this.templateCaches = {};
	      }
	    }
	  });
	  
	  // TemplateCache instance methods, allowing each
	  // template cache object to manage its own state
	  // and know whether or not it has been loaded
	  _.extend(Marionette.TemplateCache.prototype, {
	  
	    // Internal method to load the template
	    load: function(options) {
	      // Guard clause to prevent loading this template more than once
	      if (this.compiledTemplate) {
	        return this.compiledTemplate;
	      }
	  
	      // Load the template and compile it
	      var template = this.loadTemplate(this.templateId, options);
	      this.compiledTemplate = this.compileTemplate(template, options);
	  
	      return this.compiledTemplate;
	    },
	  
	    // Load a template from the DOM, by default. Override
	    // this method to provide your own template retrieval
	    // For asynchronous loading with AMD/RequireJS, consider
	    // using a template-loader plugin as described here:
	    // https://github.com/marionettejs/backbone.marionette/wiki/Using-marionette-with-requirejs
	    loadTemplate: function(templateId, options) {
	      var $template = Backbone.$(templateId);
	  
	      if (!$template.length) {
	        throw new Marionette.Error({
	          name: 'NoTemplateError',
	          message: 'Could not find template: "' + templateId + '"'
	        });
	      }
	      return $template.html();
	    },
	  
	    // Pre-compile the template before caching it. Override
	    // this method if you do not need to pre-compile a template
	    // (JST / RequireJS for example) or if you want to change
	    // the template engine used (Handebars, etc).
	    compileTemplate: function(rawTemplate, options) {
	      return _.template(rawTemplate, options);
	    }
	  });
	  
	  // Renderer
	  // --------
	  
	  // Render a template with data by passing in the template
	  // selector and the data to render.
	  Marionette.Renderer = {
	  
	    // Render a template with data. The `template` parameter is
	    // passed to the `TemplateCache` object to retrieve the
	    // template function. Override this method to provide your own
	    // custom rendering and template handling for all of Marionette.
	    render: function(template, data) {
	      if (!template) {
	        throw new Marionette.Error({
	          name: 'TemplateNotFoundError',
	          message: 'Cannot render the template since its false, null or undefined.'
	        });
	      }
	  
	      var templateFunc = _.isFunction(template) ? template : Marionette.TemplateCache.get(template);
	  
	      return templateFunc(data);
	    }
	  };
	  
	
	  /* jshint maxlen: 114, nonew: false */
	  // View
	  // ----
	  
	  // The core view class that other Marionette views extend from.
	  Marionette.View = Backbone.View.extend({
	    isDestroyed: false,
	    supportsRenderLifecycle: true,
	    supportsDestroyLifecycle: true,
	  
	    constructor: function(options) {
	      this.render = _.bind(this.render, this);
	  
	      options = Marionette._getValue(options, this);
	  
	      // this exposes view options to the view initializer
	      // this is a backfill since backbone removed the assignment
	      // of this.options
	      // at some point however this may be removed
	      this.options = _.extend({}, _.result(this, 'options'), options);
	  
	      this._behaviors = Marionette.Behaviors(this);
	  
	      Backbone.View.call(this, this.options);
	  
	      Marionette.MonitorDOMRefresh(this);
	    },
	  
	    // Get the template for this view
	    // instance. You can set a `template` attribute in the view
	    // definition or pass a `template: "whatever"` parameter in
	    // to the constructor options.
	    getTemplate: function() {
	      return this.getOption('template');
	    },
	  
	    // Serialize a model by returning its attributes. Clones
	    // the attributes to allow modification.
	    serializeModel: function(model) {
	      return model.toJSON.apply(model, _.rest(arguments));
	    },
	  
	    // Mix in template helper methods. Looks for a
	    // `templateHelpers` attribute, which can either be an
	    // object literal, or a function that returns an object
	    // literal. All methods and attributes from this object
	    // are copies to the object passed in.
	    mixinTemplateHelpers: function(target) {
	      target = target || {};
	      var templateHelpers = this.getOption('templateHelpers');
	      templateHelpers = Marionette._getValue(templateHelpers, this);
	      return _.extend(target, templateHelpers);
	    },
	  
	    // normalize the keys of passed hash with the views `ui` selectors.
	    // `{"@ui.foo": "bar"}`
	    normalizeUIKeys: function(hash) {
	      var uiBindings = _.result(this, '_uiBindings');
	      return Marionette.normalizeUIKeys(hash, uiBindings || _.result(this, 'ui'));
	    },
	  
	    // normalize the values of passed hash with the views `ui` selectors.
	    // `{foo: "@ui.bar"}`
	    normalizeUIValues: function(hash, properties) {
	      var ui = _.result(this, 'ui');
	      var uiBindings = _.result(this, '_uiBindings');
	      return Marionette.normalizeUIValues(hash, uiBindings || ui, properties);
	    },
	  
	    // Configure `triggers` to forward DOM events to view
	    // events. `triggers: {"click .foo": "do:foo"}`
	    configureTriggers: function() {
	      if (!this.triggers) { return; }
	  
	      // Allow `triggers` to be configured as a function
	      var triggers = this.normalizeUIKeys(_.result(this, 'triggers'));
	  
	      // Configure the triggers, prevent default
	      // action and stop propagation of DOM events
	      return _.reduce(triggers, function(events, value, key) {
	        events[key] = this._buildViewTrigger(value);
	        return events;
	      }, {}, this);
	    },
	  
	    // Overriding Backbone.View's delegateEvents to handle
	    // the `triggers`, `modelEvents`, and `collectionEvents` configuration
	    delegateEvents: function(events) {
	      this._delegateDOMEvents(events);
	      this.bindEntityEvents(this.model, this.getOption('modelEvents'));
	      this.bindEntityEvents(this.collection, this.getOption('collectionEvents'));
	  
	      _.each(this._behaviors, function(behavior) {
	        behavior.bindEntityEvents(this.model, behavior.getOption('modelEvents'));
	        behavior.bindEntityEvents(this.collection, behavior.getOption('collectionEvents'));
	      }, this);
	  
	      return this;
	    },
	  
	    // internal method to delegate DOM events and triggers
	    _delegateDOMEvents: function(eventsArg) {
	      var events = Marionette._getValue(eventsArg || this.events, this);
	  
	      // normalize ui keys
	      events = this.normalizeUIKeys(events);
	      if (_.isUndefined(eventsArg)) {this.events = events;}
	  
	      var combinedEvents = {};
	  
	      // look up if this view has behavior events
	      var behaviorEvents = _.result(this, 'behaviorEvents') || {};
	      var triggers = this.configureTriggers();
	      var behaviorTriggers = _.result(this, 'behaviorTriggers') || {};
	  
	      // behavior events will be overriden by view events and or triggers
	      _.extend(combinedEvents, behaviorEvents, events, triggers, behaviorTriggers);
	  
	      Backbone.View.prototype.delegateEvents.call(this, combinedEvents);
	    },
	  
	    // Overriding Backbone.View's undelegateEvents to handle unbinding
	    // the `triggers`, `modelEvents`, and `collectionEvents` config
	    undelegateEvents: function() {
	      Backbone.View.prototype.undelegateEvents.apply(this, arguments);
	  
	      this.unbindEntityEvents(this.model, this.getOption('modelEvents'));
	      this.unbindEntityEvents(this.collection, this.getOption('collectionEvents'));
	  
	      _.each(this._behaviors, function(behavior) {
	        behavior.unbindEntityEvents(this.model, behavior.getOption('modelEvents'));
	        behavior.unbindEntityEvents(this.collection, behavior.getOption('collectionEvents'));
	      }, this);
	  
	      return this;
	    },
	  
	    // Internal helper method to verify whether the view hasn't been destroyed
	    _ensureViewIsIntact: function() {
	      if (this.isDestroyed) {
	        throw new Marionette.Error({
	          name: 'ViewDestroyedError',
	          message: 'View (cid: "' + this.cid + '") has already been destroyed and cannot be used.'
	        });
	      }
	    },
	  
	    // Default `destroy` implementation, for removing a view from the
	    // DOM and unbinding it. Regions will call this method
	    // for you. You can specify an `onDestroy` method in your view to
	    // add custom code that is called after the view is destroyed.
	    destroy: function() {
	      if (this.isDestroyed) { return this; }
	  
	      var args = _.toArray(arguments);
	  
	      this.triggerMethod.apply(this, ['before:destroy'].concat(args));
	  
	      // mark as destroyed before doing the actual destroy, to
	      // prevent infinite loops within "destroy" event handlers
	      // that are trying to destroy other views
	      this.isDestroyed = true;
	      this.triggerMethod.apply(this, ['destroy'].concat(args));
	  
	      // unbind UI elements
	      this.unbindUIElements();
	  
	      this.isRendered = false;
	  
	      // remove the view from the DOM
	      this.remove();
	  
	      // Call destroy on each behavior after
	      // destroying the view.
	      // This unbinds event listeners
	      // that behaviors have registered for.
	      _.invoke(this._behaviors, 'destroy', args);
	  
	      return this;
	    },
	  
	    bindUIElements: function() {
	      this._bindUIElements();
	      _.invoke(this._behaviors, this._bindUIElements);
	    },
	  
	    // This method binds the elements specified in the "ui" hash inside the view's code with
	    // the associated jQuery selectors.
	    _bindUIElements: function() {
	      if (!this.ui) { return; }
	  
	      // store the ui hash in _uiBindings so they can be reset later
	      // and so re-rendering the view will be able to find the bindings
	      if (!this._uiBindings) {
	        this._uiBindings = this.ui;
	      }
	  
	      // get the bindings result, as a function or otherwise
	      var bindings = _.result(this, '_uiBindings');
	  
	      // empty the ui so we don't have anything to start with
	      this.ui = {};
	  
	      // bind each of the selectors
	      _.each(bindings, function(selector, key) {
	        this.ui[key] = this.$(selector);
	      }, this);
	    },
	  
	    // This method unbinds the elements specified in the "ui" hash
	    unbindUIElements: function() {
	      this._unbindUIElements();
	      _.invoke(this._behaviors, this._unbindUIElements);
	    },
	  
	    _unbindUIElements: function() {
	      if (!this.ui || !this._uiBindings) { return; }
	  
	      // delete all of the existing ui bindings
	      _.each(this.ui, function($el, name) {
	        delete this.ui[name];
	      }, this);
	  
	      // reset the ui element to the original bindings configuration
	      this.ui = this._uiBindings;
	      delete this._uiBindings;
	    },
	  
	    // Internal method to create an event handler for a given `triggerDef` like
	    // 'click:foo'
	    _buildViewTrigger: function(triggerDef) {
	  
	      var options = _.defaults({}, triggerDef, {
	        preventDefault: true,
	        stopPropagation: true
	      });
	  
	      var eventName = _.isObject(triggerDef) ? options.event : triggerDef;
	  
	      return function(e) {
	        if (e) {
	          if (e.preventDefault && options.preventDefault) {
	            e.preventDefault();
	          }
	  
	          if (e.stopPropagation && options.stopPropagation) {
	            e.stopPropagation();
	          }
	        }
	  
	        var args = {
	          view: this,
	          model: this.model,
	          collection: this.collection
	        };
	  
	        this.triggerMethod(eventName, args);
	      };
	    },
	  
	    setElement: function() {
	      var ret = Backbone.View.prototype.setElement.apply(this, arguments);
	  
	      // proxy behavior $el to the view's $el.
	      // This is needed because a view's $el proxy
	      // is not set until after setElement is called.
	      _.invoke(this._behaviors, 'proxyViewProperties', this);
	  
	      return ret;
	    },
	  
	    // import the `triggerMethod` to trigger events with corresponding
	    // methods if the method exists
	    triggerMethod: function() {
	      var ret = Marionette._triggerMethod(this, arguments);
	  
	      this._triggerEventOnBehaviors(arguments);
	      this._triggerEventOnParentLayout(arguments[0], _.rest(arguments));
	  
	      return ret;
	    },
	  
	    _triggerEventOnBehaviors: function(args) {
	      var triggerMethod = Marionette._triggerMethod;
	      var behaviors = this._behaviors;
	      // Use good ol' for as this is a very hot function
	      for (var i = 0, length = behaviors && behaviors.length; i < length; i++) {
	        triggerMethod(behaviors[i], args);
	      }
	    },
	  
	    _triggerEventOnParentLayout: function(eventName, args) {
	      var layoutView = this._parentLayoutView();
	      if (!layoutView) {
	        return;
	      }
	  
	      // invoke triggerMethod on parent view
	      var eventPrefix = Marionette.getOption(layoutView, 'childViewEventPrefix');
	      var prefixedEventName = eventPrefix + ':' + eventName;
	      var callArgs = [this].concat(args);
	  
	      Marionette._triggerMethod(layoutView, prefixedEventName, callArgs);
	  
	      // call the parent view's childEvents handler
	      var childEvents = Marionette.getOption(layoutView, 'childEvents');
	  
	      // since childEvents can be an object or a function use Marionette._getValue
	      // to handle the abstaction for us.
	      childEvents = Marionette._getValue(childEvents, layoutView);
	      var normalizedChildEvents = layoutView.normalizeMethods(childEvents);
	  
	      if (normalizedChildEvents && _.isFunction(normalizedChildEvents[eventName])) {
	        normalizedChildEvents[eventName].apply(layoutView, callArgs);
	      }
	    },
	  
	    // This method returns any views that are immediate
	    // children of this view
	    _getImmediateChildren: function() {
	      return [];
	    },
	  
	    // Returns an array of every nested view within this view
	    _getNestedViews: function() {
	      var children = this._getImmediateChildren();
	  
	      if (!children.length) { return children; }
	  
	      return _.reduce(children, function(memo, view) {
	        if (!view._getNestedViews) { return memo; }
	        return memo.concat(view._getNestedViews());
	      }, children);
	    },
	  
	    // Walk the _parent tree until we find a layout view (if one exists).
	    // Returns the parent layout view hierarchically closest to this view.
	    _parentLayoutView: function() {
	      var parent  = this._parent;
	  
	      while (parent) {
	        if (parent instanceof Marionette.LayoutView) {
	          return parent;
	        }
	        parent = parent._parent;
	      }
	    },
	  
	    // Imports the "normalizeMethods" to transform hashes of
	    // events=>function references/names to a hash of events=>function references
	    normalizeMethods: Marionette.normalizeMethods,
	  
	    // A handy way to merge passed-in options onto the instance
	    mergeOptions: Marionette.mergeOptions,
	  
	    // Proxy `getOption` to enable getting options from this or this.options by name.
	    getOption: Marionette.proxyGetOption,
	  
	    // Proxy `bindEntityEvents` to enable binding view's events from another entity.
	    bindEntityEvents: Marionette.proxyBindEntityEvents,
	  
	    // Proxy `unbindEntityEvents` to enable unbinding view's events from another entity.
	    unbindEntityEvents: Marionette.proxyUnbindEntityEvents
	  });
	  
	  // Item View
	  // ---------
	  
	  // A single item view implementation that contains code for rendering
	  // with underscore.js templates, serializing the view's model or collection,
	  // and calling several methods on extended views, such as `onRender`.
	  Marionette.ItemView = Marionette.View.extend({
	  
	    // Setting up the inheritance chain which allows changes to
	    // Marionette.View.prototype.constructor which allows overriding
	    constructor: function() {
	      Marionette.View.apply(this, arguments);
	    },
	  
	    // Serialize the model or collection for the view. If a model is
	    // found, the view's `serializeModel` is called. If a collection is found,
	    // each model in the collection is serialized by calling
	    // the view's `serializeCollection` and put into an `items` array in
	    // the resulting data. If both are found, defaults to the model.
	    // You can override the `serializeData` method in your own view definition,
	    // to provide custom serialization for your view's data.
	    serializeData: function() {
	      if (!this.model && !this.collection) {
	        return {};
	      }
	  
	      var args = [this.model || this.collection];
	      if (arguments.length) {
	        args.push.apply(args, arguments);
	      }
	  
	      if (this.model) {
	        return this.serializeModel.apply(this, args);
	      } else {
	        return {
	          items: this.serializeCollection.apply(this, args)
	        };
	      }
	    },
	  
	    // Serialize a collection by serializing each of its models.
	    serializeCollection: function(collection) {
	      return collection.toJSON.apply(collection, _.rest(arguments));
	    },
	  
	    // Render the view, defaulting to underscore.js templates.
	    // You can override this in your view definition to provide
	    // a very specific rendering for your view. In general, though,
	    // you should override the `Marionette.Renderer` object to
	    // change how Marionette renders views.
	    render: function() {
	      this._ensureViewIsIntact();
	  
	      this.triggerMethod('before:render', this);
	  
	      this._renderTemplate();
	      this.isRendered = true;
	      this.bindUIElements();
	  
	      this.triggerMethod('render', this);
	  
	      return this;
	    },
	  
	    // Internal method to render the template with the serialized data
	    // and template helpers via the `Marionette.Renderer` object.
	    // Throws an `UndefinedTemplateError` error if the template is
	    // any falsely value but literal `false`.
	    _renderTemplate: function() {
	      var template = this.getTemplate();
	  
	      // Allow template-less item views
	      if (template === false) {
	        return;
	      }
	  
	      if (!template) {
	        throw new Marionette.Error({
	          name: 'UndefinedTemplateError',
	          message: 'Cannot render the template since it is null or undefined.'
	        });
	      }
	  
	      // Add in entity data and template helpers
	      var data = this.mixinTemplateHelpers(this.serializeData());
	  
	      // Render and add to el
	      var html = Marionette.Renderer.render(template, data, this);
	      this.attachElContent(html);
	  
	      return this;
	    },
	  
	    // Attaches the content of a given view.
	    // This method can be overridden to optimize rendering,
	    // or to render in a non standard way.
	    //
	    // For example, using `innerHTML` instead of `$el.html`
	    //
	    // ```js
	    // attachElContent: function(html) {
	    //   this.el.innerHTML = html;
	    //   return this;
	    // }
	    // ```
	    attachElContent: function(html) {
	      this.$el.html(html);
	  
	      return this;
	    }
	  });
	  
	  /* jshint maxstatements: 20, maxcomplexity: 7 */
	  
	  // Collection View
	  // ---------------
	  
	  // A view that iterates over a Backbone.Collection
	  // and renders an individual child view for each model.
	  Marionette.CollectionView = Marionette.View.extend({
	  
	    // used as the prefix for child view events
	    // that are forwarded through the collectionview
	    childViewEventPrefix: 'childview',
	  
	    // flag for maintaining the sorted order of the collection
	    sort: true,
	  
	    // constructor
	    // option to pass `{sort: false}` to prevent the `CollectionView` from
	    // maintaining the sorted order of the collection.
	    // This will fallback onto appending childView's to the end.
	    //
	    // option to pass `{comparator: compFunction()}` to allow the `CollectionView`
	    // to use a custom sort order for the collection.
	    constructor: function(options) {
	      this.once('render', this._initialEvents);
	      this._initChildViewStorage();
	  
	      Marionette.View.apply(this, arguments);
	  
	      this.on({
	        'before:show':   this._onBeforeShowCalled,
	        'show':          this._onShowCalled,
	        'before:attach': this._onBeforeAttachCalled,
	        'attach':        this._onAttachCalled
	      });
	      this.initRenderBuffer();
	    },
	  
	    // Instead of inserting elements one by one into the page,
	    // it's much more performant to insert elements into a document
	    // fragment and then insert that document fragment into the page
	    initRenderBuffer: function() {
	      this._bufferedChildren = [];
	    },
	  
	    startBuffering: function() {
	      this.initRenderBuffer();
	      this.isBuffering = true;
	    },
	  
	    endBuffering: function() {
	      // Only trigger attach if already shown and attached, otherwise Region#show() handles this.
	      var canTriggerAttach = this._isShown && Marionette.isNodeAttached(this.el);
	      var nestedViews;
	  
	      this.isBuffering = false;
	  
	      if (this._isShown) {
	        this._triggerMethodMany(this._bufferedChildren, this, 'before:show');
	      }
	      if (canTriggerAttach && this._triggerBeforeAttach) {
	        nestedViews = this._getNestedViews();
	        this._triggerMethodMany(nestedViews, this, 'before:attach');
	      }
	  
	      this.attachBuffer(this, this._createBuffer());
	  
	      if (canTriggerAttach && this._triggerAttach) {
	        nestedViews = this._getNestedViews();
	        this._triggerMethodMany(nestedViews, this, 'attach');
	      }
	      if (this._isShown) {
	        this._triggerMethodMany(this._bufferedChildren, this, 'show');
	      }
	      this.initRenderBuffer();
	    },
	  
	    _triggerMethodMany: function(targets, source, eventName) {
	      var args = _.drop(arguments, 3);
	  
	      _.each(targets, function(target) {
	        Marionette.triggerMethodOn.apply(target, [target, eventName, target, source].concat(args));
	      });
	    },
	  
	    // Configured the initial events that the collection view
	    // binds to.
	    _initialEvents: function() {
	      if (this.collection) {
	        this.listenTo(this.collection, 'add', this._onCollectionAdd);
	        this.listenTo(this.collection, 'remove', this._onCollectionRemove);
	        this.listenTo(this.collection, 'reset', this.render);
	  
	        if (this.getOption('sort')) {
	          this.listenTo(this.collection, 'sort', this._sortViews);
	        }
	      }
	    },
	  
	    // Handle a child added to the collection
	    _onCollectionAdd: function(child, collection, opts) {
	      // `index` is present when adding with `at` since BB 1.2; indexOf fallback for < 1.2
	      var index = opts.at !== undefined && (opts.index || collection.indexOf(child));
	  
	      // When filtered or when there is no initial index, calculate index.
	      if (this.getOption('filter') || index === false) {
	        index = _.indexOf(this._filteredSortedModels(index), child);
	      }
	  
	      if (this._shouldAddChild(child, index)) {
	        this.destroyEmptyView();
	        var ChildView = this.getChildView(child);
	        this.addChild(child, ChildView, index);
	      }
	    },
	  
	    // get the child view by model it holds, and remove it
	    _onCollectionRemove: function(model) {
	      var view = this.children.findByModel(model);
	      this.removeChildView(view);
	      this.checkEmpty();
	    },
	  
	    _onBeforeShowCalled: function() {
	      // Reset attach event flags at the top of the Region#show() event lifecycle; if the Region's
	      // show() options permit onBeforeAttach/onAttach events, these flags will be set true again.
	      this._triggerBeforeAttach = this._triggerAttach = false;
	      this.children.each(function(childView) {
	        Marionette.triggerMethodOn(childView, 'before:show', childView);
	      });
	    },
	  
	    _onShowCalled: function() {
	      this.children.each(function(childView) {
	        Marionette.triggerMethodOn(childView, 'show', childView);
	      });
	    },
	  
	    // If during Region#show() onBeforeAttach was fired, continue firing it for child views
	    _onBeforeAttachCalled: function() {
	      this._triggerBeforeAttach = true;
	    },
	  
	    // If during Region#show() onAttach was fired, continue firing it for child views
	    _onAttachCalled: function() {
	      this._triggerAttach = true;
	    },
	  
	    // Render children views. Override this method to
	    // provide your own implementation of a render function for
	    // the collection view.
	    render: function() {
	      this._ensureViewIsIntact();
	      this.triggerMethod('before:render', this);
	      this._renderChildren();
	      this.isRendered = true;
	      this.triggerMethod('render', this);
	      return this;
	    },
	  
	    // Reorder DOM after sorting. When your element's rendering
	    // do not use their index, you can pass reorderOnSort: true
	    // to only reorder the DOM after a sort instead of rendering
	    // all the collectionView
	    reorder: function() {
	      var children = this.children;
	      var models = this._filteredSortedModels();
	  
	      if (!models.length && this._showingEmptyView) { return this; }
	  
	      var anyModelsAdded = _.some(models, function(model) {
	        return !children.findByModel(model);
	      });
	  
	      // If there are any new models added due to filtering
	      // We need to add child views
	      // So render as normal
	      if (anyModelsAdded) {
	        this.render();
	      } else {
	        // get the DOM nodes in the same order as the models
	        var elsToReorder = _.map(models, function(model, index) {
	          var view = children.findByModel(model);
	          view._index = index;
	          return view.el;
	        });
	  
	        // find the views that were children before but arent in this new ordering
	        var filteredOutViews = children.filter(function(view) {
	          return !_.contains(elsToReorder, view.el);
	        });
	  
	        this.triggerMethod('before:reorder');
	  
	        // since append moves elements that are already in the DOM,
	        // appending the elements will effectively reorder them
	        this._appendReorderedChildren(elsToReorder);
	  
	        // remove any views that have been filtered out
	        _.each(filteredOutViews, this.removeChildView, this);
	        this.checkEmpty();
	  
	        this.triggerMethod('reorder');
	      }
	    },
	  
	    // Render view after sorting. Override this method to
	    // change how the view renders after a `sort` on the collection.
	    // An example of this would be to only `renderChildren` in a `CompositeView`
	    // rather than the full view.
	    resortView: function() {
	      if (Marionette.getOption(this, 'reorderOnSort')) {
	        this.reorder();
	      } else {
	        this.render();
	      }
	    },
	  
	    // Internal method. This checks for any changes in the order of the collection.
	    // If the index of any view doesn't match, it will render.
	    _sortViews: function() {
	      var models = this._filteredSortedModels();
	  
	      // check for any changes in sort order of views
	      var orderChanged = _.find(models, function(item, index) {
	        var view = this.children.findByModel(item);
	        return !view || view._index !== index;
	      }, this);
	  
	      if (orderChanged) {
	        this.resortView();
	      }
	    },
	  
	    // Internal reference to what index a `emptyView` is.
	    _emptyViewIndex: -1,
	  
	    // Internal method. Separated so that CompositeView can append to the childViewContainer
	    // if necessary
	    _appendReorderedChildren: function(children) {
	      this.$el.append(children);
	    },
	  
	    // Internal method. Separated so that CompositeView can have
	    // more control over events being triggered, around the rendering
	    // process
	    _renderChildren: function() {
	      this.destroyEmptyView();
	      this.destroyChildren({checkEmpty: false});
	  
	      if (this.isEmpty(this.collection)) {
	        this.showEmptyView();
	      } else {
	        this.triggerMethod('before:render:collection', this);
	        this.startBuffering();
	        this.showCollection();
	        this.endBuffering();
	        this.triggerMethod('render:collection', this);
	  
	        // If we have shown children and none have passed the filter, show the empty view
	        if (this.children.isEmpty() && this.getOption('filter')) {
	          this.showEmptyView();
	        }
	      }
	    },
	  
	    // Internal method to loop through collection and show each child view.
	    showCollection: function() {
	      var ChildView;
	  
	      var models = this._filteredSortedModels();
	  
	      _.each(models, function(child, index) {
	        ChildView = this.getChildView(child);
	        this.addChild(child, ChildView, index);
	      }, this);
	    },
	  
	    // Allow the collection to be sorted by a custom view comparator
	    _filteredSortedModels: function(addedAt) {
	      var viewComparator = this.getViewComparator();
	      var models = this.collection.models;
	      addedAt = Math.min(Math.max(addedAt, 0), models.length - 1);
	  
	      if (viewComparator) {
	        var addedModel;
	        // Preserve `at` location, even for a sorted view
	        if (addedAt) {
	          addedModel = models[addedAt];
	          models = models.slice(0, addedAt).concat(models.slice(addedAt + 1));
	        }
	        models = this._sortModelsBy(models, viewComparator);
	        if (addedModel) {
	          models.splice(addedAt, 0, addedModel);
	        }
	      }
	  
	      // Filter after sorting in case the filter uses the index
	      if (this.getOption('filter')) {
	        models = _.filter(models, function(model, index) {
	          return this._shouldAddChild(model, index);
	        }, this);
	      }
	  
	      return models;
	    },
	  
	    _sortModelsBy: function(models, comparator) {
	      if (typeof comparator === 'string') {
	        return _.sortBy(models, function(model) {
	          return model.get(comparator);
	        }, this);
	      } else if (comparator.length === 1) {
	        return _.sortBy(models, comparator, this);
	      } else {
	        return models.sort(_.bind(comparator, this));
	      }
	    },
	  
	    // Internal method to show an empty view in place of
	    // a collection of child views, when the collection is empty
	    showEmptyView: function() {
	      var EmptyView = this.getEmptyView();
	  
	      if (EmptyView && !this._showingEmptyView) {
	        this.triggerMethod('before:render:empty');
	  
	        this._showingEmptyView = true;
	        var model = new Backbone.Model();
	        this.addEmptyView(model, EmptyView);
	  
	        this.triggerMethod('render:empty');
	      }
	    },
	  
	    // Internal method to destroy an existing emptyView instance
	    // if one exists. Called when a collection view has been
	    // rendered empty, and then a child is added to the collection.
	    destroyEmptyView: function() {
	      if (this._showingEmptyView) {
	        this.triggerMethod('before:remove:empty');
	  
	        this.destroyChildren();
	        delete this._showingEmptyView;
	  
	        this.triggerMethod('remove:empty');
	      }
	    },
	  
	    // Retrieve the empty view class
	    getEmptyView: function() {
	      return this.getOption('emptyView');
	    },
	  
	    // Render and show the emptyView. Similar to addChild method
	    // but "add:child" events are not fired, and the event from
	    // emptyView are not forwarded
	    addEmptyView: function(child, EmptyView) {
	      // Only trigger attach if already shown, attached, and not buffering, otherwise endBuffer() or
	      // Region#show() handles this.
	      var canTriggerAttach = this._isShown && !this.isBuffering && Marionette.isNodeAttached(this.el);
	      var nestedViews;
	  
	      // get the emptyViewOptions, falling back to childViewOptions
	      var emptyViewOptions = this.getOption('emptyViewOptions') ||
	                            this.getOption('childViewOptions');
	  
	      if (_.isFunction(emptyViewOptions)) {
	        emptyViewOptions = emptyViewOptions.call(this, child, this._emptyViewIndex);
	      }
	  
	      // build the empty view
	      var view = this.buildChildView(child, EmptyView, emptyViewOptions);
	  
	      view._parent = this;
	  
	      // Proxy emptyView events
	      this.proxyChildEvents(view);
	  
	      view.once('render', function() {
	        // trigger the 'before:show' event on `view` if the collection view has already been shown
	        if (this._isShown) {
	          Marionette.triggerMethodOn(view, 'before:show', view);
	        }
	  
	        // Trigger `before:attach` following `render` to avoid adding logic and event triggers
	        // to public method `renderChildView()`.
	        if (canTriggerAttach && this._triggerBeforeAttach) {
	          nestedViews = this._getViewAndNested(view);
	          this._triggerMethodMany(nestedViews, this, 'before:attach');
	        }
	      }, this);
	  
	      // Store the `emptyView` like a `childView` so we can properly remove and/or close it later
	      this.children.add(view);
	      this.renderChildView(view, this._emptyViewIndex);
	  
	      // Trigger `attach`
	      if (canTriggerAttach && this._triggerAttach) {
	        nestedViews = this._getViewAndNested(view);
	        this._triggerMethodMany(nestedViews, this, 'attach');
	      }
	      // call the 'show' method if the collection view has already been shown
	      if (this._isShown) {
	        Marionette.triggerMethodOn(view, 'show', view);
	      }
	    },
	  
	    // Retrieve the `childView` class, either from `this.options.childView`
	    // or from the `childView` in the object definition. The "options"
	    // takes precedence.
	    // This method receives the model that will be passed to the instance
	    // created from this `childView`. Overriding methods may use the child
	    // to determine what `childView` class to return.
	    getChildView: function(child) {
	      var childView = this.getOption('childView');
	  
	      if (!childView) {
	        throw new Marionette.Error({
	          name: 'NoChildViewError',
	          message: 'A "childView" must be specified'
	        });
	      }
	  
	      return childView;
	    },
	  
	    // Render the child's view and add it to the
	    // HTML for the collection view at a given index.
	    // This will also update the indices of later views in the collection
	    // in order to keep the children in sync with the collection.
	    addChild: function(child, ChildView, index) {
	      var childViewOptions = this.getOption('childViewOptions');
	      childViewOptions = Marionette._getValue(childViewOptions, this, [child, index]);
	  
	      var view = this.buildChildView(child, ChildView, childViewOptions);
	  
	      // increment indices of views after this one
	      this._updateIndices(view, true, index);
	  
	      this.triggerMethod('before:add:child', view);
	      this._addChildView(view, index);
	      this.triggerMethod('add:child', view);
	  
	      view._parent = this;
	  
	      return view;
	    },
	  
	    // Internal method. This decrements or increments the indices of views after the
	    // added/removed view to keep in sync with the collection.
	    _updateIndices: function(view, increment, index) {
	      if (!this.getOption('sort')) {
	        return;
	      }
	  
	      if (increment) {
	        // assign the index to the view
	        view._index = index;
	      }
	  
	      // update the indexes of views after this one
	      this.children.each(function(laterView) {
	        if (laterView._index >= view._index) {
	          laterView._index += increment ? 1 : -1;
	        }
	      });
	    },
	  
	    // Internal Method. Add the view to children and render it at
	    // the given index.
	    _addChildView: function(view, index) {
	      // Only trigger attach if already shown, attached, and not buffering, otherwise endBuffer() or
	      // Region#show() handles this.
	      var canTriggerAttach = this._isShown && !this.isBuffering && Marionette.isNodeAttached(this.el);
	      var nestedViews;
	  
	      // set up the child view event forwarding
	      this.proxyChildEvents(view);
	  
	      view.once('render', function() {
	        // trigger the 'before:show' event on `view` if the collection view has already been shown
	        if (this._isShown && !this.isBuffering) {
	          Marionette.triggerMethodOn(view, 'before:show', view);
	        }
	  
	        // Trigger `before:attach` following `render` to avoid adding logic and event triggers
	        // to public method `renderChildView()`.
	        if (canTriggerAttach && this._triggerBeforeAttach) {
	          nestedViews = this._getViewAndNested(view);
	          this._triggerMethodMany(nestedViews, this, 'before:attach');
	        }
	      }, this);
	  
	      // Store the child view itself so we can properly remove and/or destroy it later
	      this.children.add(view);
	      this.renderChildView(view, index);
	  
	      // Trigger `attach`
	      if (canTriggerAttach && this._triggerAttach) {
	        nestedViews = this._getViewAndNested(view);
	        this._triggerMethodMany(nestedViews, this, 'attach');
	      }
	      // Trigger `show`
	      if (this._isShown && !this.isBuffering) {
	        Marionette.triggerMethodOn(view, 'show', view);
	      }
	    },
	  
	    // render the child view
	    renderChildView: function(view, index) {
	      if (!view.supportsRenderLifecycle) {
	        Marionette.triggerMethodOn(view, 'before:render', view);
	      }
	      view.render();
	      if (!view.supportsRenderLifecycle) {
	        Marionette.triggerMethodOn(view, 'render', view);
	      }
	      this.attachHtml(this, view, index);
	      return view;
	    },
	  
	    // Build a `childView` for a model in the collection.
	    buildChildView: function(child, ChildViewClass, childViewOptions) {
	      var options = _.extend({model: child}, childViewOptions);
	      var childView = new ChildViewClass(options);
	      Marionette.MonitorDOMRefresh(childView);
	      return childView;
	    },
	  
	    // Remove the child view and destroy it.
	    // This function also updates the indices of
	    // later views in the collection in order to keep
	    // the children in sync with the collection.
	    removeChildView: function(view) {
	      if (!view) { return view; }
	  
	      this.triggerMethod('before:remove:child', view);
	  
	      if (!view.supportsDestroyLifecycle) {
	        Marionette.triggerMethodOn(view, 'before:destroy', view);
	      }
	      // call 'destroy' or 'remove', depending on which is found
	      if (view.destroy) {
	        view.destroy();
	      } else {
	        view.remove();
	      }
	      if (!view.supportsDestroyLifecycle) {
	        Marionette.triggerMethodOn(view, 'destroy', view);
	      }
	  
	      delete view._parent;
	      this.stopListening(view);
	      this.children.remove(view);
	      this.triggerMethod('remove:child', view);
	  
	      // decrement the index of views after this one
	      this._updateIndices(view, false);
	  
	      return view;
	    },
	  
	    // check if the collection is empty
	    isEmpty: function() {
	      return !this.collection || this.collection.length === 0;
	    },
	  
	    // If empty, show the empty view
	    checkEmpty: function() {
	      if (this.isEmpty(this.collection)) {
	        this.showEmptyView();
	      }
	    },
	  
	    // You might need to override this if you've overridden attachHtml
	    attachBuffer: function(collectionView, buffer) {
	      collectionView.$el.append(buffer);
	    },
	  
	    // Create a fragment buffer from the currently buffered children
	    _createBuffer: function() {
	      var elBuffer = document.createDocumentFragment();
	      _.each(this._bufferedChildren, function(b) {
	        elBuffer.appendChild(b.el);
	      });
	      return elBuffer;
	    },
	  
	    // Append the HTML to the collection's `el`.
	    // Override this method to do something other
	    // than `.append`.
	    attachHtml: function(collectionView, childView, index) {
	      if (collectionView.isBuffering) {
	        // buffering happens on reset events and initial renders
	        // in order to reduce the number of inserts into the
	        // document, which are expensive.
	        collectionView._bufferedChildren.splice(index, 0, childView);
	      } else {
	        // If we've already rendered the main collection, append
	        // the new child into the correct order if we need to. Otherwise
	        // append to the end.
	        if (!collectionView._insertBefore(childView, index)) {
	          collectionView._insertAfter(childView);
	        }
	      }
	    },
	  
	    // Internal method. Check whether we need to insert the view into
	    // the correct position.
	    _insertBefore: function(childView, index) {
	      var currentView;
	      var findPosition = this.getOption('sort') && (index < this.children.length - 1);
	      if (findPosition) {
	        // Find the view after this one
	        currentView = this.children.find(function(view) {
	          return view._index === index + 1;
	        });
	      }
	  
	      if (currentView) {
	        currentView.$el.before(childView.el);
	        return true;
	      }
	  
	      return false;
	    },
	  
	    // Internal method. Append a view to the end of the $el
	    _insertAfter: function(childView) {
	      this.$el.append(childView.el);
	    },
	  
	    // Internal method to set up the `children` object for
	    // storing all of the child views
	    _initChildViewStorage: function() {
	      this.children = new Backbone.ChildViewContainer();
	    },
	  
	    // Handle cleanup and other destroying needs for the collection of views
	    destroy: function() {
	      if (this.isDestroyed) { return this; }
	  
	      this.triggerMethod('before:destroy:collection');
	      this.destroyChildren({checkEmpty: false});
	      this.triggerMethod('destroy:collection');
	  
	      return Marionette.View.prototype.destroy.apply(this, arguments);
	    },
	  
	    // Destroy the child views that this collection view
	    // is holding on to, if any
	    destroyChildren: function(options) {
	      var destroyOptions = options || {};
	      var shouldCheckEmpty = true;
	      var childViews = this.children.map(_.identity);
	  
	      if (!_.isUndefined(destroyOptions.checkEmpty)) {
	        shouldCheckEmpty = destroyOptions.checkEmpty;
	      }
	  
	      this.children.each(this.removeChildView, this);
	  
	      if (shouldCheckEmpty) {
	        this.checkEmpty();
	      }
	      return childViews;
	    },
	  
	    // Return true if the given child should be shown
	    // Return false otherwise
	    // The filter will be passed (child, index, collection)
	    // Where
	    //  'child' is the given model
	    //  'index' is the index of that model in the collection
	    //  'collection' is the collection referenced by this CollectionView
	    _shouldAddChild: function(child, index) {
	      var filter = this.getOption('filter');
	      return !_.isFunction(filter) || filter.call(this, child, index, this.collection);
	    },
	  
	    // Set up the child view event forwarding. Uses a "childview:"
	    // prefix in front of all forwarded events.
	    proxyChildEvents: function(view) {
	      var prefix = this.getOption('childViewEventPrefix');
	  
	      // Forward all child view events through the parent,
	      // prepending "childview:" to the event name
	      this.listenTo(view, 'all', function() {
	        var args = _.toArray(arguments);
	        var rootEvent = args[0];
	        var childEvents = this.normalizeMethods(_.result(this, 'childEvents'));
	  
	        args[0] = prefix + ':' + rootEvent;
	        args.splice(1, 0, view);
	  
	        // call collectionView childEvent if defined
	        if (typeof childEvents !== 'undefined' && _.isFunction(childEvents[rootEvent])) {
	          childEvents[rootEvent].apply(this, args.slice(1));
	        }
	  
	        this.triggerMethod.apply(this, args);
	      });
	    },
	  
	    _getImmediateChildren: function() {
	      return _.values(this.children._views);
	    },
	  
	    _getViewAndNested: function(view) {
	      // This will not fail on Backbone.View which does not have #_getNestedViews.
	      return [view].concat(_.result(view, '_getNestedViews') || []);
	    },
	  
	    getViewComparator: function() {
	      return this.getOption('viewComparator');
	    }
	  });
	  
	  /* jshint maxstatements: 17, maxlen: 117 */
	  
	  // Composite View
	  // --------------
	  
	  // Used for rendering a branch-leaf, hierarchical structure.
	  // Extends directly from CollectionView and also renders an
	  // a child view as `modelView`, for the top leaf
	  Marionette.CompositeView = Marionette.CollectionView.extend({
	  
	    // Setting up the inheritance chain which allows changes to
	    // Marionette.CollectionView.prototype.constructor which allows overriding
	    // option to pass '{sort: false}' to prevent the CompositeView from
	    // maintaining the sorted order of the collection.
	    // This will fallback onto appending childView's to the end.
	    constructor: function() {
	      Marionette.CollectionView.apply(this, arguments);
	    },
	  
	    // Configured the initial events that the composite view
	    // binds to. Override this method to prevent the initial
	    // events, or to add your own initial events.
	    _initialEvents: function() {
	  
	      // Bind only after composite view is rendered to avoid adding child views
	      // to nonexistent childViewContainer
	  
	      if (this.collection) {
	        this.listenTo(this.collection, 'add', this._onCollectionAdd);
	        this.listenTo(this.collection, 'remove', this._onCollectionRemove);
	        this.listenTo(this.collection, 'reset', this._renderChildren);
	  
	        if (this.getOption('sort')) {
	          this.listenTo(this.collection, 'sort', this._sortViews);
	        }
	      }
	    },
	  
	    // Retrieve the `childView` to be used when rendering each of
	    // the items in the collection. The default is to return
	    // `this.childView` or Marionette.CompositeView if no `childView`
	    // has been defined
	    getChildView: function(child) {
	      var childView = this.getOption('childView') || this.constructor;
	  
	      return childView;
	    },
	  
	    // Serialize the model for the view.
	    // You can override the `serializeData` method in your own view
	    // definition, to provide custom serialization for your view's data.
	    serializeData: function() {
	      var data = {};
	  
	      if (this.model) {
	        data = _.partial(this.serializeModel, this.model).apply(this, arguments);
	      }
	  
	      return data;
	    },
	  
	    // Renders the model and the collection.
	    render: function() {
	      this._ensureViewIsIntact();
	      this._isRendering = true;
	      this.resetChildViewContainer();
	  
	      this.triggerMethod('before:render', this);
	  
	      this._renderTemplate();
	      this._renderChildren();
	  
	      this._isRendering = false;
	      this.isRendered = true;
	      this.triggerMethod('render', this);
	      return this;
	    },
	  
	    _renderChildren: function() {
	      if (this.isRendered || this._isRendering) {
	        Marionette.CollectionView.prototype._renderChildren.call(this);
	      }
	    },
	  
	    // Render the root template that the children
	    // views are appended to
	    _renderTemplate: function() {
	      var data = {};
	      data = this.serializeData();
	      data = this.mixinTemplateHelpers(data);
	  
	      this.triggerMethod('before:render:template');
	  
	      var template = this.getTemplate();
	      var html = Marionette.Renderer.render(template, data, this);
	      this.attachElContent(html);
	  
	      // the ui bindings is done here and not at the end of render since they
	      // will not be available until after the model is rendered, but should be
	      // available before the collection is rendered.
	      this.bindUIElements();
	      this.triggerMethod('render:template');
	    },
	  
	    // Attaches the content of the root.
	    // This method can be overridden to optimize rendering,
	    // or to render in a non standard way.
	    //
	    // For example, using `innerHTML` instead of `$el.html`
	    //
	    // ```js
	    // attachElContent: function(html) {
	    //   this.el.innerHTML = html;
	    //   return this;
	    // }
	    // ```
	    attachElContent: function(html) {
	      this.$el.html(html);
	  
	      return this;
	    },
	  
	    // You might need to override this if you've overridden attachHtml
	    attachBuffer: function(compositeView, buffer) {
	      var $container = this.getChildViewContainer(compositeView);
	      $container.append(buffer);
	    },
	  
	    // Internal method. Append a view to the end of the $el.
	    // Overidden from CollectionView to ensure view is appended to
	    // childViewContainer
	    _insertAfter: function(childView) {
	      var $container = this.getChildViewContainer(this, childView);
	      $container.append(childView.el);
	    },
	  
	    // Internal method. Append reordered childView'.
	    // Overidden from CollectionView to ensure reordered views
	    // are appended to childViewContainer
	    _appendReorderedChildren: function(children) {
	      var $container = this.getChildViewContainer(this);
	      $container.append(children);
	    },
	  
	    // Internal method to ensure an `$childViewContainer` exists, for the
	    // `attachHtml` method to use.
	    getChildViewContainer: function(containerView, childView) {
	      if (!!containerView.$childViewContainer) {
	        return containerView.$childViewContainer;
	      }
	  
	      var container;
	      var childViewContainer = Marionette.getOption(containerView, 'childViewContainer');
	      if (childViewContainer) {
	  
	        var selector = Marionette._getValue(childViewContainer, containerView);
	  
	        if (selector.charAt(0) === '@' && containerView.ui) {
	          container = containerView.ui[selector.substr(4)];
	        } else {
	          container = containerView.$(selector);
	        }
	  
	        if (container.length <= 0) {
	          throw new Marionette.Error({
	            name: 'ChildViewContainerMissingError',
	            message: 'The specified "childViewContainer" was not found: ' + containerView.childViewContainer
	          });
	        }
	  
	      } else {
	        container = containerView.$el;
	      }
	  
	      containerView.$childViewContainer = container;
	      return container;
	    },
	  
	    // Internal method to reset the `$childViewContainer` on render
	    resetChildViewContainer: function() {
	      if (this.$childViewContainer) {
	        this.$childViewContainer = undefined;
	      }
	    }
	  });
	  
	  // Layout View
	  // -----------
	  
	  // Used for managing application layoutViews, nested layoutViews and
	  // multiple regions within an application or sub-application.
	  //
	  // A specialized view class that renders an area of HTML and then
	  // attaches `Region` instances to the specified `regions`.
	  // Used for composite view management and sub-application areas.
	  Marionette.LayoutView = Marionette.ItemView.extend({
	    regionClass: Marionette.Region,
	  
	    options: {
	      destroyImmediate: false
	    },
	  
	    // used as the prefix for child view events
	    // that are forwarded through the layoutview
	    childViewEventPrefix: 'childview',
	  
	    // Ensure the regions are available when the `initialize` method
	    // is called.
	    constructor: function(options) {
	      options = options || {};
	  
	      this._firstRender = true;
	      this._initializeRegions(options);
	  
	      Marionette.ItemView.call(this, options);
	    },
	  
	    // LayoutView's render will use the existing region objects the
	    // first time it is called. Subsequent calls will destroy the
	    // views that the regions are showing and then reset the `el`
	    // for the regions to the newly rendered DOM elements.
	    render: function() {
	      this._ensureViewIsIntact();
	  
	      if (this._firstRender) {
	        // if this is the first render, don't do anything to
	        // reset the regions
	        this._firstRender = false;
	      } else {
	        // If this is not the first render call, then we need to
	        // re-initialize the `el` for each region
	        this._reInitializeRegions();
	      }
	  
	      return Marionette.ItemView.prototype.render.apply(this, arguments);
	    },
	  
	    // Handle destroying regions, and then destroy the view itself.
	    destroy: function() {
	      if (this.isDestroyed) { return this; }
	      // #2134: remove parent element before destroying the child views, so
	      // removing the child views doesn't retrigger repaints
	      if (this.getOption('destroyImmediate') === true) {
	        this.$el.remove();
	      }
	      this.regionManager.destroy();
	      return Marionette.ItemView.prototype.destroy.apply(this, arguments);
	    },
	  
	    showChildView: function(regionName, view, options) {
	      var region = this.getRegion(regionName);
	      return region.show.apply(region, _.rest(arguments));
	    },
	  
	    getChildView: function(regionName) {
	      return this.getRegion(regionName).currentView;
	    },
	  
	    // Add a single region, by name, to the layoutView
	    addRegion: function(name, definition) {
	      var regions = {};
	      regions[name] = definition;
	      return this._buildRegions(regions)[name];
	    },
	  
	    // Add multiple regions as a {name: definition, name2: def2} object literal
	    addRegions: function(regions) {
	      this.regions = _.extend({}, this.regions, regions);
	      return this._buildRegions(regions);
	    },
	  
	    // Remove a single region from the LayoutView, by name
	    removeRegion: function(name) {
	      delete this.regions[name];
	      return this.regionManager.removeRegion(name);
	    },
	  
	    // Provides alternative access to regions
	    // Accepts the region name
	    // getRegion('main')
	    getRegion: function(region) {
	      return this.regionManager.get(region);
	    },
	  
	    // Get all regions
	    getRegions: function() {
	      return this.regionManager.getRegions();
	    },
	  
	    // internal method to build regions
	    _buildRegions: function(regions) {
	      var defaults = {
	        regionClass: this.getOption('regionClass'),
	        parentEl: _.partial(_.result, this, 'el')
	      };
	  
	      return this.regionManager.addRegions(regions, defaults);
	    },
	  
	    // Internal method to initialize the regions that have been defined in a
	    // `regions` attribute on this layoutView.
	    _initializeRegions: function(options) {
	      var regions;
	      this._initRegionManager();
	  
	      regions = Marionette._getValue(this.regions, this, [options]) || {};
	  
	      // Enable users to define `regions` as instance options.
	      var regionOptions = this.getOption.call(options, 'regions');
	  
	      // enable region options to be a function
	      regionOptions = Marionette._getValue(regionOptions, this, [options]);
	  
	      _.extend(regions, regionOptions);
	  
	      // Normalize region selectors hash to allow
	      // a user to use the @ui. syntax.
	      regions = this.normalizeUIValues(regions, ['selector', 'el']);
	  
	      this.addRegions(regions);
	    },
	  
	    // Internal method to re-initialize all of the regions by updating the `el` that
	    // they point to
	    _reInitializeRegions: function() {
	      this.regionManager.invoke('reset');
	    },
	  
	    // Enable easy overriding of the default `RegionManager`
	    // for customized region interactions and business specific
	    // view logic for better control over single regions.
	    getRegionManager: function() {
	      return new Marionette.RegionManager();
	    },
	  
	    // Internal method to initialize the region manager
	    // and all regions in it
	    _initRegionManager: function() {
	      this.regionManager = this.getRegionManager();
	      this.regionManager._parent = this;
	  
	      this.listenTo(this.regionManager, 'before:add:region', function(name) {
	        this.triggerMethod('before:add:region', name);
	      });
	  
	      this.listenTo(this.regionManager, 'add:region', function(name, region) {
	        this[name] = region;
	        this.triggerMethod('add:region', name, region);
	      });
	  
	      this.listenTo(this.regionManager, 'before:remove:region', function(name) {
	        this.triggerMethod('before:remove:region', name);
	      });
	  
	      this.listenTo(this.regionManager, 'remove:region', function(name, region) {
	        delete this[name];
	        this.triggerMethod('remove:region', name, region);
	      });
	    },
	  
	    _getImmediateChildren: function() {
	      return _.chain(this.regionManager.getRegions())
	        .pluck('currentView')
	        .compact()
	        .value();
	    }
	  });
	  
	
	  // Behavior
	  // --------
	  
	  // A Behavior is an isolated set of DOM /
	  // user interactions that can be mixed into any View.
	  // Behaviors allow you to blackbox View specific interactions
	  // into portable logical chunks, keeping your views simple and your code DRY.
	  
	  Marionette.Behavior = Marionette.Object.extend({
	    constructor: function(options, view) {
	      // Setup reference to the view.
	      // this comes in handle when a behavior
	      // wants to directly talk up the chain
	      // to the view.
	      this.view = view;
	      this.defaults = _.result(this, 'defaults') || {};
	      this.options  = _.extend({}, this.defaults, options);
	      // Construct an internal UI hash using
	      // the views UI hash and then the behaviors UI hash.
	      // This allows the user to use UI hash elements
	      // defined in the parent view as well as those
	      // defined in the given behavior.
	      this.ui = _.extend({}, _.result(view, 'ui'), _.result(this, 'ui'));
	  
	      Marionette.Object.apply(this, arguments);
	    },
	  
	    // proxy behavior $ method to the view
	    // this is useful for doing jquery DOM lookups
	    // scoped to behaviors view.
	    $: function() {
	      return this.view.$.apply(this.view, arguments);
	    },
	  
	    // Stops the behavior from listening to events.
	    // Overrides Object#destroy to prevent additional events from being triggered.
	    destroy: function() {
	      this.stopListening();
	  
	      return this;
	    },
	  
	    proxyViewProperties: function(view) {
	      this.$el = view.$el;
	      this.el = view.el;
	    }
	  });
	  
	  /* jshint maxlen: 143 */
	  // Behaviors
	  // ---------
	  
	  // Behaviors is a utility class that takes care of
	  // gluing your behavior instances to their given View.
	  // The most important part of this class is that you
	  // **MUST** override the class level behaviorsLookup
	  // method for things to work properly.
	  
	  Marionette.Behaviors = (function(Marionette, _) {
	    // Borrow event splitter from Backbone
	    var delegateEventSplitter = /^(\S+)\s*(.*)$/;
	  
	    function Behaviors(view, behaviors) {
	  
	      if (!_.isObject(view.behaviors)) {
	        return {};
	      }
	  
	      // Behaviors defined on a view can be a flat object literal
	      // or it can be a function that returns an object.
	      behaviors = Behaviors.parseBehaviors(view, behaviors || _.result(view, 'behaviors'));
	  
	      // Wraps several of the view's methods
	      // calling the methods first on each behavior
	      // and then eventually calling the method on the view.
	      Behaviors.wrap(view, behaviors, _.keys(methods));
	      return behaviors;
	    }
	  
	    var methods = {
	      behaviorTriggers: function(behaviorTriggers, behaviors) {
	        var triggerBuilder = new BehaviorTriggersBuilder(this, behaviors);
	        return triggerBuilder.buildBehaviorTriggers();
	      },
	  
	      behaviorEvents: function(behaviorEvents, behaviors) {
	        var _behaviorsEvents = {};
	  
	        _.each(behaviors, function(b, i) {
	          var _events = {};
	          var behaviorEvents = _.clone(_.result(b, 'events')) || {};
	  
	          // Normalize behavior events hash to allow
	          // a user to use the @ui. syntax.
	          behaviorEvents = Marionette.normalizeUIKeys(behaviorEvents, getBehaviorsUI(b));
	  
	          var j = 0;
	          _.each(behaviorEvents, function(behaviour, key) {
	            var match     = key.match(delegateEventSplitter);
	  
	            // Set event name to be namespaced using the view cid,
	            // the behavior index, and the behavior event index
	            // to generate a non colliding event namespace
	            // http://api.jquery.com/event.namespace/
	            var eventName = match[1] + '.' + [this.cid, i, j++, ' '].join('');
	            var selector  = match[2];
	  
	            var eventKey  = eventName + selector;
	            var handler   = _.isFunction(behaviour) ? behaviour : b[behaviour];
	            if (!handler) { return; }
	            _events[eventKey] = _.bind(handler, b);
	          }, this);
	  
	          _behaviorsEvents = _.extend(_behaviorsEvents, _events);
	        }, this);
	  
	        return _behaviorsEvents;
	      }
	    };
	  
	    _.extend(Behaviors, {
	  
	      // Placeholder method to be extended by the user.
	      // The method should define the object that stores the behaviors.
	      // i.e.
	      //
	      // ```js
	      // Marionette.Behaviors.behaviorsLookup: function() {
	      //   return App.Behaviors
	      // }
	      // ```
	      behaviorsLookup: function() {
	        throw new Marionette.Error({
	          message: 'You must define where your behaviors are stored.',
	          url: 'marionette.behaviors.html#behaviorslookup'
	        });
	      },
	  
	      // Takes care of getting the behavior class
	      // given options and a key.
	      // If a user passes in options.behaviorClass
	      // default to using that. Otherwise delegate
	      // the lookup to the users `behaviorsLookup` implementation.
	      getBehaviorClass: function(options, key) {
	        if (options.behaviorClass) {
	          return options.behaviorClass;
	        }
	  
	        // Get behavior class can be either a flat object or a method
	        return Marionette._getValue(Behaviors.behaviorsLookup, this, [options, key])[key];
	      },
	  
	      // Iterate over the behaviors object, for each behavior
	      // instantiate it and get its grouped behaviors.
	      parseBehaviors: function(view, behaviors) {
	        return _.chain(behaviors).map(function(options, key) {
	          var BehaviorClass = Behaviors.getBehaviorClass(options, key);
	  
	          var behavior = new BehaviorClass(options, view);
	          var nestedBehaviors = Behaviors.parseBehaviors(view, _.result(behavior, 'behaviors'));
	  
	          return [behavior].concat(nestedBehaviors);
	        }).flatten().value();
	      },
	  
	      // Wrap view internal methods so that they delegate to behaviors. For example,
	      // `onDestroy` should trigger destroy on all of the behaviors and then destroy itself.
	      // i.e.
	      //
	      // `view.delegateEvents = _.partial(methods.delegateEvents, view.delegateEvents, behaviors);`
	      wrap: function(view, behaviors, methodNames) {
	        _.each(methodNames, function(methodName) {
	          view[methodName] = _.partial(methods[methodName], view[methodName], behaviors);
	        });
	      }
	    });
	  
	    // Class to build handlers for `triggers` on behaviors
	    // for views
	    function BehaviorTriggersBuilder(view, behaviors) {
	      this._view      = view;
	      this._behaviors = behaviors;
	      this._triggers  = {};
	    }
	  
	    _.extend(BehaviorTriggersBuilder.prototype, {
	      // Main method to build the triggers hash with event keys and handlers
	      buildBehaviorTriggers: function() {
	        _.each(this._behaviors, this._buildTriggerHandlersForBehavior, this);
	        return this._triggers;
	      },
	  
	      // Internal method to build all trigger handlers for a given behavior
	      _buildTriggerHandlersForBehavior: function(behavior, i) {
	        var triggersHash = _.clone(_.result(behavior, 'triggers')) || {};
	  
	        triggersHash = Marionette.normalizeUIKeys(triggersHash, getBehaviorsUI(behavior));
	  
	        _.each(triggersHash, _.bind(this._setHandlerForBehavior, this, behavior, i));
	      },
	  
	      // Internal method to create and assign the trigger handler for a given
	      // behavior
	      _setHandlerForBehavior: function(behavior, i, eventName, trigger) {
	        // Unique identifier for the `this._triggers` hash
	        var triggerKey = trigger.replace(/^\S+/, function(triggerName) {
	          return triggerName + '.' + 'behaviortriggers' + i;
	        });
	  
	        this._triggers[triggerKey] = this._view._buildViewTrigger(eventName);
	      }
	    });
	  
	    function getBehaviorsUI(behavior) {
	      return behavior._uiBindings || behavior.ui;
	    }
	  
	    return Behaviors;
	  
	  })(Marionette, _);
	  
	
	  // App Router
	  // ----------
	  
	  // Reduce the boilerplate code of handling route events
	  // and then calling a single method on another object.
	  // Have your routers configured to call the method on
	  // your object, directly.
	  //
	  // Configure an AppRouter with `appRoutes`.
	  //
	  // App routers can only take one `controller` object.
	  // It is recommended that you divide your controller
	  // objects in to smaller pieces of related functionality
	  // and have multiple routers / controllers, instead of
	  // just one giant router and controller.
	  //
	  // You can also add standard routes to an AppRouter.
	  
	  Marionette.AppRouter = Backbone.Router.extend({
	  
	    constructor: function(options) {
	      this.options = options || {};
	  
	      Backbone.Router.apply(this, arguments);
	  
	      var appRoutes = this.getOption('appRoutes');
	      var controller = this._getController();
	      this.processAppRoutes(controller, appRoutes);
	      this.on('route', this._processOnRoute, this);
	    },
	  
	    // Similar to route method on a Backbone Router but
	    // method is called on the controller
	    appRoute: function(route, methodName) {
	      var controller = this._getController();
	      this._addAppRoute(controller, route, methodName);
	    },
	  
	    // process the route event and trigger the onRoute
	    // method call, if it exists
	    _processOnRoute: function(routeName, routeArgs) {
	      // make sure an onRoute before trying to call it
	      if (_.isFunction(this.onRoute)) {
	        // find the path that matches the current route
	        var routePath = _.invert(this.getOption('appRoutes'))[routeName];
	        this.onRoute(routeName, routePath, routeArgs);
	      }
	    },
	  
	    // Internal method to process the `appRoutes` for the
	    // router, and turn them in to routes that trigger the
	    // specified method on the specified `controller`.
	    processAppRoutes: function(controller, appRoutes) {
	      if (!appRoutes) { return; }
	  
	      var routeNames = _.keys(appRoutes).reverse(); // Backbone requires reverted order of routes
	  
	      _.each(routeNames, function(route) {
	        this._addAppRoute(controller, route, appRoutes[route]);
	      }, this);
	    },
	  
	    _getController: function() {
	      return this.getOption('controller');
	    },
	  
	    _addAppRoute: function(controller, route, methodName) {
	      var method = controller[methodName];
	  
	      if (!method) {
	        throw new Marionette.Error('Method "' + methodName + '" was not found on the controller');
	      }
	  
	      this.route(route, methodName, _.bind(method, controller));
	    },
	  
	    mergeOptions: Marionette.mergeOptions,
	  
	    // Proxy `getOption` to enable getting options from this or this.options by name.
	    getOption: Marionette.proxyGetOption,
	  
	    triggerMethod: Marionette.triggerMethod,
	  
	    bindEntityEvents: Marionette.proxyBindEntityEvents,
	  
	    unbindEntityEvents: Marionette.proxyUnbindEntityEvents
	  });
	  
	  // Application
	  // -----------
	  
	  // Contain and manage the composite application as a whole.
	  // Stores and starts up `Region` objects, includes an
	  // event aggregator as `app.vent`
	  Marionette.Application = Marionette.Object.extend({
	    constructor: function(options) {
	      this._initializeRegions(options);
	      this._initCallbacks = new Marionette.Callbacks();
	      this.submodules = {};
	      _.extend(this, options);
	      this._initChannel();
	      Marionette.Object.apply(this, arguments);
	    },
	  
	    // Command execution, facilitated by Backbone.Wreqr.Commands
	    execute: function() {
	      this.commands.execute.apply(this.commands, arguments);
	    },
	  
	    // Request/response, facilitated by Backbone.Wreqr.RequestResponse
	    request: function() {
	      return this.reqres.request.apply(this.reqres, arguments);
	    },
	  
	    // Add an initializer that is either run at when the `start`
	    // method is called, or run immediately if added after `start`
	    // has already been called.
	    addInitializer: function(initializer) {
	      this._initCallbacks.add(initializer);
	    },
	  
	    // kick off all of the application's processes.
	    // initializes all of the regions that have been added
	    // to the app, and runs all of the initializer functions
	    start: function(options) {
	      this.triggerMethod('before:start', options);
	      this._initCallbacks.run(options, this);
	      this.triggerMethod('start', options);
	    },
	  
	    // Add regions to your app.
	    // Accepts a hash of named strings or Region objects
	    // addRegions({something: "#someRegion"})
	    // addRegions({something: Region.extend({el: "#someRegion"}) });
	    addRegions: function(regions) {
	      return this._regionManager.addRegions(regions);
	    },
	  
	    // Empty all regions in the app, without removing them
	    emptyRegions: function() {
	      return this._regionManager.emptyRegions();
	    },
	  
	    // Removes a region from your app, by name
	    // Accepts the regions name
	    // removeRegion('myRegion')
	    removeRegion: function(region) {
	      return this._regionManager.removeRegion(region);
	    },
	  
	    // Provides alternative access to regions
	    // Accepts the region name
	    // getRegion('main')
	    getRegion: function(region) {
	      return this._regionManager.get(region);
	    },
	  
	    // Get all the regions from the region manager
	    getRegions: function() {
	      return this._regionManager.getRegions();
	    },
	  
	    // Create a module, attached to the application
	    module: function(moduleNames, moduleDefinition) {
	  
	      // Overwrite the module class if the user specifies one
	      var ModuleClass = Marionette.Module.getClass(moduleDefinition);
	  
	      var args = _.toArray(arguments);
	      args.unshift(this);
	  
	      // see the Marionette.Module object for more information
	      return ModuleClass.create.apply(ModuleClass, args);
	    },
	  
	    // Enable easy overriding of the default `RegionManager`
	    // for customized region interactions and business-specific
	    // view logic for better control over single regions.
	    getRegionManager: function() {
	      return new Marionette.RegionManager();
	    },
	  
	    // Internal method to initialize the regions that have been defined in a
	    // `regions` attribute on the application instance
	    _initializeRegions: function(options) {
	      var regions = _.isFunction(this.regions) ? this.regions(options) : this.regions || {};
	  
	      this._initRegionManager();
	  
	      // Enable users to define `regions` in instance options.
	      var optionRegions = Marionette.getOption(options, 'regions');
	  
	      // Enable region options to be a function
	      if (_.isFunction(optionRegions)) {
	        optionRegions = optionRegions.call(this, options);
	      }
	  
	      // Overwrite current regions with those passed in options
	      _.extend(regions, optionRegions);
	  
	      this.addRegions(regions);
	  
	      return this;
	    },
	  
	    // Internal method to set up the region manager
	    _initRegionManager: function() {
	      this._regionManager = this.getRegionManager();
	      this._regionManager._parent = this;
	  
	      this.listenTo(this._regionManager, 'before:add:region', function() {
	        Marionette._triggerMethod(this, 'before:add:region', arguments);
	      });
	  
	      this.listenTo(this._regionManager, 'add:region', function(name, region) {
	        this[name] = region;
	        Marionette._triggerMethod(this, 'add:region', arguments);
	      });
	  
	      this.listenTo(this._regionManager, 'before:remove:region', function() {
	        Marionette._triggerMethod(this, 'before:remove:region', arguments);
	      });
	  
	      this.listenTo(this._regionManager, 'remove:region', function(name) {
	        delete this[name];
	        Marionette._triggerMethod(this, 'remove:region', arguments);
	      });
	    },
	  
	    // Internal method to setup the Wreqr.radio channel
	    _initChannel: function() {
	      this.channelName = _.result(this, 'channelName') || 'global';
	      this.channel = _.result(this, 'channel') || Backbone.Wreqr.radio.channel(this.channelName);
	      this.vent = _.result(this, 'vent') || this.channel.vent;
	      this.commands = _.result(this, 'commands') || this.channel.commands;
	      this.reqres = _.result(this, 'reqres') || this.channel.reqres;
	    }
	  });
	  
	  /* jshint maxparams: 9 */
	  
	  // Module
	  // ------
	  
	  // A simple module system, used to create privacy and encapsulation in
	  // Marionette applications
	  Marionette.Module = function(moduleName, app, options) {
	    this.moduleName = moduleName;
	    this.options = _.extend({}, this.options, options);
	    // Allow for a user to overide the initialize
	    // for a given module instance.
	    this.initialize = options.initialize || this.initialize;
	  
	    // Set up an internal store for sub-modules.
	    this.submodules = {};
	  
	    this._setupInitializersAndFinalizers();
	  
	    // Set an internal reference to the app
	    // within a module.
	    this.app = app;
	  
	    if (_.isFunction(this.initialize)) {
	      this.initialize(moduleName, app, this.options);
	    }
	  };
	  
	  Marionette.Module.extend = Marionette.extend;
	  
	  // Extend the Module prototype with events / listenTo, so that the module
	  // can be used as an event aggregator or pub/sub.
	  _.extend(Marionette.Module.prototype, Backbone.Events, {
	  
	    // By default modules start with their parents.
	    startWithParent: true,
	  
	    // Initialize is an empty function by default. Override it with your own
	    // initialization logic when extending Marionette.Module.
	    initialize: function() {},
	  
	    // Initializer for a specific module. Initializers are run when the
	    // module's `start` method is called.
	    addInitializer: function(callback) {
	      this._initializerCallbacks.add(callback);
	    },
	  
	    // Finalizers are run when a module is stopped. They are used to teardown
	    // and finalize any variables, references, events and other code that the
	    // module had set up.
	    addFinalizer: function(callback) {
	      this._finalizerCallbacks.add(callback);
	    },
	  
	    // Start the module, and run all of its initializers
	    start: function(options) {
	      // Prevent re-starting a module that is already started
	      if (this._isInitialized) { return; }
	  
	      // start the sub-modules (depth-first hierarchy)
	      _.each(this.submodules, function(mod) {
	        // check to see if we should start the sub-module with this parent
	        if (mod.startWithParent) {
	          mod.start(options);
	        }
	      });
	  
	      // run the callbacks to "start" the current module
	      this.triggerMethod('before:start', options);
	  
	      this._initializerCallbacks.run(options, this);
	      this._isInitialized = true;
	  
	      this.triggerMethod('start', options);
	    },
	  
	    // Stop this module by running its finalizers and then stop all of
	    // the sub-modules for this module
	    stop: function() {
	      // if we are not initialized, don't bother finalizing
	      if (!this._isInitialized) { return; }
	      this._isInitialized = false;
	  
	      this.triggerMethod('before:stop');
	  
	      // stop the sub-modules; depth-first, to make sure the
	      // sub-modules are stopped / finalized before parents
	      _.invoke(this.submodules, 'stop');
	  
	      // run the finalizers
	      this._finalizerCallbacks.run(undefined, this);
	  
	      // reset the initializers and finalizers
	      this._initializerCallbacks.reset();
	      this._finalizerCallbacks.reset();
	  
	      this.triggerMethod('stop');
	    },
	  
	    // Configure the module with a definition function and any custom args
	    // that are to be passed in to the definition function
	    addDefinition: function(moduleDefinition, customArgs) {
	      this._runModuleDefinition(moduleDefinition, customArgs);
	    },
	  
	    // Internal method: run the module definition function with the correct
	    // arguments
	    _runModuleDefinition: function(definition, customArgs) {
	      // If there is no definition short circut the method.
	      if (!definition) { return; }
	  
	      // build the correct list of arguments for the module definition
	      var args = _.flatten([
	        this,
	        this.app,
	        Backbone,
	        Marionette,
	        Backbone.$, _,
	        customArgs
	      ]);
	  
	      definition.apply(this, args);
	    },
	  
	    // Internal method: set up new copies of initializers and finalizers.
	    // Calling this method will wipe out all existing initializers and
	    // finalizers.
	    _setupInitializersAndFinalizers: function() {
	      this._initializerCallbacks = new Marionette.Callbacks();
	      this._finalizerCallbacks = new Marionette.Callbacks();
	    },
	  
	    // import the `triggerMethod` to trigger events with corresponding
	    // methods if the method exists
	    triggerMethod: Marionette.triggerMethod
	  });
	  
	  // Class methods to create modules
	  _.extend(Marionette.Module, {
	  
	    // Create a module, hanging off the app parameter as the parent object.
	    create: function(app, moduleNames, moduleDefinition) {
	      var module = app;
	  
	      // get the custom args passed in after the module definition and
	      // get rid of the module name and definition function
	      var customArgs = _.drop(arguments, 3);
	  
	      // Split the module names and get the number of submodules.
	      // i.e. an example module name of `Doge.Wow.Amaze` would
	      // then have the potential for 3 module definitions.
	      moduleNames = moduleNames.split('.');
	      var length = moduleNames.length;
	  
	      // store the module definition for the last module in the chain
	      var moduleDefinitions = [];
	      moduleDefinitions[length - 1] = moduleDefinition;
	  
	      // Loop through all the parts of the module definition
	      _.each(moduleNames, function(moduleName, i) {
	        var parentModule = module;
	        module = this._getModule(parentModule, moduleName, app, moduleDefinition);
	        this._addModuleDefinition(parentModule, module, moduleDefinitions[i], customArgs);
	      }, this);
	  
	      // Return the last module in the definition chain
	      return module;
	    },
	  
	    _getModule: function(parentModule, moduleName, app, def, args) {
	      var options = _.extend({}, def);
	      var ModuleClass = this.getClass(def);
	  
	      // Get an existing module of this name if we have one
	      var module = parentModule[moduleName];
	  
	      if (!module) {
	        // Create a new module if we don't have one
	        module = new ModuleClass(moduleName, app, options);
	        parentModule[moduleName] = module;
	        // store the module on the parent
	        parentModule.submodules[moduleName] = module;
	      }
	  
	      return module;
	    },
	  
	    // ## Module Classes
	    //
	    // Module classes can be used as an alternative to the define pattern.
	    // The extend function of a Module is identical to the extend functions
	    // on other Backbone and Marionette classes.
	    // This allows module lifecyle events like `onStart` and `onStop` to be called directly.
	    getClass: function(moduleDefinition) {
	      var ModuleClass = Marionette.Module;
	  
	      if (!moduleDefinition) {
	        return ModuleClass;
	      }
	  
	      // If all of the module's functionality is defined inside its class,
	      // then the class can be passed in directly. `MyApp.module("Foo", FooModule)`.
	      if (moduleDefinition.prototype instanceof ModuleClass) {
	        return moduleDefinition;
	      }
	  
	      return moduleDefinition.moduleClass || ModuleClass;
	    },
	  
	    // Add the module definition and add a startWithParent initializer function.
	    // This is complicated because module definitions are heavily overloaded
	    // and support an anonymous function, module class, or options object
	    _addModuleDefinition: function(parentModule, module, def, args) {
	      var fn = this._getDefine(def);
	      var startWithParent = this._getStartWithParent(def, module);
	  
	      if (fn) {
	        module.addDefinition(fn, args);
	      }
	  
	      this._addStartWithParent(parentModule, module, startWithParent);
	    },
	  
	    _getStartWithParent: function(def, module) {
	      var swp;
	  
	      if (_.isFunction(def) && (def.prototype instanceof Marionette.Module)) {
	        swp = module.constructor.prototype.startWithParent;
	        return _.isUndefined(swp) ? true : swp;
	      }
	  
	      if (_.isObject(def)) {
	        swp = def.startWithParent;
	        return _.isUndefined(swp) ? true : swp;
	      }
	  
	      return true;
	    },
	  
	    _getDefine: function(def) {
	      if (_.isFunction(def) && !(def.prototype instanceof Marionette.Module)) {
	        return def;
	      }
	  
	      if (_.isObject(def)) {
	        return def.define;
	      }
	  
	      return null;
	    },
	  
	    _addStartWithParent: function(parentModule, module, startWithParent) {
	      module.startWithParent = module.startWithParent && startWithParent;
	  
	      if (!module.startWithParent || !!module.startWithParentIsConfigured) {
	        return;
	      }
	  
	      module.startWithParentIsConfigured = true;
	  
	      parentModule.addInitializer(function(options) {
	        if (module.startWithParent) {
	          module.start(options);
	        }
	      });
	    }
	  });
	  
	
	  return Marionette;
	}));


/***/ },
/* 6 */
/***/ function(module, exports, __webpack_require__) {

	var __WEBPACK_AMD_DEFINE_ARRAY__, __WEBPACK_AMD_DEFINE_RESULT__;// Backbone.Wreqr (Backbone.Marionette)
	// ----------------------------------
	// v1.3.6
	//
	// Copyright (c)2016 Derick Bailey, Muted Solutions, LLC.
	// Distributed under MIT license
	//
	// http://github.com/marionettejs/backbone.wreqr
	
	
	(function(root, factory) {
	
	  if (true) {
	    !(__WEBPACK_AMD_DEFINE_ARRAY__ = [__webpack_require__(4), __webpack_require__(3)], __WEBPACK_AMD_DEFINE_RESULT__ = function(Backbone, _) {
	      return factory(Backbone, _);
	    }.apply(exports, __WEBPACK_AMD_DEFINE_ARRAY__), __WEBPACK_AMD_DEFINE_RESULT__ !== undefined && (module.exports = __WEBPACK_AMD_DEFINE_RESULT__));
	  } else if (typeof exports !== 'undefined') {
	    var Backbone = require('backbone');
	    var _ = require('underscore');
	    module.exports = factory(Backbone, _);
	  } else {
	    factory(root.Backbone, root._);
	  }
	
	}(this, function(Backbone, _) {
	  "use strict";
	
	  var previousWreqr = Backbone.Wreqr;
	
	  var Wreqr = Backbone.Wreqr = {};
	
	  Backbone.Wreqr.VERSION = '1.3.6';
	
	  Backbone.Wreqr.noConflict = function () {
	    Backbone.Wreqr = previousWreqr;
	    return this;
	  };
	
	  // Handlers
	  // --------
	  // A registry of functions to call, given a name
	  
	  Wreqr.Handlers = (function(Backbone, _){
	    "use strict";
	    
	    // Constructor
	    // -----------
	  
	    var Handlers = function(options){
	      this.options = options;
	      this._wreqrHandlers = {};
	      
	      if (_.isFunction(this.initialize)){
	        this.initialize(options);
	      }
	    };
	  
	    Handlers.extend = Backbone.Model.extend;
	  
	    // Instance Members
	    // ----------------
	  
	    _.extend(Handlers.prototype, Backbone.Events, {
	  
	      // Add multiple handlers using an object literal configuration
	      setHandlers: function(handlers){
	        _.each(handlers, function(handler, name){
	          var context = null;
	  
	          if (_.isObject(handler) && !_.isFunction(handler)){
	            context = handler.context;
	            handler = handler.callback;
	          }
	  
	          this.setHandler(name, handler, context);
	        }, this);
	      },
	  
	      // Add a handler for the given name, with an
	      // optional context to run the handler within
	      setHandler: function(name, handler, context){
	        var config = {
	          callback: handler,
	          context: context
	        };
	  
	        this._wreqrHandlers[name] = config;
	  
	        this.trigger("handler:add", name, handler, context);
	      },
	  
	      // Determine whether or not a handler is registered
	      hasHandler: function(name){
	        return !! this._wreqrHandlers[name];
	      },
	  
	      // Get the currently registered handler for
	      // the specified name. Throws an exception if
	      // no handler is found.
	      getHandler: function(name){
	        var config = this._wreqrHandlers[name];
	  
	        if (!config){
	          return;
	        }
	  
	        return function(){
	          return config.callback.apply(config.context, arguments);
	        };
	      },
	  
	      // Remove a handler for the specified name
	      removeHandler: function(name){
	        delete this._wreqrHandlers[name];
	      },
	  
	      // Remove all handlers from this registry
	      removeAllHandlers: function(){
	        this._wreqrHandlers = {};
	      }
	    });
	  
	    return Handlers;
	  })(Backbone, _);
	  
	  // Wreqr.CommandStorage
	  // --------------------
	  //
	  // Store and retrieve commands for execution.
	  Wreqr.CommandStorage = (function(){
	    "use strict";
	  
	    // Constructor function
	    var CommandStorage = function(options){
	      this.options = options;
	      this._commands = {};
	  
	      if (_.isFunction(this.initialize)){
	        this.initialize(options);
	      }
	    };
	  
	    // Instance methods
	    _.extend(CommandStorage.prototype, Backbone.Events, {
	  
	      // Get an object literal by command name, that contains
	      // the `commandName` and the `instances` of all commands
	      // represented as an array of arguments to process
	      getCommands: function(commandName){
	        var commands = this._commands[commandName];
	  
	        // we don't have it, so add it
	        if (!commands){
	  
	          // build the configuration
	          commands = {
	            command: commandName, 
	            instances: []
	          };
	  
	          // store it
	          this._commands[commandName] = commands;
	        }
	  
	        return commands;
	      },
	  
	      // Add a command by name, to the storage and store the
	      // args for the command
	      addCommand: function(commandName, args){
	        var command = this.getCommands(commandName);
	        command.instances.push(args);
	      },
	  
	      // Clear all commands for the given `commandName`
	      clearCommands: function(commandName){
	        var command = this.getCommands(commandName);
	        command.instances = [];
	      }
	    });
	  
	    return CommandStorage;
	  })();
	  
	  // Wreqr.Commands
	  // --------------
	  //
	  // A simple command pattern implementation. Register a command
	  // handler and execute it.
	  Wreqr.Commands = (function(Wreqr, _){
	    "use strict";
	  
	    return Wreqr.Handlers.extend({
	      // default storage type
	      storageType: Wreqr.CommandStorage,
	  
	      constructor: function(options){
	        this.options = options || {};
	  
	        this._initializeStorage(this.options);
	        this.on("handler:add", this._executeCommands, this);
	  
	        Wreqr.Handlers.prototype.constructor.apply(this, arguments);
	      },
	  
	      // Execute a named command with the supplied args
	      execute: function(name){
	        name = arguments[0];
	        var args = _.rest(arguments);
	  
	        if (this.hasHandler(name)){
	          this.getHandler(name).apply(this, args);
	        } else {
	          this.storage.addCommand(name, args);
	        }
	  
	      },
	  
	      // Internal method to handle bulk execution of stored commands
	      _executeCommands: function(name, handler, context){
	        var command = this.storage.getCommands(name);
	  
	        // loop through and execute all the stored command instances
	        _.each(command.instances, function(args){
	          handler.apply(context, args);
	        });
	  
	        this.storage.clearCommands(name);
	      },
	  
	      // Internal method to initialize storage either from the type's
	      // `storageType` or the instance `options.storageType`.
	      _initializeStorage: function(options){
	        var storage;
	  
	        var StorageType = options.storageType || this.storageType;
	        if (_.isFunction(StorageType)){
	          storage = new StorageType();
	        } else {
	          storage = StorageType;
	        }
	  
	        this.storage = storage;
	      }
	    });
	  
	  })(Wreqr, _);
	  
	  // Wreqr.RequestResponse
	  // ---------------------
	  //
	  // A simple request/response implementation. Register a
	  // request handler, and return a response from it
	  Wreqr.RequestResponse = (function(Wreqr, _){
	    "use strict";
	  
	    return Wreqr.Handlers.extend({
	      request: function(name){
	        if (this.hasHandler(name)) {
	          return this.getHandler(name).apply(this, _.rest(arguments));
	        }
	      }
	    });
	  
	  })(Wreqr, _);
	  
	  // Event Aggregator
	  // ----------------
	  // A pub-sub object that can be used to decouple various parts
	  // of an application through event-driven architecture.
	  
	  Wreqr.EventAggregator = (function(Backbone, _){
	    "use strict";
	    var EA = function(){};
	  
	    // Copy the `extend` function used by Backbone's classes
	    EA.extend = Backbone.Model.extend;
	  
	    // Copy the basic Backbone.Events on to the event aggregator
	    _.extend(EA.prototype, Backbone.Events);
	  
	    return EA;
	  })(Backbone, _);
	  
	  // Wreqr.Channel
	  // --------------
	  //
	  // An object that wraps the three messaging systems:
	  // EventAggregator, RequestResponse, Commands
	  Wreqr.Channel = (function(Wreqr){
	    "use strict";
	  
	    var Channel = function(channelName) {
	      this.vent        = new Backbone.Wreqr.EventAggregator();
	      this.reqres      = new Backbone.Wreqr.RequestResponse();
	      this.commands    = new Backbone.Wreqr.Commands();
	      this.channelName = channelName;
	    };
	  
	    _.extend(Channel.prototype, {
	  
	      // Remove all handlers from the messaging systems of this channel
	      reset: function() {
	        this.vent.off();
	        this.vent.stopListening();
	        this.reqres.removeAllHandlers();
	        this.commands.removeAllHandlers();
	        return this;
	      },
	  
	      // Connect a hash of events; one for each messaging system
	      connectEvents: function(hash, context) {
	        this._connect('vent', hash, context);
	        return this;
	      },
	  
	      connectCommands: function(hash, context) {
	        this._connect('commands', hash, context);
	        return this;
	      },
	  
	      connectRequests: function(hash, context) {
	        this._connect('reqres', hash, context);
	        return this;
	      },
	  
	      // Attach the handlers to a given message system `type`
	      _connect: function(type, hash, context) {
	        if (!hash) {
	          return;
	        }
	  
	        context = context || this;
	        var method = (type === 'vent') ? 'on' : 'setHandler';
	  
	        _.each(hash, function(fn, eventName) {
	          this[type][method](eventName, _.bind(fn, context));
	        }, this);
	      }
	    });
	  
	  
	    return Channel;
	  })(Wreqr);
	  
	  // Wreqr.Radio
	  // --------------
	  //
	  // An object that lets you communicate with many channels.
	  Wreqr.radio = (function(Wreqr, _){
	    "use strict";
	  
	    var Radio = function() {
	      this._channels = {};
	      this.vent = {};
	      this.commands = {};
	      this.reqres = {};
	      this._proxyMethods();
	    };
	  
	    _.extend(Radio.prototype, {
	  
	      channel: function(channelName) {
	        if (!channelName) {
	          throw new Error('Channel must receive a name');
	        }
	  
	        return this._getChannel( channelName );
	      },
	  
	      _getChannel: function(channelName) {
	        var channel = this._channels[channelName];
	  
	        if(!channel) {
	          channel = new Wreqr.Channel(channelName);
	          this._channels[channelName] = channel;
	        }
	  
	        return channel;
	      },
	  
	      _proxyMethods: function() {
	        _.each(['vent', 'commands', 'reqres'], function(system) {
	          _.each( messageSystems[system], function(method) {
	            this[system][method] = proxyMethod(this, system, method);
	          }, this);
	        }, this);
	      }
	    });
	  
	  
	    var messageSystems = {
	      vent: [
	        'on',
	        'off',
	        'trigger',
	        'once',
	        'stopListening',
	        'listenTo',
	        'listenToOnce'
	      ],
	  
	      commands: [
	        'execute',
	        'setHandler',
	        'setHandlers',
	        'removeHandler',
	        'removeAllHandlers'
	      ],
	  
	      reqres: [
	        'request',
	        'setHandler',
	        'setHandlers',
	        'removeHandler',
	        'removeAllHandlers'
	      ]
	    };
	  
	    var proxyMethod = function(radio, system, method) {
	      return function(channelName) {
	        var messageSystem = radio._getChannel(channelName)[system];
	  
	        return messageSystem[method].apply(messageSystem, _.rest(arguments));
	      };
	    };
	  
	    return new Radio();
	  
	  })(Wreqr, _);
	  
	
	  return Backbone.Wreqr;
	
	}));


/***/ },
/* 7 */
/***/ function(module, exports, __webpack_require__) {

	var __WEBPACK_AMD_DEFINE_ARRAY__, __WEBPACK_AMD_DEFINE_RESULT__;// Backbone.BabySitter
	// -------------------
	// v0.1.11
	//
	// Copyright (c)2016 Derick Bailey, Muted Solutions, LLC.
	// Distributed under MIT license
	//
	// http://github.com/marionettejs/backbone.babysitter
	
	(function(root, factory) {
	
	  if (true) {
	    !(__WEBPACK_AMD_DEFINE_ARRAY__ = [__webpack_require__(4), __webpack_require__(3)], __WEBPACK_AMD_DEFINE_RESULT__ = function(Backbone, _) {
	      return factory(Backbone, _);
	    }.apply(exports, __WEBPACK_AMD_DEFINE_ARRAY__), __WEBPACK_AMD_DEFINE_RESULT__ !== undefined && (module.exports = __WEBPACK_AMD_DEFINE_RESULT__));
	  } else if (typeof exports !== 'undefined') {
	    var Backbone = require('backbone');
	    var _ = require('underscore');
	    module.exports = factory(Backbone, _);
	  } else {
	    factory(root.Backbone, root._);
	  }
	
	}(this, function(Backbone, _) {
	  'use strict';
	
	  var previousChildViewContainer = Backbone.ChildViewContainer;
	
	  // BabySitter.ChildViewContainer
	  // -----------------------------
	  //
	  // Provide a container to store, retrieve and
	  // shut down child views.
	  
	  Backbone.ChildViewContainer = (function (Backbone, _) {
	  
	    // Container Constructor
	    // ---------------------
	  
	    var Container = function(views){
	      this._views = {};
	      this._indexByModel = {};
	      this._indexByCustom = {};
	      this._updateLength();
	  
	      _.each(views, this.add, this);
	    };
	  
	    // Container Methods
	    // -----------------
	  
	    _.extend(Container.prototype, {
	  
	      // Add a view to this container. Stores the view
	      // by `cid` and makes it searchable by the model
	      // cid (and model itself). Optionally specify
	      // a custom key to store an retrieve the view.
	      add: function(view, customIndex){
	        var viewCid = view.cid;
	  
	        // store the view
	        this._views[viewCid] = view;
	  
	        // index it by model
	        if (view.model){
	          this._indexByModel[view.model.cid] = viewCid;
	        }
	  
	        // index by custom
	        if (customIndex){
	          this._indexByCustom[customIndex] = viewCid;
	        }
	  
	        this._updateLength();
	        return this;
	      },
	  
	      // Find a view by the model that was attached to
	      // it. Uses the model's `cid` to find it.
	      findByModel: function(model){
	        return this.findByModelCid(model.cid);
	      },
	  
	      // Find a view by the `cid` of the model that was attached to
	      // it. Uses the model's `cid` to find the view `cid` and
	      // retrieve the view using it.
	      findByModelCid: function(modelCid){
	        var viewCid = this._indexByModel[modelCid];
	        return this.findByCid(viewCid);
	      },
	  
	      // Find a view by a custom indexer.
	      findByCustom: function(index){
	        var viewCid = this._indexByCustom[index];
	        return this.findByCid(viewCid);
	      },
	  
	      // Find by index. This is not guaranteed to be a
	      // stable index.
	      findByIndex: function(index){
	        return _.values(this._views)[index];
	      },
	  
	      // retrieve a view by its `cid` directly
	      findByCid: function(cid){
	        return this._views[cid];
	      },
	  
	      // Remove a view
	      remove: function(view){
	        var viewCid = view.cid;
	  
	        // delete model index
	        if (view.model){
	          delete this._indexByModel[view.model.cid];
	        }
	  
	        // delete custom index
	        _.any(this._indexByCustom, function(cid, key) {
	          if (cid === viewCid) {
	            delete this._indexByCustom[key];
	            return true;
	          }
	        }, this);
	  
	        // remove the view from the container
	        delete this._views[viewCid];
	  
	        // update the length
	        this._updateLength();
	        return this;
	      },
	  
	      // Call a method on every view in the container,
	      // passing parameters to the call method one at a
	      // time, like `function.call`.
	      call: function(method){
	        this.apply(method, _.tail(arguments));
	      },
	  
	      // Apply a method on every view in the container,
	      // passing parameters to the call method one at a
	      // time, like `function.apply`.
	      apply: function(method, args){
	        _.each(this._views, function(view){
	          if (_.isFunction(view[method])){
	            view[method].apply(view, args || []);
	          }
	        });
	      },
	  
	      // Update the `.length` attribute on this container
	      _updateLength: function(){
	        this.length = _.size(this._views);
	      }
	    });
	  
	    // Borrowing this code from Backbone.Collection:
	    // http://backbonejs.org/docs/backbone.html#section-106
	    //
	    // Mix in methods from Underscore, for iteration, and other
	    // collection related features.
	    var methods = ['forEach', 'each', 'map', 'find', 'detect', 'filter',
	      'select', 'reject', 'every', 'all', 'some', 'any', 'include',
	      'contains', 'invoke', 'toArray', 'first', 'initial', 'rest',
	      'last', 'without', 'isEmpty', 'pluck', 'reduce'];
	  
	    _.each(methods, function(method) {
	      Container.prototype[method] = function() {
	        var views = _.values(this._views);
	        var args = [views].concat(_.toArray(arguments));
	        return _[method].apply(_, args);
	      };
	    });
	  
	    // return the public API
	    return Container;
	  })(Backbone, _);
	  
	
	  Backbone.ChildViewContainer.VERSION = '0.1.11';
	
	  Backbone.ChildViewContainer.noConflict = function () {
	    Backbone.ChildViewContainer = previousChildViewContainer;
	    return this;
	  };
	
	  return Backbone.ChildViewContainer;
	
	}));


/***/ },
/* 8 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	__webpack_require__(9);
	var Radio = (function () {
	    function Radio() {
	        this._globalChannel = Backbone.Radio.channel("global");
	    }
	    Object.defineProperty(Radio.prototype, "globalChannel", {
	        get: function () {
	            return this._globalChannel;
	        },
	        enumerable: true,
	        configurable: true
	    });
	    return Radio;
	}());
	exports.Radio = Radio;


/***/ },
/* 9 */
/***/ function(module, exports, __webpack_require__) {

	// Backbone.Radio v2.0.0
	
	(function (global, factory) {
	   true ? module.exports = factory(__webpack_require__(3), __webpack_require__(4)) :
	  typeof define === 'function' && define.amd ? define(['underscore', 'backbone'], factory) :
	  (global.Backbone = global.Backbone || {}, global.Backbone.Radio = factory(global._,global.Backbone));
	}(this, function (_,Backbone) { 'use strict';
	
	  _ = 'default' in _ ? _['default'] : _;
	  Backbone = 'default' in Backbone ? Backbone['default'] : Backbone;
	
	  var _typeof = typeof Symbol === "function" && typeof Symbol.iterator === "symbol" ? function (obj) {
	    return typeof obj;
	  } : function (obj) {
	    return obj && typeof Symbol === "function" && obj.constructor === Symbol ? "symbol" : typeof obj;
	  };
	
	  var previousRadio = Backbone.Radio;
	
	  var Radio = Backbone.Radio = {};
	
	  Radio.VERSION = '2.0.0';
	
	  // This allows you to run multiple instances of Radio on the same
	  // webapp. After loading the new version, call `noConflict()` to
	  // get a reference to it. At the same time the old version will be
	  // returned to Backbone.Radio.
	  Radio.noConflict = function () {
	    Backbone.Radio = previousRadio;
	    return this;
	  };
	
	  // Whether or not we're in DEBUG mode or not. DEBUG mode helps you
	  // get around the issues of lack of warnings when events are mis-typed.
	  Radio.DEBUG = false;
	
	  // Format debug text.
	  Radio._debugText = function (warning, eventName, channelName) {
	    return warning + (channelName ? ' on the ' + channelName + ' channel' : '') + ': "' + eventName + '"';
	  };
	
	  // This is the method that's called when an unregistered event was called.
	  // By default, it logs warning to the console. By overriding this you could
	  // make it throw an Error, for instance. This would make firing a nonexistent event
	  // have the same consequence as firing a nonexistent method on an Object.
	  Radio.debugLog = function (warning, eventName, channelName) {
	    if (Radio.DEBUG && console && console.warn) {
	      console.warn(Radio._debugText(warning, eventName, channelName));
	    }
	  };
	
	  var eventSplitter = /\s+/;
	
	  // An internal method used to handle Radio's method overloading for Requests.
	  // It's borrowed from Backbone.Events. It differs from Backbone's overload
	  // API (which is used in Backbone.Events) in that it doesn't support space-separated
	  // event names.
	  Radio._eventsApi = function (obj, action, name, rest) {
	    if (!name) {
	      return false;
	    }
	
	    var results = {};
	
	    // Handle event maps.
	    if ((typeof name === 'undefined' ? 'undefined' : _typeof(name)) === 'object') {
	      for (var key in name) {
	        var result = obj[action].apply(obj, [key, name[key]].concat(rest));
	        eventSplitter.test(key) ? _.extend(results, result) : results[key] = result;
	      }
	      return results;
	    }
	
	    // Handle space separated event names.
	    if (eventSplitter.test(name)) {
	      var names = name.split(eventSplitter);
	      for (var i = 0, l = names.length; i < l; i++) {
	        results[names[i]] = obj[action].apply(obj, [names[i]].concat(rest));
	      }
	      return results;
	    }
	
	    return false;
	  };
	
	  // An optimized way to execute callbacks.
	  Radio._callHandler = function (callback, context, args) {
	    var a1 = args[0],
	        a2 = args[1],
	        a3 = args[2];
	    switch (args.length) {
	      case 0:
	        return callback.call(context);
	      case 1:
	        return callback.call(context, a1);
	      case 2:
	        return callback.call(context, a1, a2);
	      case 3:
	        return callback.call(context, a1, a2, a3);
	      default:
	        return callback.apply(context, args);
	    }
	  };
	
	  // A helper used by `off` methods to the handler from the store
	  function removeHandler(store, name, callback, context) {
	    var event = store[name];
	    if ((!callback || callback === event.callback || callback === event.callback._callback) && (!context || context === event.context)) {
	      delete store[name];
	      return true;
	    }
	  }
	
	  function removeHandlers(store, name, callback, context) {
	    store || (store = {});
	    var names = name ? [name] : _.keys(store);
	    var matched = false;
	
	    for (var i = 0, length = names.length; i < length; i++) {
	      name = names[i];
	
	      // If there's no event by this name, log it and continue
	      // with the loop
	      if (!store[name]) {
	        continue;
	      }
	
	      if (removeHandler(store, name, callback, context)) {
	        matched = true;
	      }
	    }
	
	    return matched;
	  }
	
	  /*
	   * tune-in
	   * -------
	   * Get console logs of a channel's activity
	   *
	   */
	
	  var _logs = {};
	
	  // This is to produce an identical function in both tuneIn and tuneOut,
	  // so that Backbone.Events unregisters it.
	  function _partial(channelName) {
	    return _logs[channelName] || (_logs[channelName] = _.bind(Radio.log, Radio, channelName));
	  }
	
	  _.extend(Radio, {
	
	    // Log information about the channel and event
	    log: function log(channelName, eventName) {
	      if (typeof console === 'undefined') {
	        return;
	      }
	      var args = _.toArray(arguments).slice(2);
	      console.log('[' + channelName + '] "' + eventName + '"', args);
	    },
	
	    // Logs all events on this channel to the console. It sets an
	    // internal value on the channel telling it we're listening,
	    // then sets a listener on the Backbone.Events
	    tuneIn: function tuneIn(channelName) {
	      var channel = Radio.channel(channelName);
	      channel._tunedIn = true;
	      channel.on('all', _partial(channelName));
	      return this;
	    },
	
	    // Stop logging all of the activities on this channel to the console
	    tuneOut: function tuneOut(channelName) {
	      var channel = Radio.channel(channelName);
	      channel._tunedIn = false;
	      channel.off('all', _partial(channelName));
	      delete _logs[channelName];
	      return this;
	    }
	  });
	
	  /*
	   * Backbone.Radio.Requests
	   * -----------------------
	   * A messaging system for requesting data.
	   *
	   */
	
	  function makeCallback(callback) {
	    return _.isFunction(callback) ? callback : function () {
	      return callback;
	    };
	  }
	
	  Radio.Requests = {
	
	    // Make a request
	    request: function request(name) {
	      var args = _.toArray(arguments).slice(1);
	      var results = Radio._eventsApi(this, 'request', name, args);
	      if (results) {
	        return results;
	      }
	      var channelName = this.channelName;
	      var requests = this._requests;
	
	      // Check if we should log the request, and if so, do it
	      if (channelName && this._tunedIn) {
	        Radio.log.apply(this, [channelName, name].concat(args));
	      }
	
	      // If the request isn't handled, log it in DEBUG mode and exit
	      if (requests && (requests[name] || requests['default'])) {
	        var handler = requests[name] || requests['default'];
	        args = requests[name] ? args : arguments;
	        return Radio._callHandler(handler.callback, handler.context, args);
	      } else {
	        Radio.debugLog('An unhandled request was fired', name, channelName);
	      }
	    },
	
	    // Set up a handler for a request
	    reply: function reply(name, callback, context) {
	      if (Radio._eventsApi(this, 'reply', name, [callback, context])) {
	        return this;
	      }
	
	      this._requests || (this._requests = {});
	
	      if (this._requests[name]) {
	        Radio.debugLog('A request was overwritten', name, this.channelName);
	      }
	
	      this._requests[name] = {
	        callback: makeCallback(callback),
	        context: context || this
	      };
	
	      return this;
	    },
	
	    // Set up a handler that can only be requested once
	    replyOnce: function replyOnce(name, callback, context) {
	      if (Radio._eventsApi(this, 'replyOnce', name, [callback, context])) {
	        return this;
	      }
	
	      var self = this;
	
	      var once = _.once(function () {
	        self.stopReplying(name);
	        return makeCallback(callback).apply(this, arguments);
	      });
	
	      return this.reply(name, once, context);
	    },
	
	    // Remove handler(s)
	    stopReplying: function stopReplying(name, callback, context) {
	      if (Radio._eventsApi(this, 'stopReplying', name)) {
	        return this;
	      }
	
	      // Remove everything if there are no arguments passed
	      if (!name && !callback && !context) {
	        delete this._requests;
	      } else if (!removeHandlers(this._requests, name, callback, context)) {
	        Radio.debugLog('Attempted to remove the unregistered request', name, this.channelName);
	      }
	
	      return this;
	    }
	  };
	
	  /*
	   * Backbone.Radio.channel
	   * ----------------------
	   * Get a reference to a channel by name.
	   *
	   */
	
	  Radio._channels = {};
	
	  Radio.channel = function (channelName) {
	    if (!channelName) {
	      throw new Error('You must provide a name for the channel.');
	    }
	
	    if (Radio._channels[channelName]) {
	      return Radio._channels[channelName];
	    } else {
	      return Radio._channels[channelName] = new Radio.Channel(channelName);
	    }
	  };
	
	  /*
	   * Backbone.Radio.Channel
	   * ----------------------
	   * A Channel is an object that extends from Backbone.Events,
	   * and Radio.Requests.
	   *
	   */
	
	  Radio.Channel = function (channelName) {
	    this.channelName = channelName;
	  };
	
	  _.extend(Radio.Channel.prototype, Backbone.Events, Radio.Requests, {
	
	    // Remove all handlers from the messaging systems of this channel
	    reset: function reset() {
	      this.off();
	      this.stopListening();
	      this.stopReplying();
	      return this;
	    }
	  });
	
	  /*
	   * Top-level API
	   * -------------
	   * Supplies the 'top-level API' for working with Channels directly
	   * from Backbone.Radio.
	   *
	   */
	
	  var channel;
	  var args;
	  var systems = [Backbone.Events, Radio.Requests];
	  _.each(systems, function (system) {
	    _.each(system, function (method, methodName) {
	      Radio[methodName] = function (channelName) {
	        args = _.toArray(arguments).slice(1);
	        channel = this.channel(channelName);
	        return channel[methodName].apply(channel, args);
	      };
	    });
	  });
	
	  Radio.reset = function (channelName) {
	    var channels = !channelName ? this._channels : [this._channels[channelName]];
	    _.each(channels, function (channel) {
	      channel.reset();
	    });
	  };
	
	  return Radio;
	
	}));
	//# sourceMappingURL=./backbone.radio.js.map

/***/ },
/* 10 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var Backbone = __webpack_require__(4);
	var _ = __webpack_require__(3);
	var application_1 = __webpack_require__(1);
	var home_top_level_view_1 = __webpack_require__(11);
	var services_1 = __webpack_require__(22);
	var worksheet_1 = __webpack_require__(35);
	var worksheet_accession_number_picker_view_1 = __webpack_require__(42);
	var worksheet_top_level_view_1 = __webpack_require__(46);
	var Router = (function (_super) {
	    __extends(Router, _super);
	    function Router() {
	        _super.call(this);
	        this.routes = {
	            "": this.home,
	            "worksheet(/:accessionNumber)": this.worksheet,
	        };
	        this._bindRoutes();
	        _.bindAll(this, "home", "worksheet");
	    }
	    Router.prototype.home = function () {
	        new home_top_level_view_1.HomeTopLevelView({ model: new Backbone.Model() }).render();
	    };
	    Router.prototype.worksheet = function (accessionNumber) {
	        if (!accessionNumber) {
	            application_1.Application.instance.modalRegion.show(new worksheet_accession_number_picker_view_1.WorksheetAccessionNumberPickerView({ availableAccessionNumbers: services_1.Services.instance.worksheetQueryService.getWorksheetAccessionNumbersSync() }));
	            return; // Will re-route with a value set
	        }
	        new worksheet_top_level_view_1.WorksheetTopLevelView({ model: worksheet_1.Worksheet.fetchFromService({ accessionNumber: accessionNumber }) }).render();
	    };
	    return Router;
	}(Backbone.Router));
	exports.Router = Router;


/***/ },
/* 11 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var home_content_view_1 = __webpack_require__(12);
	var top_level_view_1 = __webpack_require__(18);
	var HomeTopLevelView = (function (_super) {
	    __extends(HomeTopLevelView, _super);
	    function HomeTopLevelView() {
	        _super.apply(this, arguments);
	    }
	    HomeTopLevelView.prototype.onRender = function () {
	        _super.prototype.onRender.call(this);
	        this.showChildView("content", new home_content_view_1.HomeContentView());
	    };
	    return HomeTopLevelView;
	}(top_level_view_1.TopLevelView));
	exports.HomeTopLevelView = HomeTopLevelView;


/***/ },
/* 12 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var _ = __webpack_require__(3);
	var Backbone = __webpack_require__(4);
	var Marionette = __webpack_require__(5);
	__webpack_require__(13);
	var HomeContentView = (function (_super) {
	    __extends(HomeContentView, _super);
	    function HomeContentView(options) {
	        _super.call(this, _.extend({
	            model: new Backbone.Model(),
	            template: _.template(__webpack_require__(17))
	        }));
	    }
	    return HomeContentView;
	}(Marionette.ItemView));
	exports.HomeContentView = HomeContentView;


/***/ },
/* 13 */
/***/ function(module, exports) {

	// removed by extract-text-webpack-plugin

/***/ },
/* 14 */,
/* 15 */,
/* 16 */,
/* 17 */
/***/ function(module, exports) {

	module.exports = "<div id=\"home\">\r\n    <h3 class=\"page-header\" style=\"text-align: center\">Welcome to DressDiscover!</h3>\r\n    <h5>Click on the <a href=\"#worksheet\">Worksheet</a> tab to start a new worksheet.</h5>\r\n</div>\r\n"

/***/ },
/* 18 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var _ = __webpack_require__(3);
	var Marionette = __webpack_require__(5);
	var navbar_view_1 = __webpack_require__(19);
	var TopLevelView = (function (_super) {
	    __extends(TopLevelView, _super);
	    function TopLevelView(options) {
	        _super.call(this, _.extend(options, {
	            el: "#app",
	            regions: {
	                content: "#content",
	                navbar: "#navbar"
	            },
	            template: _.template(__webpack_require__(21))
	        }));
	    }
	    TopLevelView.prototype.onRender = function () {
	        this.showChildView("navbar", new navbar_view_1.NavbarView());
	    };
	    return TopLevelView;
	}(Marionette.LayoutView));
	exports.TopLevelView = TopLevelView;


/***/ },
/* 19 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var _ = __webpack_require__(3);
	var Marionette = __webpack_require__(5);
	var NavbarView = (function (_super) {
	    __extends(NavbarView, _super);
	    function NavbarView() {
	        _super.apply(this, arguments);
	        this.template = _.template(__webpack_require__(20));
	    }
	    return NavbarView;
	}(Marionette.ItemView));
	exports.NavbarView = NavbarView;


/***/ },
/* 20 */
/***/ function(module, exports) {

	module.exports = "<nav class=\"navbar navbar-default\">\n    <div class=\"container-fluid\">\n        <!-- Brand and toggle get grouped for better mobile display -->\n        <div class=\"navbar-header\">\n            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar-collapse-1\" aria-expanded=\"false\">\n                <span class=\"sr-only\">Toggle navigation</span>\n                <span class=\"icon-bar\"></span>\n                <span class=\"icon-bar\"></span>\n                <span class=\"icon-bar\"></span>\n            </button>\n            <a class=\"navbar-brand\" href=\"#\">DressDiscover</a>\n        </div>\n        <!-- Collect the nav links, forms, and other content for toggling -->\n        <div class=\"collapse navbar-collapse\" id=\"navbar-collapse-1\">\n            <ul class=\"nav navbar-nav\">\n                <li class=\"active\"><a href=\"#worksheet\">Worksheet <span class=\"sr-only\">(current)</span></a></li>\n            </ul>\n        </div><!-- /.navbar-collapse -->\n    </div><!-- /.container-fluid -->\n</nav>\n"

/***/ },
/* 21 */
/***/ function(module, exports) {

	module.exports = "<div id=\"navbar\"></div>\r\n<div id=\"content\"></div>\r\n"

/***/ },
/* 22 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var local_worksheet_command_service_1 = __webpack_require__(23);
	var local_worksheet_query_service_1 = __webpack_require__(25);
	var Services = (function () {
	    function Services() {
	        this._worksheetCommandService = new local_worksheet_command_service_1.LocalWorksheetCommandService;
	        this._worksheetQueryService = new local_worksheet_query_service_1.LocalWorksheetQueryService;
	    }
	    Object.defineProperty(Services, "instance", {
	        get: function () {
	            return Services._instance;
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(Services.prototype, "worksheetCommandService", {
	        get: function () {
	            return this._worksheetCommandService;
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(Services.prototype, "worksheetQueryService", {
	        get: function () {
	            return this._worksheetQueryService;
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Services._instance = new Services();
	    return Services;
	}());
	exports.Services = Services;


/***/ },
/* 23 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var async_to_sync_worksheet_command_service_1 = __webpack_require__(24);
	var local_worksheet_query_service_1 = __webpack_require__(25);
	var LocalWorksheetCommandService = (function (_super) {
	    __extends(LocalWorksheetCommandService, _super);
	    function LocalWorksheetCommandService() {
	        _super.apply(this, arguments);
	    }
	    LocalWorksheetCommandService.prototype.putWorksheetStateSync = function (kwds) {
	        var jsonString = JSON.stringify(kwds.state.toThryftJSON());
	        console.info("state to service: " + jsonString);
	        localStorage.setItem(local_worksheet_query_service_1.LocalWorksheetQueryService.getWorksheetStateItemKey(kwds.state.accessionNumber), jsonString);
	    };
	    return LocalWorksheetCommandService;
	}(async_to_sync_worksheet_command_service_1.AsyncToSyncWorksheetCommandService));
	exports.LocalWorksheetCommandService = LocalWorksheetCommandService;


/***/ },
/* 24 */
/***/ function(module, exports) {

	"use strict";
	var AsyncToSyncWorksheetCommandService = (function () {
	    function AsyncToSyncWorksheetCommandService() {
	    }
	    AsyncToSyncWorksheetCommandService.prototype.putWorksheetStateAsync = function (kwds) {
	        try {
	            this.putWorksheetStateSync({ state: kwds.state });
	            kwds.success();
	        }
	        catch (e) {
	            kwds.error(null, e.message, e);
	        }
	    };
	    return AsyncToSyncWorksheetCommandService;
	}());
	exports.AsyncToSyncWorksheetCommandService = AsyncToSyncWorksheetCommandService;


/***/ },
/* 25 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var async_to_sync_worksheet_query_service_1 = __webpack_require__(26);
	var worksheet_definition_1 = __webpack_require__(27);
	var worksheet_state_1 = __webpack_require__(32);
	var LocalWorksheetQueryService = (function (_super) {
	    __extends(LocalWorksheetQueryService, _super);
	    function LocalWorksheetQueryService() {
	        _super.call(this);
	        this._worksheetDefinition = worksheet_definition_1.WorksheetDefinition.fromThryftJSON(WORKSHEET_DEFINITION);
	    }
	    LocalWorksheetQueryService.prototype.getWorksheetAccessionNumbersSync = function () {
	        var result = [];
	        for (var keyI = 0;; keyI++) {
	            var key = localStorage.key(keyI);
	            if (key == null) {
	                break;
	            }
	            if (!key.match("^" + LocalWorksheetQueryService._WORKSHEET_ITEM_KEY_PREFIX)) {
	                continue;
	            }
	            else if (key.length == LocalWorksheetQueryService._WORKSHEET_ITEM_KEY_PREFIX.length) {
	                continue;
	            }
	            result.push(key.substr(LocalWorksheetQueryService._WORKSHEET_ITEM_KEY_PREFIX.length));
	        }
	        return result;
	    };
	    LocalWorksheetQueryService.prototype.getWorksheetDefinitionSync = function () {
	        return this._worksheetDefinition;
	    };
	    LocalWorksheetQueryService.getWorksheetStateItemKey = function (accessionNumber) {
	        return LocalWorksheetQueryService._WORKSHEET_ITEM_KEY_PREFIX + accessionNumber;
	    };
	    LocalWorksheetQueryService.prototype.getWorksheetStateSync = function (kwds) {
	        var jsonString = localStorage.getItem(LocalWorksheetQueryService.getWorksheetStateItemKey(kwds.accessionNumber));
	        console.info("state from service: " + jsonString);
	        if (jsonString == null) {
	            return new worksheet_state_1.WorksheetState();
	        }
	        return worksheet_state_1.WorksheetState.fromThryftJSON(JSON.parse(jsonString));
	    };
	    LocalWorksheetQueryService._WORKSHEET_ITEM_KEY_PREFIX = "worksheet/state/";
	    return LocalWorksheetQueryService;
	}(async_to_sync_worksheet_query_service_1.AsyncToSyncWorksheetQueryService));
	exports.LocalWorksheetQueryService = LocalWorksheetQueryService;


/***/ },
/* 26 */
/***/ function(module, exports) {

	"use strict";
	var AsyncToSyncWorksheetQueryService = (function () {
	    function AsyncToSyncWorksheetQueryService() {
	    }
	    AsyncToSyncWorksheetQueryService.prototype.getWorksheetAccessionNumbersAsync = function (kwds) {
	        try {
	            kwds.success(this.getWorksheetAccessionNumbersSync());
	        }
	        catch (e) {
	            kwds.error(null, e.message, e);
	        }
	    };
	    AsyncToSyncWorksheetQueryService.prototype.getWorksheetDefinitionAsync = function (kwds) {
	        try {
	            kwds.success(this.getWorksheetDefinitionSync());
	        }
	        catch (e) {
	            kwds.error(null, e.message, e);
	        }
	    };
	    AsyncToSyncWorksheetQueryService.prototype.getWorksheetStateAsync = function (kwds) {
	        try {
	            kwds.success(this.getWorksheetStateSync({ accessionNumber: kwds.accessionNumber }));
	        }
	        catch (e) {
	            kwds.error(null, e.message, e);
	        }
	    };
	    return AsyncToSyncWorksheetQueryService;
	}());
	exports.AsyncToSyncWorksheetQueryService = AsyncToSyncWorksheetQueryService;


/***/ },
/* 27 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var Backbone = __webpack_require__(4);
	var worksheet_feature_set_definition_1 = __webpack_require__(28);
	var WorksheetDefinition = (function (_super) {
	    __extends(WorksheetDefinition, _super);
	    function WorksheetDefinition(attributes, options) {
	        _super.call(this, attributes, options);
	        this.validation = {
	            rootFeatureSet: {
	                "fn": function (value, attr, computedState) {
	                    if (!(value instanceof worksheet_feature_set_definition_1.WorksheetFeatureSetDefinition)) {
	                        return "expected WorksheetDefinition.root_feature_set to be a WorksheetFeatureSetDefinition";
	                    }
	                    if (!value.isValid(true)) {
	                        return value.validationError;
	                    }
	                    return undefined;
	                },
	                "required": true
	            }
	        };
	    }
	    Object.defineProperty(WorksheetDefinition.prototype, "rootFeatureSet", {
	        get: function () {
	            return this.get('rootFeatureSet');
	        },
	        set: function (value) {
	            this.set('rootFeatureSet', value, { validate: true });
	        },
	        enumerable: true,
	        configurable: true
	    });
	    WorksheetDefinition.fromThryftJSON = function (json) {
	        var out = new WorksheetDefinition;
	        for (var fieldName in json) {
	            if (fieldName == "root_feature_set") {
	                out.attributes.rootFeatureSet = worksheet_feature_set_definition_1.WorksheetFeatureSetDefinition.fromThryftJSON(json[fieldName]);
	            }
	        }
	        if (!out.isValid(true)) {
	            throw new Error(out.validationError);
	        }
	        return out;
	    };
	    WorksheetDefinition.prototype.toThryftJSON = function () {
	        var json = {};
	        json["root_feature_set"] = this.rootFeatureSet.toThryftJSON();
	        return json;
	    };
	    return WorksheetDefinition;
	}(Backbone.Model));
	exports.WorksheetDefinition = WorksheetDefinition;


/***/ },
/* 28 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var Backbone = __webpack_require__(4);
	var worksheet_feature_definition_1 = __webpack_require__(29);
	var WorksheetFeatureSetDefinition = (function (_super) {
	    __extends(WorksheetFeatureSetDefinition, _super);
	    function WorksheetFeatureSetDefinition(attributes, options) {
	        _super.call(this, attributes, options);
	        this.validation = {
	            id: {
	                "fn": function (value, attr, computedState) {
	                    if (typeof value !== "string") {
	                        return "expected WorksheetFeatureSetDefinition.id to be a string";
	                    }
	                    return undefined;
	                },
	                "required": true
	            },
	            childFeatureSets: {
	                "fn": function (value, attr, computedState) {
	                    if (typeof attr === "undefined" || attr === null) {
	                        return undefined;
	                    }
	                    if (!(value instanceof Backbone.Collection)) {
	                        return "expected WorksheetFeatureSetDefinition.child_feature_sets to be a Backbone.Collection";
	                    }
	                    if (value.model !== WorksheetFeatureSetDefinition) {
	                        return "expected WorksheetFeatureSetDefinition.child_feature_sets to be a Backbone.Collection with model=WorksheetFeatureSetDefinition";
	                    }
	                    for (var _i = 0, _a = value.models; _i < _a.length; _i++) {
	                        var __model0 = _a[_i];
	                        if (!__model0.isValid(true)) {
	                            return __model0.validationError;
	                        }
	                    }
	                    return undefined;
	                },
	                "minLength": 1, "required": false
	            },
	            displayName: {
	                "fn": function (value, attr, computedState) {
	                    if (typeof attr === "undefined" || attr === null) {
	                        return undefined;
	                    }
	                    if (typeof value !== "string") {
	                        return "expected WorksheetFeatureSetDefinition.display_name to be a string";
	                    }
	                    if (/^\s*$/.test(value)) {
	                        return "WorksheetFeatureSetDefinition.display_name is blank";
	                    }
	                    return undefined;
	                },
	                "minLength": 1, "required": false
	            },
	            features: {
	                "fn": function (value, attr, computedState) {
	                    if (typeof attr === "undefined" || attr === null) {
	                        return undefined;
	                    }
	                    if (!(value instanceof Backbone.Collection)) {
	                        return "expected WorksheetFeatureSetDefinition.features to be a Backbone.Collection";
	                    }
	                    if (value.model !== worksheet_feature_definition_1.WorksheetFeatureDefinition) {
	                        return "expected WorksheetFeatureSetDefinition.features to be a Backbone.Collection with model=WorksheetFeatureDefinition";
	                    }
	                    for (var _i = 0, _a = value.models; _i < _a.length; _i++) {
	                        var __model0 = _a[_i];
	                        if (!__model0.isValid(true)) {
	                            return __model0.validationError;
	                        }
	                    }
	                    return undefined;
	                },
	                "minLength": 1, "required": false
	            }
	        };
	    }
	    Object.defineProperty(WorksheetFeatureSetDefinition.prototype, "id", {
	        get: function () {
	            return this.get('id');
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(WorksheetFeatureSetDefinition.prototype, "childFeatureSets", {
	        get: function () {
	            return this.get('childFeatureSets');
	        },
	        set: function (value) {
	            this.set('childFeatureSets', value, { validate: true });
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(WorksheetFeatureSetDefinition.prototype, "displayName", {
	        get: function () {
	            return this.get('displayName');
	        },
	        set: function (value) {
	            this.set('displayName', value, { validate: true });
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(WorksheetFeatureSetDefinition.prototype, "features", {
	        get: function () {
	            return this.get('features');
	        },
	        set: function (value) {
	            this.set('features', value, { validate: true });
	        },
	        enumerable: true,
	        configurable: true
	    });
	    WorksheetFeatureSetDefinition.fromThryftJSON = function (json) {
	        var out = new WorksheetFeatureSetDefinition;
	        for (var fieldName in json) {
	            if (fieldName == "id") {
	                out.attributes.id = json[fieldName];
	            }
	            else if (fieldName == "child_feature_sets") {
	                out.attributes.childFeatureSets = function (json) { var sequence = []; for (var i = 0; i < json.length; i++) {
	                    sequence.push(WorksheetFeatureSetDefinition.fromThryftJSON(json[i]));
	                } return new Backbone.Collection(sequence); }(json[fieldName]);
	            }
	            else if (fieldName == "display_name") {
	                out.attributes.displayName = json[fieldName];
	            }
	            else if (fieldName == "features") {
	                out.attributes.features = function (json) { var sequence = []; for (var i = 0; i < json.length; i++) {
	                    sequence.push(worksheet_feature_definition_1.WorksheetFeatureDefinition.fromThryftJSON(json[i]));
	                } return new Backbone.Collection(sequence); }(json[fieldName]);
	            }
	        }
	        if (!out.isValid(true)) {
	            throw new Error(out.validationError);
	        }
	        return out;
	    };
	    WorksheetFeatureSetDefinition.prototype.toThryftJSON = function () {
	        var json = {};
	        json["id"] = this.id;
	        if (this.has("childFeatureSets")) {
	            json["child_feature_sets"] = function (__inArray) { var __outArray = []; for (var __i = 0; __i < __inArray.length; __i++) {
	                __outArray.push(__inArray[__i].toThryftJSON());
	            } return __outArray; }(this.childFeatureSets.models);
	        }
	        if (this.has("displayName")) {
	            json["display_name"] = this.displayName;
	        }
	        if (this.has("features")) {
	            json["features"] = function (__inArray) { var __outArray = []; for (var __i = 0; __i < __inArray.length; __i++) {
	                __outArray.push(__inArray[__i].toThryftJSON());
	            } return __outArray; }(this.features.models);
	        }
	        return json;
	    };
	    return WorksheetFeatureSetDefinition;
	}(Backbone.Model));
	exports.WorksheetFeatureSetDefinition = WorksheetFeatureSetDefinition;


/***/ },
/* 29 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var Backbone = __webpack_require__(4);
	var worksheet_feature_value_definition_1 = __webpack_require__(30);
	var WorksheetFeatureDefinition = (function (_super) {
	    __extends(WorksheetFeatureDefinition, _super);
	    function WorksheetFeatureDefinition(attributes, options) {
	        _super.call(this, attributes, options);
	        this.validation = {
	            id: {
	                "fn": function (value, attr, computedState) {
	                    if (typeof value !== "string") {
	                        return "expected WorksheetFeatureDefinition.id to be a string";
	                    }
	                    return undefined;
	                },
	                "required": true
	            },
	            displayName: {
	                "fn": function (value, attr, computedState) {
	                    if (typeof attr === "undefined" || attr === null) {
	                        return undefined;
	                    }
	                    if (typeof value !== "string") {
	                        return "expected WorksheetFeatureDefinition.display_name to be a string";
	                    }
	                    if (/^\s*$/.test(value)) {
	                        return "WorksheetFeatureDefinition.display_name is blank";
	                    }
	                    return undefined;
	                },
	                "minLength": 1, "required": false
	            },
	            values_: {
	                "fn": function (value, attr, computedState) {
	                    if (typeof attr === "undefined" || attr === null) {
	                        return undefined;
	                    }
	                    if (!(value instanceof Backbone.Collection)) {
	                        return "expected WorksheetFeatureDefinition.values_ to be a Backbone.Collection";
	                    }
	                    if (value.model !== worksheet_feature_value_definition_1.WorksheetFeatureValueDefinition) {
	                        return "expected WorksheetFeatureDefinition.values_ to be a Backbone.Collection with model=WorksheetFeatureValueDefinition";
	                    }
	                    for (var _i = 0, _a = value.models; _i < _a.length; _i++) {
	                        var __model0 = _a[_i];
	                        if (!__model0.isValid(true)) {
	                            return __model0.validationError;
	                        }
	                    }
	                    return undefined;
	                },
	                "minLength": 1, "required": false
	            }
	        };
	    }
	    Object.defineProperty(WorksheetFeatureDefinition.prototype, "id", {
	        get: function () {
	            return this.get('id');
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(WorksheetFeatureDefinition.prototype, "displayName", {
	        get: function () {
	            return this.get('displayName');
	        },
	        set: function (value) {
	            this.set('displayName', value, { validate: true });
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(WorksheetFeatureDefinition.prototype, "values_", {
	        get: function () {
	            return this.get('values_');
	        },
	        set: function (value) {
	            this.set('values_', value, { validate: true });
	        },
	        enumerable: true,
	        configurable: true
	    });
	    WorksheetFeatureDefinition.fromThryftJSON = function (json) {
	        var out = new WorksheetFeatureDefinition;
	        for (var fieldName in json) {
	            if (fieldName == "id") {
	                out.attributes.id = json[fieldName];
	            }
	            else if (fieldName == "display_name") {
	                out.attributes.displayName = json[fieldName];
	            }
	            else if (fieldName == "values_") {
	                out.attributes.values_ = function (json) { var sequence = []; for (var i = 0; i < json.length; i++) {
	                    sequence.push(worksheet_feature_value_definition_1.WorksheetFeatureValueDefinition.fromThryftJSON(json[i]));
	                } return new Backbone.Collection(sequence); }(json[fieldName]);
	            }
	        }
	        if (!out.isValid(true)) {
	            throw new Error(out.validationError);
	        }
	        return out;
	    };
	    WorksheetFeatureDefinition.prototype.toThryftJSON = function () {
	        var json = {};
	        json["id"] = this.id;
	        if (this.has("displayName")) {
	            json["display_name"] = this.displayName;
	        }
	        if (this.has("values_")) {
	            json["values_"] = function (__inArray) { var __outArray = []; for (var __i = 0; __i < __inArray.length; __i++) {
	                __outArray.push(__inArray[__i].toThryftJSON());
	            } return __outArray; }(this.values_.models);
	        }
	        return json;
	    };
	    return WorksheetFeatureDefinition;
	}(Backbone.Model));
	exports.WorksheetFeatureDefinition = WorksheetFeatureDefinition;


/***/ },
/* 30 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var Backbone = __webpack_require__(4);
	var worksheet_feature_value_image_1 = __webpack_require__(31);
	var WorksheetFeatureValueDefinition = (function (_super) {
	    __extends(WorksheetFeatureValueDefinition, _super);
	    function WorksheetFeatureValueDefinition(attributes, options) {
	        _super.call(this, attributes, options);
	        this.validation = {
	            id: {
	                "fn": function (value, attr, computedState) {
	                    if (typeof value !== "string") {
	                        return "expected WorksheetFeatureValueDefinition.id to be a string";
	                    }
	                    return undefined;
	                },
	                "required": true
	            },
	            displayName: {
	                "fn": function (value, attr, computedState) {
	                    if (typeof attr === "undefined" || attr === null) {
	                        return undefined;
	                    }
	                    if (typeof value !== "string") {
	                        return "expected WorksheetFeatureValueDefinition.display_name to be a string";
	                    }
	                    if (/^\s*$/.test(value)) {
	                        return "WorksheetFeatureValueDefinition.display_name is blank";
	                    }
	                    return undefined;
	                },
	                "minLength": 1, "required": false
	            },
	            image: {
	                "fn": function (value, attr, computedState) {
	                    if (typeof attr === "undefined" || attr === null) {
	                        return undefined;
	                    }
	                    if (!(value instanceof worksheet_feature_value_image_1.WorksheetFeatureValueImage)) {
	                        return "expected WorksheetFeatureValueDefinition.image to be a WorksheetFeatureValueImage";
	                    }
	                    if (!value.isValid(true)) {
	                        return value.validationError;
	                    }
	                    return undefined;
	                },
	                "required": false
	            }
	        };
	    }
	    Object.defineProperty(WorksheetFeatureValueDefinition.prototype, "id", {
	        get: function () {
	            return this.get('id');
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(WorksheetFeatureValueDefinition.prototype, "displayName", {
	        get: function () {
	            return this.get('displayName');
	        },
	        set: function (value) {
	            this.set('displayName', value, { validate: true });
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(WorksheetFeatureValueDefinition.prototype, "image", {
	        get: function () {
	            return this.get('image');
	        },
	        set: function (value) {
	            this.set('image', value, { validate: true });
	        },
	        enumerable: true,
	        configurable: true
	    });
	    WorksheetFeatureValueDefinition.fromThryftJSON = function (json) {
	        var out = new WorksheetFeatureValueDefinition;
	        for (var fieldName in json) {
	            if (fieldName == "id") {
	                out.attributes.id = json[fieldName];
	            }
	            else if (fieldName == "display_name") {
	                out.attributes.displayName = json[fieldName];
	            }
	            else if (fieldName == "image") {
	                out.attributes.image = worksheet_feature_value_image_1.WorksheetFeatureValueImage.fromThryftJSON(json[fieldName]);
	            }
	        }
	        if (!out.isValid(true)) {
	            throw new Error(out.validationError);
	        }
	        return out;
	    };
	    WorksheetFeatureValueDefinition.prototype.toThryftJSON = function () {
	        var json = {};
	        json["id"] = this.id;
	        if (this.has("displayName")) {
	            json["display_name"] = this.displayName;
	        }
	        if (this.has("image")) {
	            json["image"] = this.image.toThryftJSON();
	        }
	        return json;
	    };
	    return WorksheetFeatureValueDefinition;
	}(Backbone.Model));
	exports.WorksheetFeatureValueDefinition = WorksheetFeatureValueDefinition;


/***/ },
/* 31 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var Backbone = __webpack_require__(4);
	var WorksheetFeatureValueImage = (function (_super) {
	    __extends(WorksheetFeatureValueImage, _super);
	    function WorksheetFeatureValueImage(attributes, options) {
	        _super.call(this, attributes, options);
	        this.validation = {
	            rights: {
	                "fn": function (value, attr, computedState) {
	                    if (typeof value !== "string") {
	                        return "expected WorksheetFeatureValueImage.rights to be a string";
	                    }
	                    if (/^\s*$/.test(value)) {
	                        return "WorksheetFeatureValueImage.rights is blank";
	                    }
	                    return undefined;
	                },
	                "minLength": 1, "required": true
	            },
	            thumbnailUrl: {
	                "fn": function (value, attr, computedState) {
	                    if (typeof value !== "string") {
	                        return "expected WorksheetFeatureValueImage.thumbnail_url to be a string";
	                    }
	                    if (/^\s*$/.test(value)) {
	                        return "WorksheetFeatureValueImage.thumbnail_url is blank";
	                    }
	                    return undefined;
	                },
	                "minLength": 1, "required": true
	            },
	            fullSizeUrl: {
	                "fn": function (value, attr, computedState) {
	                    if (typeof attr === "undefined" || attr === null) {
	                        return undefined;
	                    }
	                    if (typeof value !== "string") {
	                        return "expected WorksheetFeatureValueImage.full_size_url to be a string";
	                    }
	                    if (/^\s*$/.test(value)) {
	                        return "WorksheetFeatureValueImage.full_size_url is blank";
	                    }
	                    return undefined;
	                },
	                "minLength": 1, "required": false
	            }
	        };
	    }
	    Object.defineProperty(WorksheetFeatureValueImage.prototype, "rights", {
	        get: function () {
	            return this.get('rights');
	        },
	        set: function (value) {
	            this.set('rights', value, { validate: true });
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(WorksheetFeatureValueImage.prototype, "thumbnailUrl", {
	        get: function () {
	            return this.get('thumbnailUrl');
	        },
	        set: function (value) {
	            this.set('thumbnailUrl', value, { validate: true });
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(WorksheetFeatureValueImage.prototype, "fullSizeUrl", {
	        get: function () {
	            return this.get('fullSizeUrl');
	        },
	        set: function (value) {
	            this.set('fullSizeUrl', value, { validate: true });
	        },
	        enumerable: true,
	        configurable: true
	    });
	    WorksheetFeatureValueImage.fromThryftJSON = function (json) {
	        var out = new WorksheetFeatureValueImage;
	        for (var fieldName in json) {
	            if (fieldName == "rights") {
	                out.attributes.rights = json[fieldName];
	            }
	            else if (fieldName == "thumbnail_url") {
	                out.attributes.thumbnailUrl = json[fieldName];
	            }
	            else if (fieldName == "full_size_url") {
	                out.attributes.fullSizeUrl = json[fieldName];
	            }
	        }
	        if (!out.isValid(true)) {
	            throw new Error(out.validationError);
	        }
	        return out;
	    };
	    WorksheetFeatureValueImage.prototype.toThryftJSON = function () {
	        var json = {};
	        json["rights"] = this.rights;
	        json["thumbnail_url"] = this.thumbnailUrl;
	        if (this.has("fullSizeUrl")) {
	            json["full_size_url"] = this.fullSizeUrl;
	        }
	        return json;
	    };
	    return WorksheetFeatureValueImage;
	}(Backbone.Model));
	exports.WorksheetFeatureValueImage = WorksheetFeatureValueImage;


/***/ },
/* 32 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var Backbone = __webpack_require__(4);
	var worksheet_feature_set_state_1 = __webpack_require__(33);
	var WorksheetState = (function (_super) {
	    __extends(WorksheetState, _super);
	    function WorksheetState(attributes, options) {
	        _super.call(this, attributes, options);
	        this.validation = {
	            accessionNumber: {
	                "fn": function (value, attr, computedState) {
	                    if (typeof value !== "string") {
	                        return "expected WorksheetState.accession_number to be a string";
	                    }
	                    return undefined;
	                },
	                "required": true
	            },
	            rootFeatureSet: {
	                "fn": function (value, attr, computedState) {
	                    if (typeof attr === "undefined" || attr === null) {
	                        return undefined;
	                    }
	                    if (!(value instanceof worksheet_feature_set_state_1.WorksheetFeatureSetState)) {
	                        return "expected WorksheetState.root_feature_set to be a WorksheetFeatureSetState";
	                    }
	                    if (!value.isValid(true)) {
	                        return value.validationError;
	                    }
	                    return undefined;
	                },
	                "required": false
	            }
	        };
	    }
	    Object.defineProperty(WorksheetState.prototype, "accessionNumber", {
	        get: function () {
	            return this.get('accessionNumber');
	        },
	        set: function (value) {
	            this.set('accessionNumber', value, { validate: true });
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(WorksheetState.prototype, "rootFeatureSet", {
	        get: function () {
	            return this.get('rootFeatureSet');
	        },
	        set: function (value) {
	            this.set('rootFeatureSet', value, { validate: true });
	        },
	        enumerable: true,
	        configurable: true
	    });
	    WorksheetState.fromThryftJSON = function (json) {
	        var out = new WorksheetState;
	        for (var fieldName in json) {
	            if (fieldName == "accession_number") {
	                out.attributes.accessionNumber = json[fieldName];
	            }
	            else if (fieldName == "root_feature_set") {
	                out.attributes.rootFeatureSet = worksheet_feature_set_state_1.WorksheetFeatureSetState.fromThryftJSON(json[fieldName]);
	            }
	        }
	        if (!out.isValid(true)) {
	            throw new Error(out.validationError);
	        }
	        return out;
	    };
	    WorksheetState.prototype.toThryftJSON = function () {
	        var json = {};
	        json["accession_number"] = this.accessionNumber;
	        if (this.has("rootFeatureSet")) {
	            json["root_feature_set"] = this.rootFeatureSet.toThryftJSON();
	        }
	        return json;
	    };
	    return WorksheetState;
	}(Backbone.Model));
	exports.WorksheetState = WorksheetState;


/***/ },
/* 33 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var Backbone = __webpack_require__(4);
	var worksheet_feature_state_1 = __webpack_require__(34);
	var WorksheetFeatureSetState = (function (_super) {
	    __extends(WorksheetFeatureSetState, _super);
	    function WorksheetFeatureSetState(attributes, options) {
	        _super.call(this, attributes, options);
	        this.validation = {
	            childFeatureSets: {
	                "fn": function (value, attr, computedState) {
	                    if (typeof attr === "undefined" || attr === null) {
	                        return undefined;
	                    }
	                    if (typeof value !== "object") {
	                        return "expected WorksheetFeatureSetState.child_feature_sets to be an object";
	                    }
	                    for (var __key in value) {
	                        var __value = value[__key];
	                        if (typeof __key !== "string") {
	                            return "expected WorksheetFeatureSetState.child_feature_sets key to be a string";
	                        }
	                        if (!(__value instanceof WorksheetFeatureSetState)) {
	                            return "expected WorksheetFeatureSetState.child_feature_sets value to be a WorksheetFeatureSetState";
	                        }
	                        if (!__value.isValid(true)) {
	                            return __value.validationError;
	                        }
	                    }
	                    return undefined;
	                },
	                "minLength": 1, "required": false
	            },
	            features: {
	                "fn": function (value, attr, computedState) {
	                    if (typeof attr === "undefined" || attr === null) {
	                        return undefined;
	                    }
	                    if (typeof value !== "object") {
	                        return "expected WorksheetFeatureSetState.features to be an object";
	                    }
	                    for (var __key in value) {
	                        var __value = value[__key];
	                        if (typeof __key !== "string") {
	                            return "expected WorksheetFeatureSetState.features key to be a string";
	                        }
	                        if (!(__value instanceof worksheet_feature_state_1.WorksheetFeatureState)) {
	                            return "expected WorksheetFeatureSetState.features value to be a WorksheetFeatureState";
	                        }
	                        if (!__value.isValid(true)) {
	                            return __value.validationError;
	                        }
	                    }
	                    return undefined;
	                },
	                "minLength": 1, "required": false
	            }
	        };
	    }
	    Object.defineProperty(WorksheetFeatureSetState.prototype, "childFeatureSets", {
	        get: function () {
	            return this.get('childFeatureSets');
	        },
	        set: function (value) {
	            this.set('childFeatureSets', value, { validate: true });
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(WorksheetFeatureSetState.prototype, "features", {
	        get: function () {
	            return this.get('features');
	        },
	        set: function (value) {
	            this.set('features', value, { validate: true });
	        },
	        enumerable: true,
	        configurable: true
	    });
	    WorksheetFeatureSetState.fromThryftJSON = function (json) {
	        var out = new WorksheetFeatureSetState;
	        for (var fieldName in json) {
	            if (fieldName == "child_feature_sets") {
	                out.attributes.childFeatureSets = function (json) { var map = {}; for (var key in json) {
	                    map[key] = WorksheetFeatureSetState.fromThryftJSON(json[key]);
	                } return map; }(json[fieldName]);
	            }
	            else if (fieldName == "features") {
	                out.attributes.features = function (json) { var map = {}; for (var key in json) {
	                    map[key] = worksheet_feature_state_1.WorksheetFeatureState.fromThryftJSON(json[key]);
	                } return map; }(json[fieldName]);
	            }
	        }
	        if (!out.isValid(true)) {
	            throw new Error(out.validationError);
	        }
	        return out;
	    };
	    WorksheetFeatureSetState.prototype.toThryftJSON = function () {
	        var json = {};
	        if (this.has("childFeatureSets")) {
	            json["child_feature_sets"] = function (value) { var outObject = {}; for (var key in value) {
	                outObject[key] = value[key].toThryftJSON();
	            } return outObject; }(this.childFeatureSets);
	        }
	        if (this.has("features")) {
	            json["features"] = function (value) { var outObject = {}; for (var key in value) {
	                outObject[key] = value[key].toThryftJSON();
	            } return outObject; }(this.features);
	        }
	        return json;
	    };
	    return WorksheetFeatureSetState;
	}(Backbone.Model));
	exports.WorksheetFeatureSetState = WorksheetFeatureSetState;


/***/ },
/* 34 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var Backbone = __webpack_require__(4);
	var WorksheetFeatureState = (function (_super) {
	    __extends(WorksheetFeatureState, _super);
	    function WorksheetFeatureState(attributes, options) {
	        _super.call(this, attributes, options);
	        this.validation = {
	            selectedValues: {
	                "fn": function (value, attr, computedState) {
	                    if (typeof attr === "undefined" || attr === null) {
	                        return undefined;
	                    }
	                    if (!Array.isArray(value)) {
	                        return "expected WorksheetFeatureState.selected_values to be an Array";
	                    }
	                    for (var __i0 = 0; __i0 < value.length; __i0++) {
	                        if (typeof value[__i0] !== "string") {
	                            return "expected WorksheetFeatureState.selected_values[i] to be a string";
	                        }
	                    }
	                    return undefined;
	                },
	                "minLength": 1, "required": false
	            },
	            text: {
	                "fn": function (value, attr, computedState) {
	                    if (typeof attr === "undefined" || attr === null) {
	                        return undefined;
	                    }
	                    if (typeof value !== "string") {
	                        return "expected WorksheetFeatureState.text to be a string";
	                    }
	                    if (/^\s*$/.test(value)) {
	                        return "WorksheetFeatureState.text is blank";
	                    }
	                    return undefined;
	                },
	                "minLength": 1, "required": false
	            }
	        };
	    }
	    Object.defineProperty(WorksheetFeatureState.prototype, "selectedValues", {
	        get: function () {
	            return this.get('selectedValues');
	        },
	        set: function (value) {
	            this.set('selectedValues', value, { validate: true });
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(WorksheetFeatureState.prototype, "text", {
	        get: function () {
	            return this.get('text');
	        },
	        set: function (value) {
	            this.set('text', value, { validate: true });
	        },
	        enumerable: true,
	        configurable: true
	    });
	    WorksheetFeatureState.fromThryftJSON = function (json) {
	        var out = new WorksheetFeatureState;
	        for (var fieldName in json) {
	            if (fieldName == "selected_values") {
	                out.attributes.selectedValues = function (json) { var sequence = []; for (var i = 0; i < json.length; i++) {
	                    sequence.push(json[i]);
	                } return sequence; }(json[fieldName]);
	            }
	            else if (fieldName == "text") {
	                out.attributes.text = json[fieldName];
	            }
	        }
	        if (!out.isValid(true)) {
	            throw new Error(out.validationError);
	        }
	        return out;
	    };
	    WorksheetFeatureState.prototype.toThryftJSON = function () {
	        var json = {};
	        if (this.has("selectedValues")) {
	            json["selected_values"] = function (__inArray) { var __outArray = []; for (var __i = 0; __i < __inArray.length; __i++) {
	                __outArray.push(__inArray[__i]);
	            } return __outArray; }(this.selectedValues);
	        }
	        if (this.has("text")) {
	            json["text"] = this.text;
	        }
	        return json;
	    };
	    return WorksheetFeatureState;
	}(Backbone.Model));
	exports.WorksheetFeatureState = WorksheetFeatureState;


/***/ },
/* 35 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var Backbone = __webpack_require__(4);
	var services_1 = __webpack_require__(22);
	var worksheet_feature_set_1 = __webpack_require__(36);
	var worksheet_state_1 = __webpack_require__(32);
	var Worksheet = (function (_super) {
	    __extends(Worksheet, _super);
	    function Worksheet(kwds) {
	        _super.call(this);
	        this._allFeatures = [];
	        this._accessionNumber = kwds.accessionNumber;
	        this._rootFeatureSet = new worksheet_feature_set_1.WorksheetFeatureSet({
	            allFeatures: this._allFeatures,
	            definition: kwds.definition.rootFeatureSet,
	            parentFeatureSet: undefined,
	            parentsChildNumber: undefined,
	            state: kwds.state.rootFeatureSet
	        });
	        {
	            var selectedFeature = this.__getSelectedFeature(this.rootFeatureSet);
	            if (selectedFeature) {
	                this._selectedFeature = selectedFeature;
	            }
	            else {
	                selectedFeature = this.__getFirstFeature(this.rootFeatureSet);
	                if (selectedFeature) {
	                    this._selectedFeature = selectedFeature;
	                    selectedFeature.selected = true;
	                }
	            }
	            if (!this._selectedFeature) {
	                throw new Error("should never happen");
	            }
	        }
	    }
	    Object.defineProperty(Worksheet.prototype, "accessionNumber", {
	        get: function () {
	            return this._accessionNumber;
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Worksheet.fetchFromService = function (kwds) {
	        var definition = services_1.Services.instance.worksheetQueryService.getWorksheetDefinitionSync();
	        var state = services_1.Services.instance.worksheetQueryService.getWorksheetStateSync({ accessionNumber: kwds.accessionNumber });
	        return new Worksheet({ accessionNumber: kwds.accessionNumber, definition: definition, state: state });
	    };
	    Object.defineProperty(Worksheet.prototype, "currentState", {
	        get: function () {
	            var rootFeatureSetState = this.rootFeatureSet.currentState;
	            if (rootFeatureSetState) {
	                return new worksheet_state_1.WorksheetState({ accessionNumber: this.accessionNumber, rootFeatureSet: rootFeatureSetState });
	            }
	            else {
	                return undefined;
	            }
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Worksheet.prototype.putToService = function () {
	        var currentState = this.currentState;
	        if (currentState) {
	            services_1.Services.instance.worksheetCommandService.putWorksheetStateSync({ state: currentState });
	        }
	    };
	    Object.defineProperty(Worksheet.prototype, "rootFeatureSet", {
	        get: function () {
	            return this._rootFeatureSet;
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(Worksheet.prototype, "selectedFeature", {
	        get: function () {
	            return this._selectedFeature;
	        },
	        set: function (value) {
	            this._selectedFeature = value;
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Worksheet.prototype.__getSelectedFeature = function (featureSet) {
	        if (featureSet.features) {
	            for (var _i = 0, _a = featureSet.features.models; _i < _a.length; _i++) {
	                var feature = _a[_i];
	                if (feature.selected) {
	                    return feature;
	                }
	            }
	        }
	        if (featureSet.childFeatureSets) {
	            for (var _b = 0, _c = featureSet.childFeatureSets.models; _b < _c.length; _b++) {
	                var childFeatureSet = _c[_b];
	                var selectedFeature = this.__getSelectedFeature(childFeatureSet);
	                if (selectedFeature) {
	                    return selectedFeature;
	                }
	            }
	        }
	        return undefined;
	    };
	    Worksheet.prototype.__getFirstFeature = function (featureSet) {
	        if (featureSet.features && featureSet.features.length > 0) {
	            return featureSet.features.at(0);
	        }
	        if (featureSet.childFeatureSets) {
	            for (var _i = 0, _a = featureSet.childFeatureSets.models; _i < _a.length; _i++) {
	                var childFeatureSet = _a[_i];
	                var firstFeature = this.__getFirstFeature(childFeatureSet);
	                if (firstFeature) {
	                    return firstFeature;
	                }
	            }
	        }
	        return undefined;
	    };
	    return Worksheet;
	}(Backbone.Model));
	exports.Worksheet = Worksheet;


/***/ },
/* 36 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var _ = __webpack_require__(3);
	var Backbone = __webpack_require__(4);
	var worksheet_feature_set_state_1 = __webpack_require__(33);
	var worksheet_feature_1 = __webpack_require__(37);
	var worksheet_feature_collection_1 = __webpack_require__(40);
	var worksheet_feature_set_collection_1 = __webpack_require__(41);
	var WorksheetFeatureSet = (function (_super) {
	    __extends(WorksheetFeatureSet, _super);
	    function WorksheetFeatureSet(kwds) {
	        _super.call(this, { "id": kwds.definition.id });
	        this._childFeatureSets = new worksheet_feature_set_collection_1.WorksheetFeatureSetCollection([]);
	        this._features = new worksheet_feature_collection_1.WorksheetFeatureCollection([]);
	        this._definition = kwds.definition;
	        this._parentFeatureSet = kwds.parentFeatureSet;
	        this._parentsChildNumber = kwds.parentsChildNumber;
	        if (kwds.definition.childFeatureSets) {
	            var childNumber = 0;
	            for (var _i = 0, _a = kwds.definition.childFeatureSets.models; _i < _a.length; _i++) {
	                var childFeatureSetDefinition = _a[_i];
	                this._childFeatureSets.add(new WorksheetFeatureSet({
	                    allFeatures: kwds.allFeatures,
	                    definition: childFeatureSetDefinition,
	                    parentFeatureSet: this,
	                    parentsChildNumber: childNumber++,
	                    state: kwds.state && kwds.state.childFeatureSets ? kwds.state.childFeatureSets[childFeatureSetDefinition.id] : undefined
	                }));
	            }
	        }
	        if (kwds.definition.features) {
	            for (var _b = 0, _c = kwds.definition.features.models; _b < _c.length; _b++) {
	                var featureDefinition = _c[_b];
	                var feature = new worksheet_feature_1.WorksheetFeature({
	                    allFeatures: kwds.allFeatures,
	                    allFeaturesIndex: kwds.allFeatures.length,
	                    definition: featureDefinition,
	                    parentFeatureSet: this,
	                    state: kwds.state && kwds.state.features ? kwds.state.features[featureDefinition.id] : undefined
	                });
	                this._features.add(feature);
	                kwds.allFeatures.push(feature);
	            }
	        }
	    }
	    Object.defineProperty(WorksheetFeatureSet.prototype, "currentState", {
	        get: function () {
	            if (!this.definition.childFeatureSets && !this.definition.features) {
	                return undefined;
	            }
	            var state = new worksheet_feature_set_state_1.WorksheetFeatureSetState();
	            var usableState = false;
	            if (this.definition.childFeatureSets) {
	                var childFeatureSetStates = {};
	                for (var _i = 0, _a = this._childFeatureSets.models; _i < _a.length; _i++) {
	                    var childFeatureSet = _a[_i];
	                    var childFeatureSetState = childFeatureSet.currentState;
	                    if (childFeatureSetState) {
	                        childFeatureSetStates[childFeatureSet.id] = childFeatureSetState;
	                    }
	                }
	                if (!_.isEmpty(childFeatureSetStates)) {
	                    state.childFeatureSets = childFeatureSetStates;
	                    usableState = true;
	                }
	            }
	            if (this.definition.features) {
	                var featureStates = {};
	                for (var _b = 0, _c = this._features.models; _b < _c.length; _b++) {
	                    var feature = _c[_b];
	                    var featureState = feature.currentState;
	                    if (featureState) {
	                        featureStates[feature.id] = featureState;
	                    }
	                }
	                if (!_.isEmpty(featureStates)) {
	                    state.features = featureStates;
	                    usableState = true;
	                }
	            }
	            return usableState ? state : undefined;
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(WorksheetFeatureSet.prototype, "childFeatureSets", {
	        get: function () {
	            return this._childFeatureSets;
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(WorksheetFeatureSet.prototype, "definition", {
	        get: function () {
	            return this._definition;
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(WorksheetFeatureSet.prototype, "displayName", {
	        get: function () {
	            return this._definition.displayName ? this._definition.displayName : this._definition.id;
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(WorksheetFeatureSet.prototype, "features", {
	        get: function () {
	            return this._features;
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(WorksheetFeatureSet.prototype, "parentFeatureSet", {
	        get: function () {
	            return this._parentFeatureSet;
	        },
	        enumerable: true,
	        configurable: true
	    });
	    return WorksheetFeatureSet;
	}(Backbone.Model));
	exports.WorksheetFeatureSet = WorksheetFeatureSet;


/***/ },
/* 37 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var _ = __webpack_require__(3);
	var Backbone = __webpack_require__(4);
	var worksheet_feature_state_1 = __webpack_require__(34);
	var worksheet_feature_value_collection_1 = __webpack_require__(38);
	var worksheet_feature_value_1 = __webpack_require__(39);
	var WorksheetFeature = (function (_super) {
	    __extends(WorksheetFeature, _super);
	    function WorksheetFeature(kwds) {
	        _super.call(this, { id: kwds.definition.id });
	        this._allFeatures = kwds.allFeatures;
	        this._allFeaturesIndex = kwds.allFeaturesIndex;
	        this._definition = kwds.definition;
	        this.selected = false;
	        this._parentFeatureSet = kwds.parentFeatureSet;
	        if (kwds.state && kwds.state.text) {
	            this.set("text", kwds.state.text);
	        }
	        if (kwds.definition.values_) {
	            var values = [];
	            for (var _i = 0, _a = kwds.definition.values_.models; _i < _a.length; _i++) {
	                var valueDefinition = _a[_i];
	                values.push(new worksheet_feature_value_1.WorksheetFeatureValue(valueDefinition, this, kwds.state && kwds.state.selectedValues ? kwds.state.selectedValues.indexOf(valueDefinition.id) != -1 : false));
	            }
	            this._values = new worksheet_feature_value_collection_1.WorksheetFeatureValueCollection(values);
	        }
	        else {
	            this._values = undefined;
	        }
	    }
	    Object.defineProperty(WorksheetFeature.prototype, "currentState", {
	        get: function () {
	            var stateAttributes = {};
	            {
	                var text = this.text;
	                if (text) {
	                    stateAttributes["text"] = text;
	                }
	            }
	            {
	                if (this.values_) {
	                    var selectedValues = [];
	                    for (var _i = 0, _a = this.values_.models; _i < _a.length; _i++) {
	                        var value = _a[_i];
	                        if (value.selected) {
	                            selectedValues.push(value.id);
	                        }
	                    }
	                    if (selectedValues.length > 0) {
	                        stateAttributes["selectedValues"] = selectedValues;
	                    }
	                }
	            }
	            if (!_.isEmpty(stateAttributes)) {
	                return new worksheet_feature_state_1.WorksheetFeatureState(stateAttributes);
	            }
	            else {
	                return undefined;
	            }
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(WorksheetFeature.prototype, "definition", {
	        get: function () {
	            return this._definition;
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(WorksheetFeature.prototype, "displayName", {
	        get: function () {
	            return this._definition.displayName ? this._definition.displayName : this._definition.id;
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(WorksheetFeature.prototype, "parentFeatureSet", {
	        get: function () {
	            return this._parentFeatureSet;
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(WorksheetFeature.prototype, "nextFeature", {
	        get: function () {
	            if (this._allFeaturesIndex + 1 < this._allFeatures.length) {
	                return this._allFeatures[this._allFeaturesIndex + 1];
	            }
	            return undefined;
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(WorksheetFeature.prototype, "previousFeature", {
	        get: function () {
	            if (this._allFeaturesIndex > 0) {
	                return this._allFeatures[this._allFeaturesIndex - 1];
	            }
	            return undefined;
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(WorksheetFeature.prototype, "selected", {
	        get: function () {
	            return this.get("selected");
	        },
	        set: function (value) {
	            this.set("selected", value);
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(WorksheetFeature.prototype, "outputValues", {
	        get: function () {
	            var outputValues = [];
	            {
	                var text = this.text;
	                if (text) {
	                    outputValues.push(text);
	                }
	            }
	            if (this._values) {
	                for (var _i = 0, _a = this._values.models; _i < _a.length; _i++) {
	                    var value = _a[_i];
	                    if (value.selected) {
	                        if (value.definition.displayName) {
	                            outputValues.push(value.definition.displayName);
	                        }
	                        else {
	                            outputValues.push(value.definition.id);
	                        }
	                    }
	                }
	            }
	            return outputValues;
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(WorksheetFeature.prototype, "text", {
	        get: function () {
	            return this.get("text");
	        },
	        set: function (value) {
	            if (value) {
	                this.set("text", value);
	            }
	            else {
	                this.unset("text");
	            }
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(WorksheetFeature.prototype, "values_", {
	        get: function () {
	            return this._values;
	        },
	        enumerable: true,
	        configurable: true
	    });
	    return WorksheetFeature;
	}(Backbone.Model));
	exports.WorksheetFeature = WorksheetFeature;


/***/ },
/* 38 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var Backbone = __webpack_require__(4);
	var WorksheetFeatureValueCollection = (function (_super) {
	    __extends(WorksheetFeatureValueCollection, _super);
	    function WorksheetFeatureValueCollection() {
	        _super.apply(this, arguments);
	    }
	    return WorksheetFeatureValueCollection;
	}(Backbone.Collection));
	exports.WorksheetFeatureValueCollection = WorksheetFeatureValueCollection;


/***/ },
/* 39 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var Backbone = __webpack_require__(4);
	var WorksheetFeatureValue = (function (_super) {
	    __extends(WorksheetFeatureValue, _super);
	    function WorksheetFeatureValue(definition, parentFeature, selected) {
	        _super.call(this, { id: definition.id });
	        this._definition = definition;
	        this._parentFeature = parentFeature;
	        this.selected = selected;
	    }
	    Object.defineProperty(WorksheetFeatureValue.prototype, "definition", {
	        get: function () {
	            return this._definition;
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(WorksheetFeatureValue.prototype, "displayName", {
	        get: function () {
	            return this._definition.displayName ? this._definition.displayName : this._definition.id;
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(WorksheetFeatureValue.prototype, "parentFeature", {
	        get: function () {
	            return this._parentFeature;
	        },
	        enumerable: true,
	        configurable: true
	    });
	    Object.defineProperty(WorksheetFeatureValue.prototype, "selected", {
	        get: function () {
	            return this.get("selected");
	        },
	        set: function (value) {
	            this.set("selected", value);
	        },
	        enumerable: true,
	        configurable: true
	    });
	    return WorksheetFeatureValue;
	}(Backbone.Model));
	exports.WorksheetFeatureValue = WorksheetFeatureValue;


/***/ },
/* 40 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var Backbone = __webpack_require__(4);
	var WorksheetFeatureCollection = (function (_super) {
	    __extends(WorksheetFeatureCollection, _super);
	    function WorksheetFeatureCollection() {
	        _super.apply(this, arguments);
	    }
	    return WorksheetFeatureCollection;
	}(Backbone.Collection));
	exports.WorksheetFeatureCollection = WorksheetFeatureCollection;


/***/ },
/* 41 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var Backbone = __webpack_require__(4);
	var WorksheetFeatureSetCollection = (function (_super) {
	    __extends(WorksheetFeatureSetCollection, _super);
	    function WorksheetFeatureSetCollection(models) {
	        _super.call(this, models);
	    }
	    return WorksheetFeatureSetCollection;
	}(Backbone.Collection));
	exports.WorksheetFeatureSetCollection = WorksheetFeatureSetCollection;


/***/ },
/* 42 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var _ = __webpack_require__(3);
	var application_1 = __webpack_require__(1);
	var Backbone = __webpack_require__(4);
	var Marionette = __webpack_require__(5);
	__webpack_require__(43);
	var WorksheetAccessionNumberPickerView = (function (_super) {
	    __extends(WorksheetAccessionNumberPickerView, _super);
	    function WorksheetAccessionNumberPickerView(kwds) {
	        _super.call(this, {
	            events: {
	                "click #footer-close-button": "onClickCloseButton",
	                "click #header-close-button": "onClickCloseButton",
	                "click #footer-ok-button": "onClickOkButton",
	                "keyup #newAccessionNumberInput": "onKeyupNewAccessionNumberInput"
	            },
	            model: new Backbone.Model(),
	            template: _.template(__webpack_require__(45))
	        });
	        this._availableAccessionNumbers = kwds.availableAccessionNumbers;
	    }
	    WorksheetAccessionNumberPickerView.prototype.initialize = function () {
	        this.ui = {
	            accessionNumberSelect: "#accessionNumberSelect",
	            alert: "#alert",
	            newAccessionNumberInput: "#newAccessionNumberInput"
	        };
	    };
	    WorksheetAccessionNumberPickerView.prototype.onClickCloseButton = function () {
	        application_1.Application.instance.modalRegion.empty();
	        application_1.Application.instance.router.navigate("", { trigger: true });
	    };
	    WorksheetAccessionNumberPickerView.prototype.onClickOkButton = function () {
	        var accessionNumber = this.ui.accessionNumberSelect.val();
	        if (!accessionNumber) {
	            accessionNumber = this.ui.newAccessionNumberInput.val();
	            if (!accessionNumber || accessionNumber.length == 0) {
	                var alert_1 = this.ui.alert;
	                alert_1.fadeTo(1000, 500).slideUp(500, function () {
	                    alert_1.slideUp(500);
	                });
	                return;
	            }
	        }
	        application_1.Application.instance.modalRegion.empty();
	        application_1.Application.instance.router.navigate("worksheet/" + accessionNumber, { trigger: true });
	    };
	    WorksheetAccessionNumberPickerView.prototype.onKeyupNewAccessionNumberInput = function (event) {
	        if (event.keyCode == 13) {
	            this.onClickOkButton();
	        }
	    };
	    WorksheetAccessionNumberPickerView.prototype.onShow = function () {
	        this.ui.accessionNumberSelect.selectpicker("show");
	        application_1.Application.instance.modalRegion.$el.on('shown.bs.modal', { view: this }, function (event) {
	            if (event.data.view.ui.newAccessionNumberInput.focus) {
	                event.data.view.ui.newAccessionNumberInput.focus();
	            }
	        });
	    };
	    WorksheetAccessionNumberPickerView.prototype.serializeData = function () {
	        return { "availableAccessionNumbers": this._availableAccessionNumbers };
	    };
	    return WorksheetAccessionNumberPickerView;
	}(Marionette.ItemView));
	exports.WorksheetAccessionNumberPickerView = WorksheetAccessionNumberPickerView;


/***/ },
/* 43 */
/***/ function(module, exports) {

	// removed by extract-text-webpack-plugin

/***/ },
/* 44 */,
/* 45 */
/***/ function(module, exports) {

	module.exports = "<div class=\"modal-dialog\" role=\"document\" id=\"worksheet-accession-number-picker\">\r\n    <div class=\"modal-content\">\r\n        <div class=\"modal-header\">\r\n            <button type=\"button\" class=\"close\" aria-label=\"Close\" id=\"header-close-button\"><span aria-hidden=\"true\">&times;</span></button>\r\n            <h4 class=\"modal-title\">Worksheet</h4>\r\n        </div>\r\n        <div class=\"modal-body\">\r\n            <% if (availableAccessionNumbers.length > 0) { %>\r\n                <select class=\"selectpicker show-menu-arrow show-tick\" data-width=\"auto\" id=\"accessionNumberSelect\" title=\"Choose an existing worksheet\">\r\n                    <% for (var i = 0; i < availableAccessionNumbers.length; i++) { %>\r\n                        <option value=\"<%= availableAccessionNumbers[i] %>\"><%- availableAccessionNumbers[i] %></option>\r\n                    <% } %>\r\n                </select>\r\n                <br /><br />\r\n            <% } %>\r\n            <div>\r\n                <div>\r\n                    <% if (availableAccessionNumbers.length > 0) { %>\r\n                    Or enter a new accession number:\r\n                    <% } else { %>\r\n                    Enter a new accession number:\r\n                    <% } %>\r\n                </div>\r\n                <input id=\"newAccessionNumberInput\" placeholder=\"New accession number\" size=\"26\" type=\"text\" />\r\n            </div>\r\n            <br/>\r\n            <div class=\"modal-footer\">\r\n                <button type=\"button\" class=\"btn btn-default\" id=\"footer-close-button\">Cancel</button>\r\n                <button type=\"button\" class=\"btn btn-primary\" id=\"footer-ok-button\">OK</button>\r\n            </div>\r\n            <div class=\"alert alert-warning\" hidden=\"hidden\" id=\"alert\" role=\"alert\">\r\n                <strong>Please select or enter an accession number</strong>\r\n            </div>\r\n        </div>\r\n    </div>\r\n</div>\r\n"

/***/ },
/* 46 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var application_1 = __webpack_require__(1);
	var top_level_view_1 = __webpack_require__(18);
	var worksheet_feature_input_event_1 = __webpack_require__(47);
	var worksheet_two_column_view_1 = __webpack_require__(48);
	var WorksheetTopLevelView = (function (_super) {
	    __extends(WorksheetTopLevelView, _super);
	    function WorksheetTopLevelView() {
	        _super.apply(this, arguments);
	    }
	    WorksheetTopLevelView.prototype.initialize = function () {
	        this.listenTo(application_1.Application.instance.radio.globalChannel, worksheet_feature_input_event_1.WorksheetFeatureInputEvent.NAME, this.onFeatureInput);
	    };
	    WorksheetTopLevelView.prototype.onFeatureInput = function (event) {
	        this.model.putToService();
	    };
	    WorksheetTopLevelView.prototype.onRender = function () {
	        _super.prototype.onRender.call(this);
	        this.showChildView("content", new worksheet_two_column_view_1.WorksheetTwoColumnView({ model: this.model }));
	    };
	    return WorksheetTopLevelView;
	}(top_level_view_1.TopLevelView));
	exports.WorksheetTopLevelView = WorksheetTopLevelView;


/***/ },
/* 47 */
/***/ function(module, exports) {

	"use strict";
	var WorksheetFeatureInputEvent = (function () {
	    function WorksheetFeatureInputEvent(options) {
	        this._feature = options.feature;
	    }
	    Object.defineProperty(WorksheetFeatureInputEvent.prototype, "feature", {
	        get: function () {
	            return this._feature;
	        },
	        enumerable: true,
	        configurable: true
	    });
	    WorksheetFeatureInputEvent.NAME = "worksheet:feature:input";
	    return WorksheetFeatureInputEvent;
	}());
	exports.WorksheetFeatureInputEvent = WorksheetFeatureInputEvent;


/***/ },
/* 48 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var _ = __webpack_require__(3);
	var application_1 = __webpack_require__(1);
	var Marionette = __webpack_require__(5);
	var worksheet_feature_navigation_event_1 = __webpack_require__(49);
	var worksheet_input_view_1 = __webpack_require__(50);
	var worksheet_sidebar_view_1 = __webpack_require__(69);
	__webpack_require__(78);
	var WorksheetTwoColumnView = (function (_super) {
	    __extends(WorksheetTwoColumnView, _super);
	    function WorksheetTwoColumnView(options) {
	        _super.call(this, _.extend(options, {
	            regions: {
	                leftColumn: "#left-column",
	                rightColumn: "#right-column"
	            },
	            template: _.template(__webpack_require__(80))
	        }));
	    }
	    WorksheetTwoColumnView.prototype.initialize = function () {
	        this.listenTo(application_1.Application.instance.radio.globalChannel, worksheet_feature_navigation_event_1.WorksheetFeatureNavigationEvent.NAME, this.onFeatureNavigation);
	    };
	    WorksheetTwoColumnView.prototype.onFeatureNavigation = function (event) {
	        this.model.selectedFeature.selected = false;
	        this.model.selectedFeature = event.feature;
	        var region = this.getRegion("rightColumn");
	        region.reset();
	        region.show(new worksheet_input_view_1.WorksheetInputView({ model: event.feature }));
	    };
	    WorksheetTwoColumnView.prototype.onBeforeShow = function () {
	        this.showChildView("leftColumn", new worksheet_sidebar_view_1.WorksheetSidebarView({ model: this.model }));
	        this.showChildView("rightColumn", new worksheet_input_view_1.WorksheetInputView({ model: this.model.selectedFeature }));
	    };
	    return WorksheetTwoColumnView;
	}(Marionette.LayoutView));
	exports.WorksheetTwoColumnView = WorksheetTwoColumnView;


/***/ },
/* 49 */
/***/ function(module, exports) {

	"use strict";
	var WorksheetFeatureNavigationEvent = (function () {
	    function WorksheetFeatureNavigationEvent(options) {
	        this._feature = options.feature;
	    }
	    Object.defineProperty(WorksheetFeatureNavigationEvent.prototype, "feature", {
	        get: function () {
	            return this._feature;
	        },
	        enumerable: true,
	        configurable: true
	    });
	    WorksheetFeatureNavigationEvent.NAME = "worksheet:feature:navigation";
	    return WorksheetFeatureNavigationEvent;
	}());
	exports.WorksheetFeatureNavigationEvent = WorksheetFeatureNavigationEvent;


/***/ },
/* 50 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var _ = __webpack_require__(3);
	var Marionette = __webpack_require__(5);
	var application_1 = __webpack_require__(1);
	var worksheet_feature_input_view_1 = __webpack_require__(51);
	var worksheet_feature_navigation_event_1 = __webpack_require__(49);
	var WorksheetInputView = (function (_super) {
	    __extends(WorksheetInputView, _super);
	    function WorksheetInputView(options) {
	        _super.call(this, _.extend(options, {
	            events: {
	                "click #back-button": "onClickBackButton",
	                "click #next-button": "onClickNextButton"
	            },
	            regions: {
	                buttons: "#input-navigation",
	                child: "#input-child"
	            },
	            template: _.template(__webpack_require__(68))
	        }));
	        this._nextFeature = this.model.nextFeature;
	        this._previousFeature = this.model.previousFeature;
	    }
	    WorksheetInputView.prototype.initialize = function () {
	        this.ui = { backButton: "#back-button", nextButton: "#next-button" };
	    };
	    WorksheetInputView.prototype.onBeforeShow = function () {
	        this.showChildView("child", new worksheet_feature_input_view_1.WorksheetFeatureInputView({ model: this.model }));
	    };
	    WorksheetInputView.prototype.onClickBackButton = function () {
	        if (!this._previousFeature) {
	            return;
	        }
	        application_1.Application.instance.radio.globalChannel.trigger(worksheet_feature_navigation_event_1.WorksheetFeatureNavigationEvent.NAME, new worksheet_feature_navigation_event_1.WorksheetFeatureNavigationEvent({ feature: this._previousFeature }));
	    };
	    WorksheetInputView.prototype.onClickNextButton = function () {
	        if (!this._nextFeature) {
	            return;
	        }
	        application_1.Application.instance.radio.globalChannel.trigger(worksheet_feature_navigation_event_1.WorksheetFeatureNavigationEvent.NAME, new worksheet_feature_navigation_event_1.WorksheetFeatureNavigationEvent({ feature: this._nextFeature }));
	    };
	    WorksheetInputView.prototype.onRender = function () {
	        this.ui.backButton.prop("disabled", !!!this._previousFeature);
	        this.ui.nextButton.prop("disabled", !!!this._nextFeature);
	    };
	    return WorksheetInputView;
	}(Marionette.LayoutView));
	exports.WorksheetInputView = WorksheetInputView;


/***/ },
/* 51 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var _ = __webpack_require__(3);
	var Marionette = __webpack_require__(5);
	var application_1 = __webpack_require__(1);
	var worksheet_feature_values_input_view_1 = __webpack_require__(52);
	var worksheet_feature_input_event_1 = __webpack_require__(47);
	__webpack_require__(64);
	__webpack_require__(65);
	var WorksheetFeatureInputView = (function (_super) {
	    __extends(WorksheetFeatureInputView, _super);
	    function WorksheetFeatureInputView(options) {
	        _super.call(this, _.extend(options, {
	            events: {
	                "click #reset-button": "onClickResetButton"
	            },
	            regions: {
	                values: "#values"
	            },
	            template: _.template(__webpack_require__(67))
	        }));
	        this.bindings = {
	            "textarea": "text"
	        };
	    }
	    WorksheetFeatureInputView.prototype.initialize = function () {
	        this.listenTo(this.model, "change:text", this.onTextChange);
	    };
	    WorksheetFeatureInputView.prototype.onBeforeDestroy = function () {
	        this.unstickit();
	    };
	    WorksheetFeatureInputView.prototype.onClickResetButton = function () {
	        this.model.text = undefined;
	        if (this.model.values_) {
	            for (var _i = 0, _a = this.model.values_.models; _i < _a.length; _i++) {
	                var value = _a[_i];
	                value.selected = false;
	            }
	        }
	        application_1.Application.instance.radio.globalChannel.trigger(worksheet_feature_input_event_1.WorksheetFeatureInputEvent.NAME, new worksheet_feature_input_event_1.WorksheetFeatureInputEvent({ feature: this.model }));
	    };
	    WorksheetFeatureInputView.prototype.onRender = function () {
	        this.stickit();
	        this.showChildView("values", new worksheet_feature_values_input_view_1.WorksheetFeatureValuesInputView({ collection: this.model.values_ }));
	    };
	    WorksheetFeatureInputView.prototype.onTextChange = function () {
	        application_1.Application.instance.radio.globalChannel.trigger(worksheet_feature_input_event_1.WorksheetFeatureInputEvent.NAME, new worksheet_feature_input_event_1.WorksheetFeatureInputEvent({ feature: this.model }));
	    };
	    WorksheetFeatureInputView.prototype.serializeData = function () {
	        return { "displayName": this.model.displayName };
	    };
	    return WorksheetFeatureInputView;
	}(Marionette.LayoutView));
	exports.WorksheetFeatureInputView = WorksheetFeatureInputView;


/***/ },
/* 52 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var _ = __webpack_require__(3);
	var Marionette = __webpack_require__(5);
	var worksheet_feature_value_input_view_1 = __webpack_require__(53);
	var WorksheetFeatureValuesInputView = (function (_super) {
	    __extends(WorksheetFeatureValuesInputView, _super);
	    function WorksheetFeatureValuesInputView(options) {
	        _super.call(this, _.extend(options, {
	            childView: worksheet_feature_value_input_view_1.WorksheetFeatureValueInputView
	        }));
	    }
	    return WorksheetFeatureValuesInputView;
	}(Marionette.CollectionView));
	exports.WorksheetFeatureValuesInputView = WorksheetFeatureValuesInputView;


/***/ },
/* 53 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var _ = __webpack_require__(3);
	var application_1 = __webpack_require__(1);
	var Marionette = __webpack_require__(5);
	var worksheet_feature_input_event_1 = __webpack_require__(47);
	var worksheet_feature_value_full_size_image_view_1 = __webpack_require__(54);
	__webpack_require__(58);
	__webpack_require__(60);
	__webpack_require__(61);
	var WorksheetFeatureValueInputView = (function (_super) {
	    __extends(WorksheetFeatureValueInputView, _super);
	    function WorksheetFeatureValueInputView(options) {
	        _super.call(this, _.extend(options, {
	            events: {
	                "click a.display-name": "onClickSelect",
	                "click a.full-size": "onClickFullSize",
	                "click a.thumbnail": "onClickSelect",
	                "click div.checkbox": "onClickSelect"
	            },
	            template: _.template(__webpack_require__(63)),
	        }));
	        this.listenTo(this.model, "change:selected", this.onModelChangeSelected);
	    }
	    WorksheetFeatureValueInputView.prototype.initialize = function () {
	        this.ui = { checkbox: "input", image: "img" };
	    };
	    WorksheetFeatureValueInputView.prototype.onClickFullSize = function () {
	        application_1.Application.instance.modalRegion.show(new worksheet_feature_value_full_size_image_view_1.WorksheetFeatureValueFullSizeImageView({ model: this.model }));
	    };
	    WorksheetFeatureValueInputView.prototype.onClickSelect = function () {
	        this.model.selected = !this.model.selected;
	        this.ui.checkbox[0].checked = this.model.selected;
	        application_1.Application.instance.radio.globalChannel.trigger(worksheet_feature_input_event_1.WorksheetFeatureInputEvent.NAME, new worksheet_feature_input_event_1.WorksheetFeatureInputEvent({ feature: this.model.parentFeature }));
	    };
	    WorksheetFeatureValueInputView.prototype.onModelChangeSelected = function () {
	        this.ui.checkbox[0].checked = this.model.selected;
	    };
	    WorksheetFeatureValueInputView.prototype.serializeData = function () {
	        var data = this.model.definition.toJSON();
	        data["displayName"] = this.model.displayName;
	        data["image"] = this.model.definition.image ? this.model.definition.image.toJSON() : null;
	        return data;
	    };
	    WorksheetFeatureValueInputView.prototype.onRender = function () {
	        this.ui.checkbox[0].checked = this.model.selected;
	        this.ui.image.magnify();
	    };
	    return WorksheetFeatureValueInputView;
	}(Marionette.ItemView));
	exports.WorksheetFeatureValueInputView = WorksheetFeatureValueInputView;


/***/ },
/* 54 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var _ = __webpack_require__(3);
	var application_1 = __webpack_require__(1);
	var Marionette = __webpack_require__(5);
	__webpack_require__(55);
	var WorksheetFeatureValueFullSizeImageView = (function (_super) {
	    __extends(WorksheetFeatureValueFullSizeImageView, _super);
	    function WorksheetFeatureValueFullSizeImageView(options) {
	        _super.call(this, _.extend(options, {
	            events: {
	                "click #close-button": "onClickCloseButton",
	            },
	            template: _.template(__webpack_require__(57))
	        }));
	    }
	    WorksheetFeatureValueFullSizeImageView.prototype.onClickCloseButton = function () {
	        application_1.Application.instance.modalRegion.empty();
	    };
	    WorksheetFeatureValueFullSizeImageView.prototype.serializeData = function () {
	        return { "displayName": this.model.displayName, "url": this.model.definition.image.fullSizeUrl };
	    };
	    return WorksheetFeatureValueFullSizeImageView;
	}(Marionette.ItemView));
	exports.WorksheetFeatureValueFullSizeImageView = WorksheetFeatureValueFullSizeImageView;


/***/ },
/* 55 */
/***/ function(module, exports) {

	// removed by extract-text-webpack-plugin

/***/ },
/* 56 */,
/* 57 */
/***/ function(module, exports) {

	module.exports = "<div class=\"modal-dialog\" role=\"document\" id=\"feature-value-full-size-image\">\r\n    <div class=\"modal-content\">\r\n        <div class=\"modal-header\">\r\n            <button type=\"button\" class=\"close\" aria-label=\"Close\" id=\"close-button\"><span aria-hidden=\"true\">&times;</span></button>\r\n            <h4 class=\"modal-title\"><%- displayName %></h4>\r\n        </div>\r\n        <div class=\"modal-body\">\r\n            <img class=\"img-responsive\" src=\"<%= url %>\" />\r\n        </div>\r\n    </div>\r\n</div>\r\n"

/***/ },
/* 58 */
/***/ function(module, exports) {

	// removed by extract-text-webpack-plugin

/***/ },
/* 59 */,
/* 60 */
/***/ function(module, exports, __webpack_require__) {

	/* WEBPACK VAR INJECTION */(function(jQuery) {/*!
	 * jQuery Magnify Plugin v1.6.17 by T. H. Doan (http://thdoan.github.io/magnify/)
	 * Based on http://thecodeplayer.com/walkthrough/magnifying-glass-for-images-using-jquery-and-css3
	 *
	 * jQuery Magnify by T. H. Doan is licensed under the MIT License.
	 * Read a copy of the license in the LICENSE file or at
	 * http://choosealicense.com/licenses/mit
	 */
	
	(function($) {
	  $.fn.magnify = function(oOptions) {
	
	    var $that = this, // Preserve scope
	      oSettings = $.extend({
	        /* Default options */
	        speed: 100,
	        timeout: -1,
	        onload: function(){}
	      }, oOptions),
	      init = function(el) {
	        // Initiate
	        var $image = $(el),
	          $anchor = $image.closest('a'),
	          $container,
	          $lens,
	          oContainerOffset,
	          nContainerWidth,
	          nContainerHeight,
	          nImageWidth,
	          nImageHeight,
	          nLensWidth,
	          nLensHeight,
	          nMagnifiedWidth = 0,
	          nMagnifiedHeight = 0,
	          sImgSrc = $image.attr('data-magnify-src') || oSettings.src || $anchor.attr('href') || '',
	          hideLens = function() {
	            if ($lens.is(':visible')) $lens.fadeOut(oSettings.speed, function() {
	              $('html').removeClass('magnifying').trigger('magnifyend'); // Reset overflow-x
	            });
	          };
	        // Disable zooming if no valid zoom image source
	        if (!sImgSrc) return;
	
	        // Save any inline styles for resetting
	        $image.data('originalStyle', $image.attr('style'));
	
	        // Activate magnification:
	        // 1. Try to get zoom image dimensions
	        // 2. Proceed only if able to get zoom image dimensions OK
	
	        // [1] Calculate the native (magnified) image dimensions. The zoomed
	        // version is only shown after the native dimensions are available. To
	        // get the actual dimensions we have to create this image object.
	        var elImage = new Image();
	        $(elImage).on({
	          load: function() {
	            // [2] Got image dimensions OK
	
	            var nX, nY;
	
	            // Fix overlap bug at the edges during magnification
	            $image.css('display', 'block');
	            // Create container div if necessary
	            if (!$image.parent('.magnify').length) {
	              $image.wrap('<div class="magnify"></div>');
	            }
	            $container = $image.parent('.magnify');
	            // Create the magnifying lens div if necessary
	            if ($image.prev('.magnify-lens').length) {
	              $container.children('.magnify-lens').css('background-image', 'url(\'' + sImgSrc + '\')');
	            } else {
	              $image.before('<div class="magnify-lens loading" style="background:url(\'' + sImgSrc + '\') no-repeat 0 0"></div>');
	            }
	            $lens = $container.children('.magnify-lens');
	            // Remove the "Loading..." text
	            $lens.removeClass('loading');
	            // Cache offsets and dimensions for improved performance
	            // NOTE: This code is inside the load() function, which is
	            // important. The width and height of the object would return 0 if
	            // accessed before the image is fully loaded.
	            oContainerOffset = $container.offset();
	            nContainerWidth = $container.width();
	            nContainerHeight = $container.height();
	            nImageWidth = $image.innerWidth(); // Correct width with padding
	            nImageHeight = $image.innerHeight(); // Correct height with padding
	            nLensWidth = $lens.width();
	            nLensHeight = $lens.height();
	            nMagnifiedWidth = elImage.width;
	            nMagnifiedHeight = elImage.height;
	            // Store dimensions for mobile plugin
	            $image.data('zoomSize', {
	              width: nMagnifiedWidth,
	              height: nMagnifiedHeight
	            });
	            // Clean up
	            elImage = null;
	            // Execute callback
	            oSettings.onload();
	            // Handle mouse movements
	            $container.off().on({
	              'mousemove touchmove': function(e) {
	                e.preventDefault();
	                // Reinitialize if image initially hidden
	                if (!nContainerHeight) {
	                  refresh();
	                  return;
	                }
	                // x/y coordinates of the mouse pointer or touch point
	                // This is the position of .magnify relative to the document.
	                //
	                // We deduct the positions of .magnify from the mouse or touch
	                // positions relative to the document to get the mouse or touch
	                // positions relative to the container (.magnify).
	                nX = (e.pageX || e.originalEvent.touches[0].pageX) - oContainerOffset.left,
	                nY = (e.pageY || e.originalEvent.touches[0].pageY) - oContainerOffset.top;
	                // Toggle magnifying lens
	                if (!$lens.is(':animated')) {
	                  if (nX<nContainerWidth && nY<nContainerHeight && nX>0 && nY>0) {
	                    if ($lens.is(':hidden')) {
	                      $('html').addClass('magnifying').trigger('magnifystart'); // Hide overflow-x while zooming
	                      $lens.fadeIn(oSettings.speed);
	                    }
	                  } else {
	                    hideLens();
	                  }
	                }
	                if ($lens.is(':visible')) {
	                  // Move the magnifying lens with the mouse
	                  var nPosX = nX - nLensWidth/2,
	                    nPosY = nY - nLensHeight/2;
	                  if (nMagnifiedWidth && nMagnifiedHeight) {
	                    // Change the background position of .magnify-lens according
	                    // to the position of the mouse over the .magnify-image image.
	                    // This allows us to get the ratio of the pixel under the
	                    // mouse pointer with respect to the image and use that to
	                    // position the large image inside the magnifying lens.
	                    var nRatioX = Math.round(nX/nImageWidth*nMagnifiedWidth - nLensWidth/2)*-1,
	                      nRatioY = Math.round(nY/nImageHeight*nMagnifiedHeight - nLensHeight/2)*-1,
	                      sBgPos = nRatioX + 'px ' + nRatioY + 'px';
	                  }
	                  // Now the lens moves with the mouse. The logic is to deduct
	                  // half of the lens's width and height from the mouse
	                  // coordinates to place it with its center at the mouse
	                  // coordinates. If you hover on the image now, you should see
	                  // the magnifying lens in action.
	                  $lens.css({
	                    top: Math.round(nPosY) + 'px',
	                    left: Math.round(nPosX) + 'px',
	                    backgroundPosition: sBgPos || ''
	                  });
	                }
	              },
	              'mouseenter': function() {
	                // Need to update offsets here to support accordions
	                oContainerOffset = $container.offset();
	              },
	              'mouseleave': hideLens
	            });
	
	            // Prevent magnifying lens from getting "stuck"
	            if (oSettings.timeout>=0) {
	              $container.on('touchend', function() {
	                setTimeout(hideLens, oSettings.timeout);
	              });
	            }
	            // Ensure lens is closed when tapping outside of it
	            $('body').not($container).on('touchstart', hideLens);
	
	            // Support image map click-throughs while zooming
	            var sUsemap = $image.attr('usemap');
	            if (sUsemap) {
	              var $map = $('map[name=' + sUsemap.slice(1) + ']');
	              // Image map needs to be on the same DOM level as image source
	              $image.after($map);
	              $container.click(function(e) {
	                // Trigger click on image below lens at current cursor position
	                if (e.clientX || e.clientY) {
	                  $lens.hide();
	                  var elPoint = document.elementFromPoint(
	                      e.clientX || e.originalEvent.touches[0].clientX,
	                      e.clientY || e.originalEvent.touches[0].clientY
	                    );
	                  if (elPoint.nodeName==='AREA') {
	                    elPoint.click();
	                  } else {
	                    // Workaround for buggy implementation of elementFromPoint()
	                    // See https://bugzilla.mozilla.org/show_bug.cgi?id=1227469
	                    $('area', $map).each(function() {
	                      var a = $(this).attr('coords').split(',');
	                      if (nX>=a[0] && nX<=a[2] && nY>=a[1] && nY<=a[3]) {
	                        this.click();
	                        return false;
	                      }
	                    });
	                  }
	                }
	              });
	            }
	
	            if ($anchor.length) {
	              // Make parent anchor inline-block to have correct dimensions
	              $anchor.css('display', 'inline-block');
	              // Disable parent anchor if it's sourcing the large image
	              if ($anchor.attr('href') && !($image.attr('data-magnify-src') || oSettings.src)) {
	                $anchor.click(function(e) {
	                  e.preventDefault();
	                });
	              }
	            }
	
	          },
	          error: function() {
	            // Clean up
	            elImage = null;
	          }
	        });
	
	        elImage.src = sImgSrc;
	      },
	      // Simple debounce
	      nTimer = 0,
	      refresh = function() {
	        clearTimeout(nTimer);
	        nTimer = setTimeout(function() {
	          $that.destroy();
	          $that.magnify(oSettings);
	        }, 100);
	      };
	
	    /* Public methods */
	
	    // Turn off zoom and reset to original state
	    this.destroy = function() {
	      this.each(function() {
	        var $this = $(this),
	          $lens = $this.prev('div.magnify-lens'),
	          sStyle = $this.data('originalStyle');
	        if ($this.parent('div.magnify').length && $lens.length) {
	          if (sStyle) $this.attr('style', sStyle);
	          else $this.removeAttr('style');
	          $this.unwrap();
	          $lens.remove();
	        }
	      });
	      // Unregister event handler
	      $(window).off('resize', refresh);
	      return $that;
	    }
	
	    // Handle window resizing
	    $(window).resize(refresh);
	
	    return this.each(function() {
	      // Initiate magnification powers
	      init(this);
	    });
	
	  };
	}(jQuery));
	
	/* WEBPACK VAR INJECTION */}.call(exports, __webpack_require__(2)))

/***/ },
/* 61 */
/***/ function(module, exports) {

	// removed by extract-text-webpack-plugin

/***/ },
/* 62 */,
/* 63 */
/***/ function(module, exports) {

	module.exports = "<div class=\"col-lg-3 col-md-4 col-xs-6 feature-value\">\r\n    <a class=\"display-name\"><h5><%- displayName %></h5></a>\r\n    <% if (image) { %>\r\n    <div class=\"container-fluid image\">\r\n        <div class=\"row thumbnail\">\r\n            <a class=\"thumbnail\"><img alt=\"<%- displayName %>\" class=\"img-responsive\" src=\"<%- image.thumbnailUrl %>\" title=\"<%- displayName %>\"></a>\r\n            <a class=\"full-size\"><i class=\"glyphicon glyphicon-search\"></i></a>\r\n        </div>\r\n        <div class=\"row rights\">\r\n            <div class=\"col-md-2\">&nbsp;</div>\r\n            <div class=\"col-md-8\"><%- image.rights %></div>\r\n            <div class=\"col-md-2\">&nbsp;</div>\r\n        </div>\r\n    </div>\r\n    <% } %>\r\n    <div class=\"checkbox\">\r\n        <input class=\"form-check-input\" name=\"feature-value-checkbox\" type=\"checkbox\" value=\"\" />\r\n        <label for=\"feature-value-checkbox\"><%- displayName %></label>\r\n    </div>\r\n</div>\r\n"

/***/ },
/* 64 */
/***/ function(module, exports, __webpack_require__) {

	var __WEBPACK_AMD_DEFINE_FACTORY__, __WEBPACK_AMD_DEFINE_ARRAY__, __WEBPACK_AMD_DEFINE_RESULT__;// Backbone.Stickit v0.9.2, MIT Licensed
	// Copyright (c) 2012-2015 The New York Times, CMS Group, Matthew DeLambo <delambo@gmail.com>
	
	(function (factory) {
	
	  // Set up Stickit appropriately for the environment. Start with AMD.
	  if (true)
	    !(__WEBPACK_AMD_DEFINE_ARRAY__ = [__webpack_require__(3), __webpack_require__(4), exports], __WEBPACK_AMD_DEFINE_FACTORY__ = (factory), __WEBPACK_AMD_DEFINE_RESULT__ = (typeof __WEBPACK_AMD_DEFINE_FACTORY__ === 'function' ? (__WEBPACK_AMD_DEFINE_FACTORY__.apply(exports, __WEBPACK_AMD_DEFINE_ARRAY__)) : __WEBPACK_AMD_DEFINE_FACTORY__), __WEBPACK_AMD_DEFINE_RESULT__ !== undefined && (module.exports = __WEBPACK_AMD_DEFINE_RESULT__));
	
	  // Next for Node.js or CommonJS.
	  else if (typeof exports === 'object')
	    factory(require('underscore'), require('backbone'), exports);
	
	  // Finally, as a browser global.
	  else
	    factory(_, Backbone, {});
	
	}(function (_, Backbone, Stickit) {
	
	  // Stickit Namespace
	  // --------------------------
	
	  // Export onto Backbone object
	  Backbone.Stickit = Stickit;
	
	  Stickit._handlers = [];
	
	  Stickit.addHandler = function(handlers) {
	    // Fill-in default values.
	    handlers = _.map(_.flatten([handlers]), function(handler) {
	      return _.defaults({}, handler, {
	        updateModel: true,
	        updateView: true,
	        updateMethod: 'text'
	      });
	    });
	    this._handlers = this._handlers.concat(handlers);
	  };
	
	  // Backbone.View Mixins
	  // --------------------
	
	  Stickit.ViewMixin = {
	
	    // Collection of model event bindings.
	    //   [{model,event,fn,config}, ...]
	    _modelBindings: null,
	
	    // Unbind the model and event bindings from `this._modelBindings` and
	    // `this.$el`. If the optional `model` parameter is defined, then only
	    // delete bindings for the given `model` and its corresponding view events.
	    unstickit: function(model, bindingSelector) {
	
	      // Support passing a bindings hash in place of bindingSelector.
	      if (_.isObject(bindingSelector)) {
	        _.each(bindingSelector, function(v, selector) {
	          this.unstickit(model, selector);
	        }, this);
	        return;
	      }
	
	      var models = [], destroyFns = [];
	      this._modelBindings = _.reject(this._modelBindings, function(binding) {
	        if (model && binding.model !== model) return;
	        if (bindingSelector && binding.config.selector != bindingSelector) return;
	
	        binding.model.off(binding.event, binding.fn);
	        destroyFns.push(binding.config._destroy);
	        models.push(binding.model);
	        return true;
	      });
	
	      // Trigger an event for each model that was unbound.
	      _.invoke(_.uniq(models), 'trigger', 'stickit:unstuck', this.cid);
	
	      // Call `_destroy` on a unique list of the binding callbacks.
	      _.each(_.uniq(destroyFns), function(fn) { fn.call(this); }, this);
	
	      this.$el.off('.stickit' + (model ? '.' + model.cid : ''), bindingSelector);
	    },
	
	    // Initilize Stickit bindings for the view. Subsequent binding additions
	    // can either call `stickit` with the new bindings, or add them directly
	    // with `addBinding`. Both arguments to `stickit` are optional.
	    stickit: function(optionalModel, optionalBindingsConfig) {
	      var model = optionalModel || this.model,
	          bindings = optionalBindingsConfig || _.result(this, "bindings") || {};
	
	      this._modelBindings || (this._modelBindings = []);
	
	      // Add bindings in bulk using `addBinding`.
	      this.addBinding(model, bindings);
	
	      // Wrap `view.remove` to unbind stickit model and dom events.
	      var remove = this.remove;
	      if (!remove.stickitWrapped) {
	        this.remove = function() {
	          var ret = this;
	          this.unstickit();
	          if (remove) ret = remove.apply(this, arguments);
	          return ret;
	        };
	      }
	      this.remove.stickitWrapped = true;
	      return this;
	    },
	
	    // Add a single Stickit binding or a hash of bindings to the model. If
	    // `optionalModel` is ommitted, will default to the view's `model` property.
	    addBinding: function(optionalModel, selector, binding) {
	      var model = optionalModel || this.model,
	          namespace = '.stickit.' + model.cid;
	
	      binding = binding || {};
	
	      // Support jQuery-style {key: val} event maps.
	      if (_.isObject(selector)) {
	        var bindings = selector;
	        _.each(bindings, function(val, key) {
	          this.addBinding(model, key, val);
	        }, this);
	        return;
	      }
	
	      // Special case the ':el' selector to use the view's this.$el.
	      var $el = selector === ':el' ? this.$el : this.$(selector);
	
	      // Clear any previous matching bindings.
	      this.unstickit(model, selector);
	
	      // Fail fast if the selector didn't match an element.
	      if (!$el.length) return;
	
	      // Allow shorthand setting of model attributes - `'selector':'observe'`.
	      if (_.isString(binding)) binding = {observe: binding};
	
	      // Handle case where `observe` is in the form of a function.
	      if (_.isFunction(binding.observe)) binding.observe = binding.observe.call(this);
	
	      // Find all matching Stickit handlers that could apply to this element
	      // and store in a config object.
	      var config = getConfiguration($el, binding);
	
	      // The attribute we're observing in our config.
	      var modelAttr = config.observe;
	
	      // Store needed properties for later.
	      config.selector = selector;
	      config.view = this;
	
	      // Create the model set options with a unique `bindId` so that we
	      // can avoid double-binding in the `change:attribute` event handler.
	      var bindId = config.bindId = _.uniqueId();
	
	      // Add a reference to the view for handlers of stickitChange events
	      var options = _.extend({stickitChange: config}, config.setOptions);
	
	      // Add a `_destroy` callback to the configuration, in case `destroy`
	      // is a named function and we need a unique function when unsticking.
	      config._destroy = function() {
	        applyViewFn.call(this, config.destroy, $el, model, config);
	      };
	
	      initializeAttributes($el, config, model, modelAttr);
	      initializeVisible($el, config, model, modelAttr);
	      initializeClasses($el, config, model, modelAttr);
	
	      if (modelAttr) {
	        // Setup one-way (input element -> model) bindings.
	        _.each(config.events, function(type) {
	          var eventName = type + namespace;
	          var listener = function(event) {
	            var val = applyViewFn.call(this, config.getVal, $el, event, config, slice.call(arguments, 1));
	
	            // Don't update the model if false is returned from the `updateModel` configuration.
	            var currentVal = evaluateBoolean(config.updateModel, val, event, config);
	            if (currentVal) setAttr(model, modelAttr, val, options, config);
	          };
	          var sel = selector === ':el'? '' : selector;
	          this.$el.on(eventName, sel, _.bind(listener, this));
	        }, this);
	
	        // Setup a `change:modelAttr` observer to keep the view element in sync.
	        // `modelAttr` may be an array of attributes or a single string value.
	        _.each(_.flatten([modelAttr]), function(attr) {
	          observeModelEvent(model, 'change:' + attr, config, function(m, val, options) {
	            var changeId = options && options.stickitChange && options.stickitChange.bindId;
	            if (changeId !== bindId) {
	              var currentVal = getAttr(model, modelAttr, config);
	              updateViewBindEl($el, config, currentVal, model);
	            }
	          });
	        });
	
	        var currentVal = getAttr(model, modelAttr, config);
	        updateViewBindEl($el, config, currentVal, model, true);
	      }
	
	      // After each binding is setup, call the `initialize` callback.
	      applyViewFn.call(this, config.initialize, $el, model, config);
	    }
	  };
	
	  _.extend(Backbone.View.prototype, Stickit.ViewMixin);
	
	  // Helpers
	  // -------
	
	  var slice = [].slice;
	
	  // Evaluates the given `path` (in object/dot-notation) relative to the given
	  // `obj`. If the path is null/undefined, then the given `obj` is returned.
	  var evaluatePath = function(obj, path) {
	    var parts = (path || '').split('.');
	    var result = _.reduce(parts, function(memo, i) { return memo[i]; }, obj);
	    return result == null ? obj : result;
	  };
	
	  // If the given `fn` is a string, then view[fn] is called, otherwise it is
	  // a function that should be executed.
	  var applyViewFn = function(fn) {
	    fn = _.isString(fn) ? evaluatePath(this, fn) : fn;
	    if (fn) return (fn).apply(this, slice.call(arguments, 1));
	  };
	
	  // Given a function, string (view function reference), or a boolean
	  // value, returns the truthy result. Any other types evaluate as false.
	  // The first argument must be `reference` and the last must be `config`, but
	  // middle arguments can be variadic.
	  var evaluateBoolean = function(reference, val, config) {
	    if (_.isBoolean(reference)) {
	      return reference;
	    } else if (_.isFunction(reference) || _.isString(reference)) {
	      var view = _.last(arguments).view;
	      return applyViewFn.apply(view, arguments);
	    }
	    return false;
	  };
	
	  // Setup a model event binding with the given function, and track the event
	  // in the view's _modelBindings.
	  var observeModelEvent = function(model, event, config, fn) {
	    var view = config.view;
	    model.on(event, fn, view);
	    view._modelBindings.push({model:model, event:event, fn:fn, config:config});
	  };
	
	  // Prepares the given `val`ue and sets it into the `model`.
	  var setAttr = function(model, attr, val, options, config) {
	    var value = {}, view = config.view;
	    if (config.onSet) {
	      val = applyViewFn.call(view, config.onSet, val, config);
	    }
	
	    if (config.set) {
	      applyViewFn.call(view, config.set, attr, val, options, config);
	    } else {
	      value[attr] = val;
	      // If `observe` is defined as an array and `onSet` returned
	      // an array, then map attributes to their values.
	      if (_.isArray(attr) && _.isArray(val)) {
	        value = _.reduce(attr, function(memo, attribute, index) {
	          memo[attribute] = _.has(val, index) ? val[index] : null;
	          return memo;
	        }, {});
	      }
	      model.set(value, options);
	    }
	  };
	
	  // Returns the given `attr`'s value from the `model`, escaping and
	  // formatting if necessary. If `attr` is an array, then an array of
	  // respective values will be returned.
	  var getAttr = function(model, attr, config) {
	    var view = config.view;
	    var retrieveVal = function(field) {
	      return model[config.escape ? 'escape' : 'get'](field);
	    };
	    var sanitizeVal = function(val) {
	      return val == null ? '' : val;
	    };
	    var val = _.isArray(attr) ? _.map(attr, retrieveVal) : retrieveVal(attr);
	    if (config.onGet) val = applyViewFn.call(view, config.onGet, val, config);
	    return _.isArray(val) ? _.map(val, sanitizeVal) : sanitizeVal(val);
	  };
	
	  // Find handlers in `Backbone.Stickit._handlers` with selectors that match
	  // `$el` and generate a configuration by mixing them in the order that they
	  // were found with the given `binding`.
	  var getConfiguration = Stickit.getConfiguration = function($el, binding) {
	    var handlers = [{
	      updateModel: false,
	      updateMethod: 'text',
	      update: function($el, val, m, opts) { if ($el[opts.updateMethod]) $el[opts.updateMethod](val); },
	      getVal: function($el, e, opts) { return $el[opts.updateMethod](); }
	    }];
	    handlers = handlers.concat(_.filter(Stickit._handlers, function(handler) {
	      return $el.is(handler.selector);
	    }));
	    handlers.push(binding);
	
	    // Merge handlers into a single config object. Last props in wins.
	    var config = _.extend.apply(_, handlers);
	
	    // `updateView` is defaulted to false for configutrations with
	    // `visible`; otherwise, `updateView` is defaulted to true.
	    if (!_.has(config, 'updateView')) config.updateView = !config.visible;
	    return config;
	  };
	
	  // Setup the attributes configuration - a list that maps an attribute or
	  // property `name`, to an `observe`d model attribute, using an optional
	  // `onGet` formatter.
	  //
	  //     attributes: [{
	  //       name: 'attributeOrPropertyName',
	  //       observe: 'modelAttrName'
	  //       onGet: function(modelAttrVal, modelAttrName) { ... }
	  //     }, ...]
	  //
	  var initializeAttributes = function($el, config, model, modelAttr) {
	    var props = ['autofocus', 'autoplay', 'async', 'checked', 'controls',
	      'defer', 'disabled', 'hidden', 'indeterminate', 'loop', 'multiple',
	      'open', 'readonly', 'required', 'scoped', 'selected'];
	
	    var view = config.view;
	
	    _.each(config.attributes || [], function(attrConfig) {
	      attrConfig = _.clone(attrConfig);
	      attrConfig.view = view;
	
	      var lastClass = '';
	      var observed = attrConfig.observe || (attrConfig.observe = modelAttr);
	      var updateAttr = function() {
	        var updateType = _.contains(props, attrConfig.name) ? 'prop' : 'attr',
	            val = getAttr(model, observed, attrConfig);
	
	        // If it is a class then we need to remove the last value and add the new.
	        if (attrConfig.name === 'class') {
	          $el.removeClass(lastClass).addClass(val);
	          lastClass = val;
	        } else {
	          $el[updateType](attrConfig.name, val);
	        }
	      };
	
	      _.each(_.flatten([observed]), function(attr) {
	        observeModelEvent(model, 'change:' + attr, config, updateAttr);
	      });
	
	      // Initialize the matched element's state.
	      updateAttr();
	    });
	  };
	
	  var initializeClasses = function($el, config, model, modelAttr) {
	    _.each(config.classes || [], function(classConfig, name) {
	      if (_.isString(classConfig)) classConfig = {observe: classConfig};
	      classConfig.view = config.view;
	
	      var observed = classConfig.observe;
	      var updateClass = function() {
	        var val = getAttr(model, observed, classConfig);
	        $el.toggleClass(name, !!val);
	      };
	
	      _.each(_.flatten([observed]), function(attr) {
	        observeModelEvent(model, 'change:' + attr, config, updateClass);
	      });
	      updateClass();
	    });
	  };
	
	  // If `visible` is configured, then the view element will be shown/hidden
	  // based on the truthiness of the modelattr's value or the result of the
	  // given callback. If a `visibleFn` is also supplied, then that callback
	  // will be executed to manually handle showing/hiding the view element.
	  //
	  //     observe: 'isRight',
	  //     visible: true, // or function(val, options) {}
	  //     visibleFn: function($el, isVisible, options) {} // optional handler
	  //
	  var initializeVisible = function($el, config, model, modelAttr) {
	    if (config.visible == null) return;
	    var view = config.view;
	
	    var visibleCb = function() {
	      var visible = config.visible,
	          visibleFn = config.visibleFn,
	          val = getAttr(model, modelAttr, config),
	          isVisible = !!val;
	
	      // If `visible` is a function then it should return a boolean result to show/hide.
	      if (_.isFunction(visible) || _.isString(visible)) {
	        isVisible = !!applyViewFn.call(view, visible, val, config);
	      }
	
	      // Either use the custom `visibleFn`, if provided, or execute the standard show/hide.
	      if (visibleFn) {
	        applyViewFn.call(view, visibleFn, $el, isVisible, config);
	      } else {
	        $el.toggle(isVisible);
	      }
	    };
	
	    _.each(_.flatten([modelAttr]), function(attr) {
	      observeModelEvent(model, 'change:' + attr, config, visibleCb);
	    });
	
	    visibleCb();
	  };
	
	  // Update the value of `$el` using the given configuration and trigger the
	  // `afterUpdate` callback. This action may be blocked by `config.updateView`.
	  //
	  //     update: function($el, val, model, options) {},  // handler for updating
	  //     updateView: true, // defaults to true
	  //     afterUpdate: function($el, val, options) {} // optional callback
	  //
	  var updateViewBindEl = function($el, config, val, model, isInitializing) {
	    var view = config.view;
	    if (!evaluateBoolean(config.updateView, val, config)) return;
	    applyViewFn.call(view, config.update, $el, val, model, config);
	    if (!isInitializing) applyViewFn.call(view, config.afterUpdate, $el, val, config);
	  };
	
	  // Default Handlers
	  // ----------------
	
	  Stickit.addHandler([{
	    selector: '[contenteditable]',
	    updateMethod: 'html',
	    events: ['input', 'change']
	  }, {
	    selector: 'input',
	    events: ['propertychange', 'input', 'change'],
	    update: function($el, val) { $el.val(val); },
	    getVal: function($el) {
	      return $el.val();
	    }
	  }, {
	    selector: 'textarea',
	    events: ['propertychange', 'input', 'change'],
	    update: function($el, val) { $el.val(val); },
	    getVal: function($el) { return $el.val(); }
	  }, {
	    selector: 'input[type="radio"]',
	    events: ['change'],
	    update: function($el, val) {
	      $el.filter('[value="'+val+'"]').prop('checked', true);
	    },
	    getVal: function($el) {
	      return $el.filter(':checked').val();
	    }
	  }, {
	    selector: 'input[type="checkbox"]',
	    events: ['change'],
	    update: function($el, val, model, options) {
	      if ($el.length > 1) {
	        // There are multiple checkboxes so we need to go through them and check
	        // any that have value attributes that match what's in the array of `val`s.
	        val || (val = []);
	        $el.each(function(i, el) {
	          var checkbox = Backbone.$(el);
	          var checked = _.contains(val, checkbox.val());
	          checkbox.prop('checked', checked);
	        });
	      } else {
	        var checked = _.isBoolean(val) ? val : val === $el.val();
	        $el.prop('checked', checked);
	      }
	    },
	    getVal: function($el) {
	      var val;
	      if ($el.length > 1) {
	        val = _.reduce($el, function(memo, el) {
	          var checkbox = Backbone.$(el);
	          if (checkbox.prop('checked')) memo.push(checkbox.val());
	          return memo;
	        }, []);
	      } else {
	        val = $el.prop('checked');
	        // If the checkbox has a value attribute defined, then
	        // use that value. Most browsers use "on" as a default.
	        var boxval = $el.val();
	        if (boxval !== 'on' && boxval != null) {
	          val = val ? $el.val() : null;
	        }
	      }
	      return val;
	    }
	  }, {
	    selector: 'select',
	    events: ['change'],
	    update: function($el, val, model, options) {
	      var optList,
	        selectConfig = options.selectOptions,
	        list = selectConfig && selectConfig.collection || undefined,
	        isMultiple = $el.prop('multiple');
	
	      // If there are no `selectOptions` then we assume that the `<select>`
	      // is pre-rendered and that we need to generate the collection.
	      if (!selectConfig) {
	        selectConfig = {};
	        var getList = function($el) {
	          return $el.map(function(index, option) {
	            // Retrieve the text and value of the option, preferring "stickit-bind-val"
	            // data attribute over value property.
	            var dataVal = Backbone.$(option).data('stickit-bind-val');
	            return {
	              value: dataVal !== undefined ? dataVal : option.value,
	              label: option.text
	            };
	          }).get();
	        };
	        if ($el.find('optgroup').length) {
	          list = {opt_labels:[]};
	          // Search for options without optgroup
	          if ($el.find('> option').length) {
	            list.opt_labels.push(undefined);
	            _.each($el.find('> option'), function(el) {
	              list[undefined] = getList(Backbone.$(el));
	            });
	          }
	          _.each($el.find('optgroup'), function(el) {
	            var label = Backbone.$(el).attr('label');
	            list.opt_labels.push(label);
	            list[label] = getList(Backbone.$(el).find('option'));
	          });
	        } else {
	          list = getList($el.find('option'));
	        }
	      }
	
	      // Fill in default label and path values.
	      selectConfig.valuePath = selectConfig.valuePath || 'value';
	      selectConfig.labelPath = selectConfig.labelPath || 'label';
	      selectConfig.disabledPath = selectConfig.disabledPath || 'disabled';
	
	      var addSelectOptions = function(optList, $el, fieldVal) {
	        _.each(optList, function(obj) {
	          var option = Backbone.$('<option/>'), optionVal = obj;
	
	          var fillOption = function(text, val, disabled) {
	            option.text(text);
	            optionVal = val;
	            // Save the option value as data so that we can reference it later.
	            option.data('stickit-bind-val', optionVal);
	            if (!_.isArray(optionVal) && !_.isObject(optionVal)) option.val(optionVal);
	
	            if (disabled === true) option.prop('disabled', 'disabled');
	          };
	
	          var text, val, disabled;
	          if (obj === '__default__') {
	            text = fieldVal.label,
	            val = fieldVal.value,
	            disabled = fieldVal.disabled;
	          } else {
	            text = evaluatePath(obj, selectConfig.labelPath),
	            val = evaluatePath(obj, selectConfig.valuePath),
	            disabled = evaluatePath(obj, selectConfig.disabledPath);
	          }
	          fillOption(text, val, disabled);
	
	          // Determine if this option is selected.
	          var isSelected = function() {
	            if (!isMultiple && optionVal != null && fieldVal != null && optionVal === fieldVal) {
	              return true;
	            } else if (_.isObject(fieldVal) && _.isEqual(optionVal, fieldVal)) {
	              return true;
	            }
	            return false;
	          };
	
	          if (isSelected()) {
	            option.prop('selected', true);
	          } else if (isMultiple && _.isArray(fieldVal)) {
	            _.each(fieldVal, function(val) {
	              if (_.isObject(val)) val = evaluatePath(val, selectConfig.valuePath);
	              if (val === optionVal || (_.isObject(val) && _.isEqual(optionVal, val)))
	                option.prop('selected', true);
	            });
	          }
	
	          $el.append(option);
	        });
	      };
	
	      $el.find('*').remove();
	
	      // The `list` configuration is a function that returns the options list or a string
	      // which represents the path to the list relative to `window` or the view/`this`.
	      if (_.isString(list)) {
	        var context = window;
	        if (list.indexOf('this.') === 0) context = this;
	        list = list.replace(/^[a-z]*\.(.+)$/, '$1');
	        optList = evaluatePath(context, list);
	      } else if (_.isFunction(list)) {
	        optList = applyViewFn.call(this, list, $el, options);
	      } else {
	        optList = list;
	      }
	
	      // Support Backbone.Collection and deserialize.
	      if (optList instanceof Backbone.Collection) {
	        var collection = optList;
	        var refreshSelectOptions = function() {
	          var currentVal = getAttr(model, options.observe, options);
	          applyViewFn.call(this, options.update, $el, currentVal, model, options);
	        };
	        // We need to call this function after unstickit and after an update so we don't end up
	        // with multiple listeners doing the same thing
	        var removeCollectionListeners = function() {
	          collection.off('add remove reset sort', refreshSelectOptions);
	        };
	        var removeAllListeners = function() {
	          removeCollectionListeners();
	          collection.off('stickit:selectRefresh');
	          model.off('stickit:selectRefresh');
	        };
	        // Remove previously set event listeners by triggering a custom event
	        collection.trigger('stickit:selectRefresh');
	        collection.once('stickit:selectRefresh', removeCollectionListeners, this);
	
	        // Listen to the collection and trigger an update of the select options
	        collection.on('add remove reset sort', refreshSelectOptions, this);
	
	        // Remove the previous model event listener
	        model.trigger('stickit:selectRefresh');
	        model.once('stickit:selectRefresh', function() {
	          model.off('stickit:unstuck', removeAllListeners);
	        });
	        // Remove collection event listeners once this binding is unstuck
	        model.once('stickit:unstuck', removeAllListeners, this);
	        optList = optList.toJSON();
	      }
	
	      if (selectConfig.defaultOption) {
	        var option = _.isFunction(selectConfig.defaultOption) ?
	          selectConfig.defaultOption.call(this, $el, options) :
	          selectConfig.defaultOption;
	        addSelectOptions(["__default__"], $el, option);
	      }
	
	      if (_.isArray(optList)) {
	        addSelectOptions(optList, $el, val);
	      } else if (optList.opt_labels) {
	        // To define a select with optgroups, format selectOptions.collection as an object
	        // with an 'opt_labels' property, as in the following:
	        //
	        //     {
	        //       'opt_labels': ['Looney Tunes', 'Three Stooges'],
	        //       'Looney Tunes': [{id: 1, name: 'Bugs Bunny'}, {id: 2, name: 'Donald Duck'}],
	        //       'Three Stooges': [{id: 3, name : 'moe'}, {id: 4, name : 'larry'}, {id: 5, name : 'curly'}]
	        //     }
	        //
	        _.each(optList.opt_labels, function(label) {
	          var $group = Backbone.$('<optgroup/>').attr('label', label);
	          addSelectOptions(optList[label], $group, val);
	          $el.append($group);
	        });
	        // With no 'opt_labels' parameter, the object is assumed to be a simple value-label map.
	        // Pass a selectOptions.comparator to override the default order of alphabetical by label.
	      } else {
	        var opts = [], opt;
	        for (var i in optList) {
	          opt = {};
	          opt[selectConfig.valuePath] = i;
	          opt[selectConfig.labelPath] = optList[i];
	          opts.push(opt);
	        }
	        opts = _.sortBy(opts, selectConfig.comparator || selectConfig.labelPath);
	        addSelectOptions(opts, $el, val);
	      }
	    },
	    getVal: function($el) {
	      var selected = $el.find('option:selected');
	
	      if ($el.prop('multiple')) {
	        return _.map(selected, function(el) {
	          return Backbone.$(el).data('stickit-bind-val');
	        });
	      } else {
	        return selected.data('stickit-bind-val');
	      }
	    }
	  }]);
	
	  return Stickit;
	
	}));


/***/ },
/* 65 */
/***/ function(module, exports) {

	// removed by extract-text-webpack-plugin

/***/ },
/* 66 */,
/* 67 */
/***/ function(module, exports) {

	module.exports = "<div class=\"row\" id=\"input\">\n    <div class=\"container-fluid\">\n        <div class=\"row\">\n            <div class=\"col-md-10\">\n                <h3 class=\"page-header\">\n                    <span><%- displayName %></span>\n                    <span><button class=\"btn btn-secondary\" id=\"reset-button\" type=\"button\">Reset</button></span>\n                </h3>\n            </div>\n        </div>\n        <div class=\"row values-row\">\n            <div id=\"values\"></div>\n        </div>\n        <div class=\"row\">\n            <form class=\"form-horizontal\">\r\n                <div class=\"form-group\">\r\n                    <!--<label for=\"text\" class=\"col-sm-offset-2 col-sm-2 control-label\">Text:</label>\r\n                <div class=\"col-sm-6 \">\r\n                    <input type=\"text\" class=\"form-control\" id=\"text\" placeholder=\"Text\">\r\n                </div>-->\r\n                    <div class=\"col-md-2\">&nbsp;</div>\r\n                    <div class=\"col-md-8\">\r\n                        <textarea class=\"form-control\" placeholder=\"Enter text\" rows=\"10\"></textarea>\r\n                    </div>\r\n                    <div class=\"col-md-2\">&nbsp;</div>\r\n                </div>\r\n            </form>\r\n        </div>\r\n    </div>\n</div>\n"

/***/ },
/* 68 */
/***/ function(module, exports) {

	module.exports = "<div class=\"container-fluid\" id=\"input\">\n    <div class=\"row\" id=\"input-navigation\">\n        <div class=\"col-md-2\"><button class=\"btn btn-primary\" id=\"back-button\" type=\"button\">Previous</button></div>\n        <div class=\"col-md-8\">&nbsp;</div>\n        <div class=\"col-md-2\"><button class=\"btn btn-primary\" id=\"next-button\" type=\"button\">Next</button></div>\n    </div>\n    <div class=\"row\" id=\"input-child\"></div>\n</div>\n"

/***/ },
/* 69 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var _ = __webpack_require__(3);
	var application_1 = __webpack_require__(1);
	var Marionette = __webpack_require__(5);
	var worksheet_navigation_view_1 = __webpack_require__(70);
	var worksheet_output_view_1 = __webpack_require__(71);
	__webpack_require__(75);
	var WorksheetSidebarView = (function (_super) {
	    __extends(WorksheetSidebarView, _super);
	    function WorksheetSidebarView(options) {
	        _super.call(this, _.extend(options, {
	            events: {
	                "click #changeAccessionNumberButton": "onClickChangeAccessionNumberButton"
	            },
	            regions: {
	                navigation: "#navigation",
	                output: "#output"
	            },
	            template: _.template(__webpack_require__(77))
	        }));
	    }
	    WorksheetSidebarView.prototype.onBeforeShow = function () {
	        this.showChildView("navigation", new worksheet_navigation_view_1.WorksheetNavigationView({ model: this.model }));
	        this.showChildView("output", new worksheet_output_view_1.WorksheetOutputView({ model: this.model }));
	    };
	    WorksheetSidebarView.prototype.onClickChangeAccessionNumberButton = function () {
	        application_1.Application.instance.router.navigate("worksheet");
	        window.location.reload();
	    };
	    WorksheetSidebarView.prototype.serializeData = function () {
	        return { "accessionNumber": this.model.accessionNumber };
	    };
	    return WorksheetSidebarView;
	}(Marionette.LayoutView));
	exports.WorksheetSidebarView = WorksheetSidebarView;


/***/ },
/* 70 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var _ = __webpack_require__(3);
	var application_1 = __webpack_require__(1);
	var Marionette = __webpack_require__(5);
	var worksheet_feature_input_event_1 = __webpack_require__(47);
	var worksheet_feature_navigation_event_1 = __webpack_require__(49);
	var WorksheetNavigationView = (function (_super) {
	    __extends(WorksheetNavigationView, _super);
	    function WorksheetNavigationView(options) {
	        _super.call(this, _.extend(options, {
	            template: _.template("")
	        }));
	        this._tree = [];
	        this._nodeId = 0;
	        this._featureCidToNodeIdMap = {};
	        for (var _i = 0, _a = this.model.rootFeatureSet.childFeatureSets.models; _i < _a.length; _i++) {
	            var featureSet = _a[_i];
	            this._tree.push(this.__constructFeatureSetTree(featureSet));
	        }
	        _.bindAll(this, "onNodeSelected");
	    }
	    WorksheetNavigationView.prototype.initialize = function () {
	        this.listenTo(application_1.Application.instance.radio.globalChannel, worksheet_feature_input_event_1.WorksheetFeatureInputEvent.NAME, this.onFeatureInput);
	        this.listenTo(application_1.Application.instance.radio.globalChannel, worksheet_feature_navigation_event_1.WorksheetFeatureNavigationEvent.NAME, this.onFeatureNavigation);
	    };
	    WorksheetNavigationView.prototype.onBeforeShow = function () {
	        this.$el.treeview({
	            data: this._tree,
	            levels: 0,
	            onNodeSelected: this.onNodeSelected
	        });
	    };
	    WorksheetNavigationView.prototype.onFeatureInput = function (event) {
	        var treeview = this.__treeview;
	        var nodeId = this._featureCidToNodeIdMap[event.feature.cid];
	        var node = treeview.getNode(nodeId);
	        if (node.feature.id != event.feature.id) {
	            throw new Error("map mismatch");
	        }
	        if (event.feature.currentState) {
	            node["icon"] = "glyphicon glyphicon-check";
	        }
	        else {
	            delete node["icon"];
	        }
	        treeview.selectNode(nodeId); // Force re-render
	    };
	    WorksheetNavigationView.prototype.onFeatureNavigation = function (event) {
	        var nodeId = this._featureCidToNodeIdMap[event.feature.cid];
	        this.__treeview.selectNode(nodeId);
	    };
	    WorksheetNavigationView.prototype.onNodeSelected = function (event, node) {
	        if (node.feature) {
	            application_1.Application.instance.radio.globalChannel.trigger(worksheet_feature_navigation_event_1.WorksheetFeatureNavigationEvent.NAME, new worksheet_feature_navigation_event_1.WorksheetFeatureNavigationEvent({ feature: node.feature }));
	        }
	        else {
	            var treeview = this.__treeview;
	            treeview.toggleNodeExpanded(node.nodeId, { silent: true });
	            treeview.unselectNode(node.nodeId, { silent: true });
	        }
	        return true;
	    };
	    WorksheetNavigationView.prototype.__constructFeatureSetTree = function (featureSet) {
	        var tree = { ddId: this._nodeId++, text: featureSet.displayName };
	        var nodes = [];
	        if (featureSet.childFeatureSets) {
	            for (var _i = 0, _a = featureSet.childFeatureSets.models; _i < _a.length; _i++) {
	                var childFeatureSet = _a[_i];
	                nodes.push(this.__constructFeatureSetTree(childFeatureSet));
	            }
	        }
	        if (featureSet.features) {
	            for (var _b = 0, _c = featureSet.features.models; _b < _c.length; _b++) {
	                var feature = _c[_b];
	                var node = {
	                    feature: feature,
	                    ddId: this._nodeId++,
	                    icon: feature.currentState ? "glyphicon glyphicon-check" : undefined,
	                    text: feature.displayName,
	                    state: {
	                        selected: feature.selected
	                    }
	                };
	                this._featureCidToNodeIdMap[feature.cid] = node.ddId;
	                nodes.push(node);
	            }
	        }
	        if (nodes.length > 0) {
	            tree["nodes"] = nodes;
	        }
	        return tree;
	    };
	    Object.defineProperty(WorksheetNavigationView.prototype, "__treeview", {
	        get: function () {
	            return this.$el.treeview(true);
	        },
	        enumerable: true,
	        configurable: true
	    });
	    return WorksheetNavigationView;
	}(Marionette.ItemView));
	exports.WorksheetNavigationView = WorksheetNavigationView;


/***/ },
/* 71 */
/***/ function(module, exports, __webpack_require__) {

	"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var _ = __webpack_require__(3);
	var application_1 = __webpack_require__(1);
	var Marionette = __webpack_require__(5);
	var worksheet_feature_input_event_1 = __webpack_require__(47);
	var worksheet_feature_navigation_event_1 = __webpack_require__(49);
	__webpack_require__(72);
	var WorksheetOutputView = (function (_super) {
	    __extends(WorksheetOutputView, _super);
	    function WorksheetOutputView(options) {
	        _super.call(this, _.extend(options, {
	            events: {
	                "click .feature-name a": "onClickFeatureName",
	                "click #csv": "onClickCsv"
	            },
	            id: "output",
	            template: _.template(__webpack_require__(74))
	        }));
	    }
	    WorksheetOutputView.prototype.initialize = function () {
	        this._output = this.__calculateOutput();
	        this.listenTo(application_1.Application.instance.radio.globalChannel, worksheet_feature_input_event_1.WorksheetFeatureInputEvent.NAME, this.onFeatureInput);
	    };
	    WorksheetOutputView.prototype.onClickCsv = function () {
	        var csv = "Feature name,Feature value\n";
	        for (var outputKey in this._output) {
	            for (var _i = 0, _a = this._output[outputKey].values; _i < _a.length; _i++) {
	                var outputValue = _a[_i];
	                csv += this.__escapeCsv(outputKey) + "," + this.__escapeCsv(outputValue) + "\n";
	            }
	        }
	        this.__download(csv, this.model.accessionNumber + ".csv", "text/csv");
	    };
	    WorksheetOutputView.prototype.onClickFeatureName = function (event) {
	        application_1.Application.instance.radio.globalChannel.trigger(worksheet_feature_navigation_event_1.WorksheetFeatureNavigationEvent.NAME, new worksheet_feature_navigation_event_1.WorksheetFeatureNavigationEvent({ feature: this._output[event.target.innerText].feature }));
	    };
	    WorksheetOutputView.prototype.onFeatureInput = function (event) {
	        this._output = this.__calculateOutput();
	        this.render();
	    };
	    WorksheetOutputView.prototype.serializeData = function () {
	        if (!_.isEmpty(this._output)) {
	            return { output: this._output };
	        }
	        else {
	            return { output: undefined };
	        }
	    };
	    WorksheetOutputView.prototype.__calculateOutput = function () {
	        var output = this.__calculateFeatureSetOutput(this.model.rootFeatureSet);
	        console.info("output: " + JSON.stringify(output));
	        return output;
	    };
	    WorksheetOutputView.prototype.__calculateFeatureSetOutput = function (featureSet) {
	        var output = {};
	        for (var _i = 0, _a = featureSet.childFeatureSets.models; _i < _a.length; _i++) {
	            var childFeatureSet = _a[_i];
	            var childOutput = this.__calculateFeatureSetOutput(childFeatureSet);
	            //for (var key in childOutput) {
	            //    output[featureSet.displayName + " &lt; " + key] = childOutput[key];
	            //}
	            output = _.extend(output, childOutput);
	        }
	        for (var _b = 0, _c = featureSet.features.models; _b < _c.length; _b++) {
	            var feature = _c[_b];
	            var childOutput = this.__calculateFeatureOutput(feature);
	            //for (var key in childOutput) {
	            //    output[featureSet.displayName + " &lt; " + key] = childOutput[key];
	            //}    
	            output = _.extend(output, childOutput);
	        }
	        return output;
	    };
	    WorksheetOutputView.prototype.__calculateFeatureOutput = function (feature) {
	        var values = feature.outputValues;
	        if (values.length == 0) {
	            return {};
	        }
	        var output = {};
	        output[feature.displayName] = { feature: feature, values: values };
	        return output;
	    };
	    // Adapted from https://stackoverflow.com/questions/14964035/how-to-export-javascript-array-info-to-csv-on-client-side
	    WorksheetOutputView.prototype.__download = function (content, fileName, mimeType) {
	        var a = document.createElement('a');
	        mimeType = mimeType || 'application/octet-stream';
	        if (navigator.msSaveBlob) {
	            return navigator.msSaveBlob(new Blob([content], { type: mimeType }), fileName);
	        }
	        else if ('download' in a) {
	            a.href = 'data:' + mimeType + ',' + encodeURIComponent(content);
	            a.setAttribute('download', fileName);
	            document.body.appendChild(a);
	            a.click();
	            document.body.removeChild(a);
	            return true;
	        }
	        else {
	            var f = document.createElement('iframe');
	            document.body.appendChild(f);
	            f.src = 'data:' + mimeType + ',' + encodeURIComponent(content);
	            setTimeout(function () {
	                document.body.removeChild(f);
	            }, 333);
	            return true;
	        }
	    };
	    WorksheetOutputView.prototype.__escapeCsv = function (cell) {
	        return '"' + cell.replace(/"/g, '""') + '"';
	    };
	    return WorksheetOutputView;
	}(Marionette.ItemView));
	exports.WorksheetOutputView = WorksheetOutputView;


/***/ },
/* 72 */
/***/ function(module, exports) {

	// removed by extract-text-webpack-plugin

/***/ },
/* 73 */,
/* 74 */
/***/ function(module, exports) {

	module.exports = "<% if (output) { %>\n    <% for (var outputKey in output) { _.each(output[outputKey].values, function(outputValue) { %>\n    <div class=\"row\">\n        <div class=\"col-md-4 feature-name\"><a><%- outputKey %></a></div>\n        <div class=\"col-md-8 feature-value\"><%- outputValue %></div>\n    </div>\n    <% }); } %>\n    <div class=\"row\">\n        <div class=\"col-md-4\"></div>\n        <div class=\"col-md-8\"><a id=\"csv\">Download as CSV</a></div>\n    </div>\n<% } else { %>\nSelect values on the right to generate a description.\n<% } %>\n"

/***/ },
/* 75 */
/***/ function(module, exports) {

	// removed by extract-text-webpack-plugin

/***/ },
/* 76 */,
/* 77 */
/***/ function(module, exports) {

	module.exports = "<div class=\"panel-group\" id=\"sidebar\" role=\"tablist\" aria-multiselectable=\"true\">\n    <div class=\"panel panel-default\">\n        <div class=\"panel-heading\" role=\"tab\" id=\"headingOne\">\n            <h4 class=\"panel-title\">\n                <a role=\"button\" data-toggle=\"collapse\" href=\"#collapseOne\" aria-expanded=\"true\" aria-controls=\"collapseOne\">\n                    Accession number: <%- accessionNumber %>\n                </a>\n                <button type=\"button\" class=\"btn btn-primary\" id=\"changeAccessionNumberButton\">Change</button>\n            </h4>\n        </div>\n        <div id=\"collapseOne\" class=\"panel-collapse collapse in\" role=\"tabpanel\" aria-labelledby=\"headingOne\">\n            <div class=\"panel-body\" id=\"output\">\n            </div>\n        </div>\n    </div>\n    <div class=\"panel panel-default\">\n        <div class=\"panel-heading\" role=\"tab\" id=\"headingTwo\">\n            <h4 class=\"panel-title\">\n                <a class=\"collapsed\" role=\"button\" data-toggle=\"collapse\" href=\"#collapseTwo\" aria-expanded=\"true\" aria-controls=\"collapseTwo\">\n                    Features\n                </a>\n            </h4>\n        </div>\n        <div id=\"collapseTwo\" class=\"panel-collapse collapse in\" role=\"tabpanel\" aria-labelledby=\"headingTwo\">\n            <div class=\"panel-body\" id=\"navigation\">\n            </div>\n        </div>\n    </div>\n</div>\n"

/***/ },
/* 78 */
/***/ function(module, exports) {

	// removed by extract-text-webpack-plugin

/***/ },
/* 79 */,
/* 80 */
/***/ function(module, exports) {

	module.exports = "<div class=\"container-fluid\" id=\"worksheet\">\n    <div class=\"row\" id=\"two-columns\">\n        <div class=\"col-md-4\" id=\"left-column\"></div>\n        <div class=\"col-md-8\" id=\"right-column\"></div>\n    </div>\n</div>\n"

/***/ },
/* 81 */
/***/ function(module, exports, __webpack_require__) {

	/* WEBPACK VAR INJECTION */(function($) {"use strict";
	var __extends = (this && this.__extends) || function (d, b) {
	    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
	    function __() { this.constructor = d; }
	    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
	};
	var Marionette = __webpack_require__(5);
	var ModalRegion = (function (_super) {
	    __extends(ModalRegion, _super);
	    function ModalRegion() {
	        _super.call(this, { el: "#modal" });
	        this._ensureElement();
	    }
	    ModalRegion.prototype.getEl = function (selector) {
	        var $el = $(selector);
	        $el.on("hidden.bs.modal", this.empty);
	        return $el;
	    };
	    ModalRegion.prototype.onEmpty = function () {
	        this.$el.modal('hide');
	    };
	    ModalRegion.prototype.onShow = function () {
	        this.$el.on('hidden.bs.modal', { region: this }, function (event) {
	            event.data.region.empty();
	        });
	        this.$el.modal('show');
	    };
	    return ModalRegion;
	}(Marionette.Region));
	exports.ModalRegion = ModalRegion;
	
	/* WEBPACK VAR INJECTION */}.call(exports, __webpack_require__(2)))

/***/ },
/* 82 */
/***/ function(module, exports, __webpack_require__) {

	/* WEBPACK VAR INJECTION */(function(_) {// Backbone.Validation v0.7.1
	//
	// Copyright (c) 2011-2012 Thomas Pedersen
	// Distributed under MIT License
	//
	// Documentation and full license available at:
	// http://thedersen.com/projects/backbone-validation
	Backbone.Validation=function(e){"use strict";var t={forceUpdate:!1,selector:"name",labelFormatter:"sentenceCase",valid:Function.prototype,invalid:Function.prototype},n={formatLabel:function(e,n){return a[t.labelFormatter](e,n)},format:function(){var e=Array.prototype.slice.call(arguments),t=e.shift();return t.replace(/\{(\d+)\}/g,function(t,n){return typeof e[n]!="undefined"?e[n]:t})}},r=function(t,n,i){return n=n||{},i=i||"",e.each(t,function(e,s){t.hasOwnProperty(s)&&(!e||typeof e!="object"||e instanceof Date||e instanceof RegExp?n[i+s]=e:r(e,n,i+s+"."))}),n},i=function(){var i=function(t){return e.reduce(e.keys(t.validation||{}),function(e,t){return e[t]=void 0,e},{})},o=function(t,n){var r=t.validation?t.validation[n]||{}:{};if(e.isFunction(r)||e.isString(r))r={fn:r};return e.isArray(r)||(r=[r]),e.reduce(r,function(t,n){return e.each(e.without(e.keys(n),"msg"),function(e){t.push({fn:f[e],val:n[e],msg:n.msg})}),t},[])},u=function(t,r,i,s){return e.reduce(o(t,r),function(o,u){var a=e.extend({},n,f),l=u.fn.call(a,i,r,u.val,t,s);return l===!1||o===!1?!1:l&&!o?u.msg||l:o},"")},a=function(t,n){var i,s={},o=!0,a=e.clone(n),f=r(n);return e.each(f,function(e,n){i=u(t,n,e,a),i&&(s[n]=i,o=!1)}),{invalidAttrs:s,isValid:o}},l=function(t,n){return{preValidate:function(t,n){return u(this,t,n,e.extend({},this.attributes))},isValid:function(t){var n=r(this.attributes);return e.isString(t)?!u(this,t,n[t],e.extend({},this.attributes)):e.isArray(t)?e.reduce(t,function(t,r){return t&&!u(this,r,n[r],e.extend({},this.attributes))},!0,this):(t===!0&&this.validate(),this.validation?this._isValid:!0)},validate:function(s,o){var u=this,f=!s,l=e.extend({},n,o),c=i(u),h=e.extend({},c,u.attributes,s),p=r(s||h),d=a(u,h);u._isValid=d.isValid,e.each(c,function(e,n){var r=d.invalidAttrs.hasOwnProperty(n);r||l.valid(t,n,l.selector)}),e.each(c,function(e,n){var r=d.invalidAttrs.hasOwnProperty(n),i=p.hasOwnProperty(n);r&&(i||f)&&l.invalid(t,n,d.invalidAttrs[n],l.selector)}),e.defer(function(){u.trigger("validated",u._isValid,u,d.invalidAttrs),u.trigger("validated:"+(u._isValid?"valid":"invalid"),u,d.invalidAttrs)});if(!l.forceUpdate&&e.intersection(e.keys(d.invalidAttrs),e.keys(p)).length>0)return d.invalidAttrs}}},c=function(t,n,r){e.extend(n,l(t,r))},h=function(e){delete e.validate,delete e.preValidate,delete e.isValid},p=function(e){c(this.view,e,this.options)},d=function(e){h(e)};return{version:"0.7.1",configure:function(n){e.extend(t,n)},bind:function(n,r){var i=n.model,o=n.collection;r=e.extend({},t,s,r);if(typeof i=="undefined"&&typeof o=="undefined")throw"Before you execute the binding your view must have a model or a collection.\nSee http://thedersen.com/projects/backbone-validation/#using-form-model-validation for more information.";i?c(n,i,r):o&&(o.each(function(e){c(n,e,r)}),o.bind("add",p,{view:n,options:r}),o.bind("remove",d))},unbind:function(e){var t=e.model,n=e.collection;t&&h(e.model),n&&(n.each(function(e){h(e)}),n.unbind("add",p),n.unbind("remove",d))},mixin:l(null,t)}}(),s=i.callbacks={valid:function(e,t,n){e.$("["+n+'~="'+t+'"]').removeClass("invalid").removeAttr("data-error")},invalid:function(e,t,n,r){e.$("["+r+'~="'+t+'"]').addClass("invalid").attr("data-error",n)}},o=i.patterns={digits:/^\d+$/,number:/^-?(?:\d+|\d{1,3}(?:,\d{3})+)(?:\.\d+)?$/,email:/^((([a-z]|\d|[!#\$%&'\*\+\-\/=\?\^_`{\|}~]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])+(\.([a-z]|\d|[!#\$%&'\*\+\-\/=\?\^_`{\|}~]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])+)*)|((\x22)((((\x20|\x09)*(\x0d\x0a))?(\x20|\x09)+)?(([\x01-\x08\x0b\x0c\x0e-\x1f\x7f]|\x21|[\x23-\x5b]|[\x5d-\x7e]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(\\([\x01-\x09\x0b\x0c\x0d-\x7f]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]))))*(((\x20|\x09)*(\x0d\x0a))?(\x20|\x09)+)?(\x22)))@((([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))\.)+(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))$/i,url:/^(https?|ftp):\/\/(((([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(%[\da-f]{2})|[!\$&'\(\)\*\+,;=]|:)*@)?(((\d|[1-9]\d|1\d\d|2[0-4]\d|25[0-5])\.(\d|[1-9]\d|1\d\d|2[0-4]\d|25[0-5])\.(\d|[1-9]\d|1\d\d|2[0-4]\d|25[0-5])\.(\d|[1-9]\d|1\d\d|2[0-4]\d|25[0-5]))|((([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))\.)+(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))\.?)(:\d*)?)(\/((([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(%[\da-f]{2})|[!\$&'\(\)\*\+,;=]|:|@)+(\/(([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(%[\da-f]{2})|[!\$&'\(\)\*\+,;=]|:|@)*)*)?)?(\?((([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(%[\da-f]{2})|[!\$&'\(\)\*\+,;=]|:|@)|[\uE000-\uF8FF]|\/|\?)*)?(\#((([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(%[\da-f]{2})|[!\$&'\(\)\*\+,;=]|:|@)|\/|\?)*)?$/i},u=i.messages={required:"{0} is required",acceptance:"{0} must be accepted",min:"{0} must be greater than or equal to {1}",max:"{0} must be less than or equal to {1}",range:"{0} must be between {1} and {2}",length:"{0} must be {1} characters",minLength:"{0} must be at least {1} characters",maxLength:"{0} must be at most {1} characters",rangeLength:"{0} must be between {1} and {2} characters",oneOf:"{0} must be one of: {1}",equalTo:"{0} must be the same as {1}",pattern:"{0} must be a valid {1}"},a=i.labelFormatters={none:function(e){return e},sentenceCase:function(e){return e.replace(/(?:^\w|[A-Z]|\b\w)/g,function(e,t){return t===0?e.toUpperCase():" "+e.toLowerCase()}).replace("_"," ")},label:function(e,t){return t.labels&&t.labels[e]||a.sentenceCase(e,t)}},f=i.validators=function(){var t=String.prototype.trim?function(e){return e===null?"":String.prototype.trim.call(e)}:function(e){var t=/^\s+/,n=/\s+$/;return e===null?"":e.toString().replace(t,"").replace(n,"")},n=function(t){return e.isNumber(t)||e.isString(t)&&t.match(o.number)},r=function(n){return!(e.isNull(n)||e.isUndefined(n)||e.isString(n)&&t(n)==="")};return{fn:function(t,n,r,i,s){return e.isString(r)&&(r=i[r]),r.call(i,t,n,s)},required:function(t,n,i,s,o){var a=e.isFunction(i)?i.call(s,t,n,o):i;if(!a&&!r(t))return!1;if(a&&!r(t))return this.format(u.required,this.formatLabel(n,s))},acceptance:function(t,n,r,i){if(t!=="true"&&(!e.isBoolean(t)||t===!1))return this.format(u.acceptance,this.formatLabel(n,i))},min:function(e,t,r,i){if(!n(e)||e<r)return this.format(u.min,this.formatLabel(t,i),r)},max:function(e,t,r,i){if(!n(e)||e>r)return this.format(u.max,this.formatLabel(t,i),r)},range:function(e,t,r,i){if(!n(e)||e<r[0]||e>r[1])return this.format(u.range,this.formatLabel(t,i),r[0],r[1])},length:function(e,n,i,s){if(!r(e)||t(e).length!==i)return this.format(u.length,this.formatLabel(n,s),i)},minLength:function(e,n,i,s){if(!r(e)||t(e).length<i)return this.format(u.minLength,this.formatLabel(n,s),i)},maxLength:function(e,n,i,s){if(!r(e)||t(e).length>i)return this.format(u.maxLength,this.formatLabel(n,s),i)},rangeLength:function(e,n,i,s){if(!r(e)||t(e).length<i[0]||t(e).length>i[1])return this.format(u.rangeLength,this.formatLabel(n,s),i[0],i[1])},oneOf:function(t,n,r,i){if(!e.include(r,t))return this.format(u.oneOf,this.formatLabel(n,i),r.join(", "))},equalTo:function(e,t,n,r,i){if(e!==i[n])return this.format(u.equalTo,this.formatLabel(t,r),this.formatLabel(n,r))},pattern:function(e,t,n,i){if(!r(e)||!e.toString().match(o[n]||n))return this.format(u.pattern,this.formatLabel(t,i),n)}}}();return i}(_);
	/* WEBPACK VAR INJECTION */}.call(exports, __webpack_require__(3)))

/***/ },
/* 83 */
/***/ function(module, exports) {

	// removed by extract-text-webpack-plugin

/***/ },
/* 84 */,
/* 85 */
/***/ function(module, exports, __webpack_require__) {

	var __WEBPACK_AMD_DEFINE_ARRAY__, __WEBPACK_AMD_DEFINE_RESULT__;/*!
	 * Bootstrap-select v1.12.1 (http://silviomoreto.github.io/bootstrap-select)
	 *
	 * Copyright 2013-2016 bootstrap-select
	 * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)
	 */
	!function(a,b){ true?!(__WEBPACK_AMD_DEFINE_ARRAY__ = [__webpack_require__(2)], __WEBPACK_AMD_DEFINE_RESULT__ = function(a){return b(a)}.apply(exports, __WEBPACK_AMD_DEFINE_ARRAY__), __WEBPACK_AMD_DEFINE_RESULT__ !== undefined && (module.exports = __WEBPACK_AMD_DEFINE_RESULT__)):"object"==typeof module&&module.exports?module.exports=b(require("jquery")):b(a.jQuery)}(this,function(a){!function(a){"use strict";function b(b){var c=[{re:/[\xC0-\xC6]/g,ch:"A"},{re:/[\xE0-\xE6]/g,ch:"a"},{re:/[\xC8-\xCB]/g,ch:"E"},{re:/[\xE8-\xEB]/g,ch:"e"},{re:/[\xCC-\xCF]/g,ch:"I"},{re:/[\xEC-\xEF]/g,ch:"i"},{re:/[\xD2-\xD6]/g,ch:"O"},{re:/[\xF2-\xF6]/g,ch:"o"},{re:/[\xD9-\xDC]/g,ch:"U"},{re:/[\xF9-\xFC]/g,ch:"u"},{re:/[\xC7-\xE7]/g,ch:"c"},{re:/[\xD1]/g,ch:"N"},{re:/[\xF1]/g,ch:"n"}];return a.each(c,function(){b=b?b.replace(this.re,this.ch):""}),b}function c(b){var c=arguments,d=b;[].shift.apply(c);var e,f=this.each(function(){var b=a(this);if(b.is("select")){var f=b.data("selectpicker"),g="object"==typeof d&&d;if(f){if(g)for(var h in g)g.hasOwnProperty(h)&&(f.options[h]=g[h])}else{var i=a.extend({},k.DEFAULTS,a.fn.selectpicker.defaults||{},b.data(),g);i.template=a.extend({},k.DEFAULTS.template,a.fn.selectpicker.defaults?a.fn.selectpicker.defaults.template:{},b.data().template,g.template),b.data("selectpicker",f=new k(this,i))}"string"==typeof d&&(e=f[d]instanceof Function?f[d].apply(f,c):f.options[d])}});return"undefined"!=typeof e?e:f}String.prototype.includes||!function(){var a={}.toString,b=function(){try{var a={},b=Object.defineProperty,c=b(a,a,a)&&b}catch(a){}return c}(),c="".indexOf,d=function(b){if(null==this)throw new TypeError;var d=String(this);if(b&&"[object RegExp]"==a.call(b))throw new TypeError;var e=d.length,f=String(b),g=f.length,h=arguments.length>1?arguments[1]:void 0,i=h?Number(h):0;i!=i&&(i=0);var j=Math.min(Math.max(i,0),e);return!(g+j>e)&&c.call(d,f,i)!=-1};b?b(String.prototype,"includes",{value:d,configurable:!0,writable:!0}):String.prototype.includes=d}(),String.prototype.startsWith||!function(){var a=function(){try{var a={},b=Object.defineProperty,c=b(a,a,a)&&b}catch(a){}return c}(),b={}.toString,c=function(a){if(null==this)throw new TypeError;var c=String(this);if(a&&"[object RegExp]"==b.call(a))throw new TypeError;var d=c.length,e=String(a),f=e.length,g=arguments.length>1?arguments[1]:void 0,h=g?Number(g):0;h!=h&&(h=0);var i=Math.min(Math.max(h,0),d);if(f+i>d)return!1;for(var j=-1;++j<f;)if(c.charCodeAt(i+j)!=e.charCodeAt(j))return!1;return!0};a?a(String.prototype,"startsWith",{value:c,configurable:!0,writable:!0}):String.prototype.startsWith=c}(),Object.keys||(Object.keys=function(a,b,c){c=[];for(b in a)c.hasOwnProperty.call(a,b)&&c.push(b);return c});var d={useDefault:!1,_set:a.valHooks.select.set};a.valHooks.select.set=function(b,c){return c&&!d.useDefault&&a(b).data("selected",!0),d._set.apply(this,arguments)};var e=null;a.fn.triggerNative=function(a){var b,c=this[0];c.dispatchEvent?("function"==typeof Event?b=new Event(a,{bubbles:!0}):(b=document.createEvent("Event"),b.initEvent(a,!0,!1)),c.dispatchEvent(b)):c.fireEvent?(b=document.createEventObject(),b.eventType=a,c.fireEvent("on"+a,b)):this.trigger(a)},a.expr.pseudos.icontains=function(b,c,d){var e=a(b),f=(e.data("tokens")||e.text()).toString().toUpperCase();return f.includes(d[3].toUpperCase())},a.expr.pseudos.ibegins=function(b,c,d){var e=a(b),f=(e.data("tokens")||e.text()).toString().toUpperCase();return f.startsWith(d[3].toUpperCase())},a.expr.pseudos.aicontains=function(b,c,d){var e=a(b),f=(e.data("tokens")||e.data("normalizedText")||e.text()).toString().toUpperCase();return f.includes(d[3].toUpperCase())},a.expr.pseudos.aibegins=function(b,c,d){var e=a(b),f=(e.data("tokens")||e.data("normalizedText")||e.text()).toString().toUpperCase();return f.startsWith(d[3].toUpperCase())};var f={"&":"&amp;","<":"&lt;",">":"&gt;",'"':"&quot;","'":"&#x27;","`":"&#x60;"},g={"&amp;":"&","&lt;":"<","&gt;":">","&quot;":'"',"&#x27;":"'","&#x60;":"`"},h=function(a){var b=function(b){return a[b]},c="(?:"+Object.keys(a).join("|")+")",d=RegExp(c),e=RegExp(c,"g");return function(a){return a=null==a?"":""+a,d.test(a)?a.replace(e,b):a}},i=h(f),j=h(g),k=function(b,c){d.useDefault||(a.valHooks.select.set=d._set,d.useDefault=!0),this.$element=a(b),this.$newElement=null,this.$button=null,this.$menu=null,this.$lis=null,this.options=c,null===this.options.title&&(this.options.title=this.$element.attr("title"));var e=this.options.windowPadding;"number"==typeof e&&(this.options.windowPadding=[e,e,e,e]),this.val=k.prototype.val,this.render=k.prototype.render,this.refresh=k.prototype.refresh,this.setStyle=k.prototype.setStyle,this.selectAll=k.prototype.selectAll,this.deselectAll=k.prototype.deselectAll,this.destroy=k.prototype.destroy,this.remove=k.prototype.remove,this.show=k.prototype.show,this.hide=k.prototype.hide,this.init()};k.VERSION="1.12.1",k.DEFAULTS={noneSelectedText:"Nothing selected",noneResultsText:"No results matched {0}",countSelectedText:function(a,b){return 1==a?"{0} item selected":"{0} items selected"},maxOptionsText:function(a,b){return[1==a?"Limit reached ({n} item max)":"Limit reached ({n} items max)",1==b?"Group limit reached ({n} item max)":"Group limit reached ({n} items max)"]},selectAllText:"Select All",deselectAllText:"Deselect All",doneButton:!1,doneButtonText:"Close",multipleSeparator:", ",styleBase:"btn",style:"btn-default",size:"auto",title:null,selectedTextFormat:"values",width:!1,container:!1,hideDisabled:!1,showSubtext:!1,showIcon:!0,showContent:!0,dropupAuto:!0,header:!1,liveSearch:!1,liveSearchPlaceholder:null,liveSearchNormalize:!1,liveSearchStyle:"contains",actionsBox:!1,iconBase:"glyphicon",tickIcon:"glyphicon-ok",showTick:!1,template:{caret:'<span class="caret"></span>'},maxOptions:!1,mobile:!1,selectOnTab:!1,dropdownAlignRight:!1,windowPadding:0},k.prototype={constructor:k,init:function(){var b=this,c=this.$element.attr("id");this.$element.addClass("bs-select-hidden"),this.liObj={},this.multiple=this.$element.prop("multiple"),this.autofocus=this.$element.prop("autofocus"),this.$newElement=this.createView(),this.$element.after(this.$newElement).appendTo(this.$newElement),this.$button=this.$newElement.children("button"),this.$menu=this.$newElement.children(".dropdown-menu"),this.$menuInner=this.$menu.children(".inner"),this.$searchbox=this.$menu.find("input"),this.$element.removeClass("bs-select-hidden"),this.options.dropdownAlignRight===!0&&this.$menu.addClass("dropdown-menu-right"),"undefined"!=typeof c&&(this.$button.attr("data-id",c),a('label[for="'+c+'"]').click(function(a){a.preventDefault(),b.$button.focus()})),this.checkDisabled(),this.clickListener(),this.options.liveSearch&&this.liveSearchListener(),this.render(),this.setStyle(),this.setWidth(),this.options.container&&this.selectPosition(),this.$menu.data("this",this),this.$newElement.data("this",this),this.options.mobile&&this.mobile(),this.$newElement.on({"hide.bs.dropdown":function(a){b.$menuInner.attr("aria-expanded",!1),b.$element.trigger("hide.bs.select",a)},"hidden.bs.dropdown":function(a){b.$element.trigger("hidden.bs.select",a)},"show.bs.dropdown":function(a){b.$menuInner.attr("aria-expanded",!0),b.$element.trigger("show.bs.select",a)},"shown.bs.dropdown":function(a){b.$element.trigger("shown.bs.select",a)}}),b.$element[0].hasAttribute("required")&&this.$element.on("invalid",function(){b.$button.addClass("bs-invalid").focus(),b.$element.on({"focus.bs.select":function(){b.$button.focus(),b.$element.off("focus.bs.select")},"shown.bs.select":function(){b.$element.val(b.$element.val()).off("shown.bs.select")},"rendered.bs.select":function(){this.validity.valid&&b.$button.removeClass("bs-invalid"),b.$element.off("rendered.bs.select")}})}),setTimeout(function(){b.$element.trigger("loaded.bs.select")})},createDropdown:function(){var b=this.multiple||this.options.showTick?" show-tick":"",c=this.$element.parent().hasClass("input-group")?" input-group-btn":"",d=this.autofocus?" autofocus":"",e=this.options.header?'<div class="popover-title"><button type="button" class="close" aria-hidden="true">&times;</button>'+this.options.header+"</div>":"",f=this.options.liveSearch?'<div class="bs-searchbox"><input type="text" class="form-control" autocomplete="off"'+(null===this.options.liveSearchPlaceholder?"":' placeholder="'+i(this.options.liveSearchPlaceholder)+'"')+' role="textbox" aria-label="Search"></div>':"",g=this.multiple&&this.options.actionsBox?'<div class="bs-actionsbox"><div class="btn-group btn-group-sm btn-block"><button type="button" class="actions-btn bs-select-all btn btn-default">'+this.options.selectAllText+'</button><button type="button" class="actions-btn bs-deselect-all btn btn-default">'+this.options.deselectAllText+"</button></div></div>":"",h=this.multiple&&this.options.doneButton?'<div class="bs-donebutton"><div class="btn-group btn-block"><button type="button" class="btn btn-sm btn-default">'+this.options.doneButtonText+"</button></div></div>":"",j='<div class="btn-group bootstrap-select'+b+c+'"><button type="button" class="'+this.options.styleBase+' dropdown-toggle" data-toggle="dropdown"'+d+' role="button"><span class="filter-option pull-left"></span>&nbsp;<span class="bs-caret">'+this.options.template.caret+'</span></button><div class="dropdown-menu open" role="combobox">'+e+f+g+'<ul class="dropdown-menu inner" role="listbox" aria-expanded="false"></ul>'+h+"</div></div>";return a(j)},createView:function(){var a=this.createDropdown(),b=this.createLi();return a.find("ul")[0].innerHTML=b,a},reloadLi:function(){var a=this.createLi();this.$menuInner[0].innerHTML=a},createLi:function(){var c=this,d=[],e=0,f=document.createElement("option"),g=-1,h=function(a,b,c,d){return"<li"+("undefined"!=typeof c&""!==c?' class="'+c+'"':"")+("undefined"!=typeof b&null!==b?' data-original-index="'+b+'"':"")+("undefined"!=typeof d&null!==d?'data-optgroup="'+d+'"':"")+">"+a+"</li>"},j=function(d,e,f,g){return'<a tabindex="0"'+("undefined"!=typeof e?' class="'+e+'"':"")+(f?' style="'+f+'"':"")+(c.options.liveSearchNormalize?' data-normalized-text="'+b(i(a(d).html()))+'"':"")+("undefined"!=typeof g||null!==g?' data-tokens="'+g+'"':"")+' role="option">'+d+'<span class="'+c.options.iconBase+" "+c.options.tickIcon+' check-mark"></span></a>'};if(this.options.title&&!this.multiple&&(g--,!this.$element.find(".bs-title-option").length)){var k=this.$element[0];f.className="bs-title-option",f.innerHTML=this.options.title,f.value="",k.insertBefore(f,k.firstChild);var l=a(k.options[k.selectedIndex]);void 0===l.attr("selected")&&void 0===this.$element.data("selected")&&(f.selected=!0)}return this.$element.find("option").each(function(b){var f=a(this);if(g++,!f.hasClass("bs-title-option")){var k=this.className||"",l=this.style.cssText,m=f.data("content")?f.data("content"):f.html(),n=f.data("tokens")?f.data("tokens"):null,o="undefined"!=typeof f.data("subtext")?'<small class="text-muted">'+f.data("subtext")+"</small>":"",p="undefined"!=typeof f.data("icon")?'<span class="'+c.options.iconBase+" "+f.data("icon")+'"></span> ':"",q=f.parent(),r="OPTGROUP"===q[0].tagName,s=r&&q[0].disabled,t=this.disabled||s;if(""!==p&&t&&(p="<span>"+p+"</span>"),c.options.hideDisabled&&(t&&!r||s))return void g--;if(f.data("content")||(m=p+'<span class="text">'+m+o+"</span>"),r&&f.data("divider")!==!0){if(c.options.hideDisabled&&t){if(void 0===q.data("allOptionsDisabled")){var u=q.children();q.data("allOptionsDisabled",u.filter(":disabled").length===u.length)}if(q.data("allOptionsDisabled"))return void g--}var v=" "+q[0].className||"";if(0===f.index()){e+=1;var w=q[0].label,x="undefined"!=typeof q.data("subtext")?'<small class="text-muted">'+q.data("subtext")+"</small>":"",y=q.data("icon")?'<span class="'+c.options.iconBase+" "+q.data("icon")+'"></span> ':"";w=y+'<span class="text">'+i(w)+x+"</span>",0!==b&&d.length>0&&(g++,d.push(h("",null,"divider",e+"div"))),g++,d.push(h(w,null,"dropdown-header"+v,e))}if(c.options.hideDisabled&&t)return void g--;d.push(h(j(m,"opt "+k+v,l,n),b,"",e))}else if(f.data("divider")===!0)d.push(h("",b,"divider"));else if(f.data("hidden")===!0)d.push(h(j(m,k,l,n),b,"hidden is-hidden"));else{var z=this.previousElementSibling&&"OPTGROUP"===this.previousElementSibling.tagName;if(!z&&c.options.hideDisabled)for(var A=a(this).prevAll(),B=0;B<A.length;B++)if("OPTGROUP"===A[B].tagName){for(var C=0,D=0;D<B;D++){var E=A[D];(E.disabled||a(E).data("hidden")===!0)&&C++}C===B&&(z=!0);break}z&&(g++,d.push(h("",null,"divider",e+"div"))),d.push(h(j(m,k,l,n),b))}c.liObj[b]=g}}),this.multiple||0!==this.$element.find("option:selected").length||this.options.title||this.$element.find("option").eq(0).prop("selected",!0).attr("selected","selected"),d.join("")},findLis:function(){return null==this.$lis&&(this.$lis=this.$menu.find("li")),this.$lis},render:function(b){var c,d=this;b!==!1&&this.$element.find("option").each(function(a){var b=d.findLis().eq(d.liObj[a]);d.setDisabled(a,this.disabled||"OPTGROUP"===this.parentNode.tagName&&this.parentNode.disabled,b),d.setSelected(a,this.selected,b)}),this.togglePlaceholder(),this.tabIndex();var e=this.$element.find("option").map(function(){if(this.selected){if(d.options.hideDisabled&&(this.disabled||"OPTGROUP"===this.parentNode.tagName&&this.parentNode.disabled))return;var b,c=a(this),e=c.data("icon")&&d.options.showIcon?'<i class="'+d.options.iconBase+" "+c.data("icon")+'"></i> ':"";return b=d.options.showSubtext&&c.data("subtext")&&!d.multiple?' <small class="text-muted">'+c.data("subtext")+"</small>":"","undefined"!=typeof c.attr("title")?c.attr("title"):c.data("content")&&d.options.showContent?c.data("content").toString():e+c.html()+b}}).toArray(),f=this.multiple?e.join(this.options.multipleSeparator):e[0];if(this.multiple&&this.options.selectedTextFormat.indexOf("count")>-1){var g=this.options.selectedTextFormat.split(">");if(g.length>1&&e.length>g[1]||1==g.length&&e.length>=2){c=this.options.hideDisabled?", [disabled]":"";var h=this.$element.find("option").not('[data-divider="true"], [data-hidden="true"]'+c).length,i="function"==typeof this.options.countSelectedText?this.options.countSelectedText(e.length,h):this.options.countSelectedText;f=i.replace("{0}",e.length.toString()).replace("{1}",h.toString())}}void 0==this.options.title&&(this.options.title=this.$element.attr("title")),"static"==this.options.selectedTextFormat&&(f=this.options.title),f||(f="undefined"!=typeof this.options.title?this.options.title:this.options.noneSelectedText),this.$button.attr("title",j(a.trim(f.replace(/<[^>]*>?/g,"")))),this.$button.children(".filter-option").html(f),this.$element.trigger("rendered.bs.select")},setStyle:function(a,b){this.$element.attr("class")&&this.$newElement.addClass(this.$element.attr("class").replace(/selectpicker|mobile-device|bs-select-hidden|validate\[.*\]/gi,""));var c=a?a:this.options.style;"add"==b?this.$button.addClass(c):"remove"==b?this.$button.removeClass(c):(this.$button.removeClass(this.options.style),this.$button.addClass(c))},liHeight:function(b){if(b||this.options.size!==!1&&!this.sizeInfo){var c=document.createElement("div"),d=document.createElement("div"),e=document.createElement("ul"),f=document.createElement("li"),g=document.createElement("li"),h=document.createElement("a"),i=document.createElement("span"),j=this.options.header&&this.$menu.find(".popover-title").length>0?this.$menu.find(".popover-title")[0].cloneNode(!0):null,k=this.options.liveSearch?document.createElement("div"):null,l=this.options.actionsBox&&this.multiple&&this.$menu.find(".bs-actionsbox").length>0?this.$menu.find(".bs-actionsbox")[0].cloneNode(!0):null,m=this.options.doneButton&&this.multiple&&this.$menu.find(".bs-donebutton").length>0?this.$menu.find(".bs-donebutton")[0].cloneNode(!0):null;if(i.className="text",c.className=this.$menu[0].parentNode.className+" open",d.className="dropdown-menu open",e.className="dropdown-menu inner",f.className="divider",i.appendChild(document.createTextNode("Inner text")),h.appendChild(i),g.appendChild(h),e.appendChild(g),e.appendChild(f),j&&d.appendChild(j),k){var n=document.createElement("span");k.className="bs-searchbox",n.className="form-control",k.appendChild(n),d.appendChild(k)}l&&d.appendChild(l),d.appendChild(e),m&&d.appendChild(m),c.appendChild(d),document.body.appendChild(c);var o=h.offsetHeight,p=j?j.offsetHeight:0,q=k?k.offsetHeight:0,r=l?l.offsetHeight:0,s=m?m.offsetHeight:0,t=a(f).outerHeight(!0),u="function"==typeof getComputedStyle&&getComputedStyle(d),v=u?null:a(d),w={vert:parseInt(u?u.paddingTop:v.css("paddingTop"))+parseInt(u?u.paddingBottom:v.css("paddingBottom"))+parseInt(u?u.borderTopWidth:v.css("borderTopWidth"))+parseInt(u?u.borderBottomWidth:v.css("borderBottomWidth")),horiz:parseInt(u?u.paddingLeft:v.css("paddingLeft"))+parseInt(u?u.paddingRight:v.css("paddingRight"))+parseInt(u?u.borderLeftWidth:v.css("borderLeftWidth"))+parseInt(u?u.borderRightWidth:v.css("borderRightWidth"))},x={vert:w.vert+parseInt(u?u.marginTop:v.css("marginTop"))+parseInt(u?u.marginBottom:v.css("marginBottom"))+2,horiz:w.horiz+parseInt(u?u.marginLeft:v.css("marginLeft"))+parseInt(u?u.marginRight:v.css("marginRight"))+2};document.body.removeChild(c),this.sizeInfo={liHeight:o,headerHeight:p,searchHeight:q,actionsHeight:r,doneButtonHeight:s,dividerHeight:t,menuPadding:w,menuExtras:x}}},setSize:function(){if(this.findLis(),this.liHeight(),this.options.header&&this.$menu.css("padding-top",0),this.options.size!==!1){var b,c,d,e,f,g,h,i,j=this,k=this.$menu,l=this.$menuInner,m=a(window),n=this.$newElement[0].offsetHeight,o=this.$newElement[0].offsetWidth,p=this.sizeInfo.liHeight,q=this.sizeInfo.headerHeight,r=this.sizeInfo.searchHeight,s=this.sizeInfo.actionsHeight,t=this.sizeInfo.doneButtonHeight,u=this.sizeInfo.dividerHeight,v=this.sizeInfo.menuPadding,w=this.sizeInfo.menuExtras,x=this.options.hideDisabled?".disabled":"",y=function(){var b,c=j.$newElement.offset(),d=a(j.options.container);j.options.container&&!d.is("body")?(b=d.offset(),b.top+=parseInt(d.css("borderTopWidth")),b.left+=parseInt(d.css("borderLeftWidth"))):b={top:0,left:0};var e=j.options.windowPadding;f=c.top-b.top-m.scrollTop(),g=m.height()-f-n-b.top-e[2],h=c.left-b.left-m.scrollLeft(),i=m.width()-h-o-b.left-e[1],f-=e[0],h-=e[3]};if(y(),"auto"===this.options.size){var z=function(){var m,n=function(b,c){return function(d){return c?d.classList?d.classList.contains(b):a(d).hasClass(b):!(d.classList?d.classList.contains(b):a(d).hasClass(b))}},u=j.$menuInner[0].getElementsByTagName("li"),x=Array.prototype.filter?Array.prototype.filter.call(u,n("hidden",!1)):j.$lis.not(".hidden"),z=Array.prototype.filter?Array.prototype.filter.call(x,n("dropdown-header",!0)):x.filter(".dropdown-header");y(),b=g-w.vert,c=i-w.horiz,j.options.container?(k.data("height")||k.data("height",k.height()),d=k.data("height"),k.data("width")||k.data("width",k.width()),e=k.data("width")):(d=k.height(),e=k.width()),j.options.dropupAuto&&j.$newElement.toggleClass("dropup",f>g&&b-w.vert<d),j.$newElement.hasClass("dropup")&&(b=f-w.vert),"auto"===j.options.dropdownAlignRight&&k.toggleClass("dropdown-menu-right",h>i&&c-w.horiz<e-o),m=x.length+z.length>3?3*p+w.vert-2:0,k.css({"max-height":b+"px",overflow:"hidden","min-height":m+q+r+s+t+"px"}),l.css({"max-height":b-q-r-s-t-v.vert+"px","overflow-y":"auto","min-height":Math.max(m-v.vert,0)+"px"})};z(),this.$searchbox.off("input.getSize propertychange.getSize").on("input.getSize propertychange.getSize",z),m.off("resize.getSize scroll.getSize").on("resize.getSize scroll.getSize",z)}else if(this.options.size&&"auto"!=this.options.size&&this.$lis.not(x).length>this.options.size){var A=this.$lis.not(".divider").not(x).children().slice(0,this.options.size).last().parent().index(),B=this.$lis.slice(0,A+1).filter(".divider").length;b=p*this.options.size+B*u+v.vert,j.options.container?(k.data("height")||k.data("height",k.height()),d=k.data("height")):d=k.height(),j.options.dropupAuto&&this.$newElement.toggleClass("dropup",f>g&&b-w.vert<d),k.css({"max-height":b+q+r+s+t+"px",overflow:"hidden","min-height":""}),l.css({"max-height":b-v.vert+"px","overflow-y":"auto","min-height":""})}}},setWidth:function(){if("auto"===this.options.width){this.$menu.css("min-width","0");var a=this.$menu.parent().clone().appendTo("body"),b=this.options.container?this.$newElement.clone().appendTo("body"):a,c=a.children(".dropdown-menu").outerWidth(),d=b.css("width","auto").children("button").outerWidth();a.remove(),b.remove(),this.$newElement.css("width",Math.max(c,d)+"px")}else"fit"===this.options.width?(this.$menu.css("min-width",""),this.$newElement.css("width","").addClass("fit-width")):this.options.width?(this.$menu.css("min-width",""),this.$newElement.css("width",this.options.width)):(this.$menu.css("min-width",""),this.$newElement.css("width",""));this.$newElement.hasClass("fit-width")&&"fit"!==this.options.width&&this.$newElement.removeClass("fit-width")},selectPosition:function(){this.$bsContainer=a('<div class="bs-container" />');var b,c,d,e=this,f=a(this.options.container),g=function(a){e.$bsContainer.addClass(a.attr("class").replace(/form-control|fit-width/gi,"")).toggleClass("dropup",a.hasClass("dropup")),b=a.offset(),f.is("body")?c={top:0,left:0}:(c=f.offset(),c.top+=parseInt(f.css("borderTopWidth"))-f.scrollTop(),c.left+=parseInt(f.css("borderLeftWidth"))-f.scrollLeft()),d=a.hasClass("dropup")?0:a[0].offsetHeight,e.$bsContainer.css({top:b.top-c.top+d,left:b.left-c.left,width:a[0].offsetWidth})};this.$button.on("click",function(){var b=a(this);e.isDisabled()||(g(e.$newElement),e.$bsContainer.appendTo(e.options.container).toggleClass("open",!b.hasClass("open")).append(e.$menu))}),a(window).on("resize scroll",function(){g(e.$newElement)}),this.$element.on("hide.bs.select",function(){e.$menu.data("height",e.$menu.height()),e.$bsContainer.detach()})},setSelected:function(a,b,c){c||(this.togglePlaceholder(),c=this.findLis().eq(this.liObj[a])),c.toggleClass("selected",b).find("a").attr("aria-selected",b)},setDisabled:function(a,b,c){c||(c=this.findLis().eq(this.liObj[a])),b?c.addClass("disabled").children("a").attr("href","#").attr("tabindex",-1).attr("aria-disabled",!0):c.removeClass("disabled").children("a").removeAttr("href").attr("tabindex",0).attr("aria-disabled",!1)},isDisabled:function(){return this.$element[0].disabled},checkDisabled:function(){var a=this;this.isDisabled()?(this.$newElement.addClass("disabled"),this.$button.addClass("disabled").attr("tabindex",-1).attr("aria-disabled",!0)):(this.$button.hasClass("disabled")&&(this.$newElement.removeClass("disabled"),this.$button.removeClass("disabled").attr("aria-disabled",!1)),this.$button.attr("tabindex")!=-1||this.$element.data("tabindex")||this.$button.removeAttr("tabindex")),this.$button.click(function(){return!a.isDisabled()})},togglePlaceholder:function(){var a=this.$element.val();this.$button.toggleClass("bs-placeholder",null===a||""===a||a.constructor===Array&&0===a.length)},tabIndex:function(){this.$element.data("tabindex")!==this.$element.attr("tabindex")&&this.$element.attr("tabindex")!==-98&&"-98"!==this.$element.attr("tabindex")&&(this.$element.data("tabindex",this.$element.attr("tabindex")),this.$button.attr("tabindex",this.$element.data("tabindex"))),this.$element.attr("tabindex",-98)},clickListener:function(){var b=this,c=a(document);c.data("spaceSelect",!1),this.$button.on("keyup",function(a){/(32)/.test(a.keyCode.toString(10))&&c.data("spaceSelect")&&(a.preventDefault(),c.data("spaceSelect",!1))}),this.$button.on("click",function(){b.setSize()}),this.$element.on("shown.bs.select",function(){if(b.options.liveSearch||b.multiple){if(!b.multiple){var a=b.liObj[b.$element[0].selectedIndex];if("number"!=typeof a||b.options.size===!1)return;var c=b.$lis.eq(a)[0].offsetTop-b.$menuInner[0].offsetTop;c=c-b.$menuInner[0].offsetHeight/2+b.sizeInfo.liHeight/2,b.$menuInner[0].scrollTop=c}}else b.$menuInner.find(".selected a").focus()}),this.$menuInner.on("click","li a",function(c){var d=a(this),f=d.parent().data("originalIndex"),g=b.$element.val(),h=b.$element.prop("selectedIndex"),i=!0;if(b.multiple&&1!==b.options.maxOptions&&c.stopPropagation(),c.preventDefault(),!b.isDisabled()&&!d.parent().hasClass("disabled")){var j=b.$element.find("option"),k=j.eq(f),l=k.prop("selected"),m=k.parent("optgroup"),n=b.options.maxOptions,o=m.data("maxOptions")||!1;if(b.multiple){if(k.prop("selected",!l),b.setSelected(f,!l),d.blur(),n!==!1||o!==!1){var p=n<j.filter(":selected").length,q=o<m.find("option:selected").length;if(n&&p||o&&q)if(n&&1==n)j.prop("selected",!1),k.prop("selected",!0),b.$menuInner.find(".selected").removeClass("selected"),b.setSelected(f,!0);else if(o&&1==o){m.find("option:selected").prop("selected",!1),k.prop("selected",!0);var r=d.parent().data("optgroup");b.$menuInner.find('[data-optgroup="'+r+'"]').removeClass("selected"),b.setSelected(f,!0)}else{var s="string"==typeof b.options.maxOptionsText?[b.options.maxOptionsText,b.options.maxOptionsText]:b.options.maxOptionsText,t="function"==typeof s?s(n,o):s,u=t[0].replace("{n}",n),v=t[1].replace("{n}",o),w=a('<div class="notify"></div>');t[2]&&(u=u.replace("{var}",t[2][n>1?0:1]),v=v.replace("{var}",t[2][o>1?0:1])),k.prop("selected",!1),b.$menu.append(w),n&&p&&(w.append(a("<div>"+u+"</div>")),i=!1,b.$element.trigger("maxReached.bs.select")),o&&q&&(w.append(a("<div>"+v+"</div>")),i=!1,b.$element.trigger("maxReachedGrp.bs.select")),setTimeout(function(){b.setSelected(f,!1)},10),w.delay(750).fadeOut(300,function(){a(this).remove()})}}}else j.prop("selected",!1),k.prop("selected",!0),b.$menuInner.find(".selected").removeClass("selected").find("a").attr("aria-selected",!1),b.setSelected(f,!0);!b.multiple||b.multiple&&1===b.options.maxOptions?b.$button.focus():b.options.liveSearch&&b.$searchbox.focus(),i&&(g!=b.$element.val()&&b.multiple||h!=b.$element.prop("selectedIndex")&&!b.multiple)&&(e=[f,k.prop("selected"),l],b.$element.triggerNative("change"))}}),this.$menu.on("click","li.disabled a, .popover-title, .popover-title :not(.close)",function(c){c.currentTarget==this&&(c.preventDefault(),c.stopPropagation(),b.options.liveSearch&&!a(c.target).hasClass("close")?b.$searchbox.focus():b.$button.focus())}),this.$menuInner.on("click",".divider, .dropdown-header",function(a){a.preventDefault(),a.stopPropagation(),b.options.liveSearch?b.$searchbox.focus():b.$button.focus()}),this.$menu.on("click",".popover-title .close",function(){b.$button.click()}),this.$searchbox.on("click",function(a){a.stopPropagation()}),this.$menu.on("click",".actions-btn",function(c){b.options.liveSearch?b.$searchbox.focus():b.$button.focus(),c.preventDefault(),c.stopPropagation(),a(this).hasClass("bs-select-all")?b.selectAll():b.deselectAll()}),this.$element.change(function(){b.render(!1),b.$element.trigger("changed.bs.select",e),e=null})},liveSearchListener:function(){var c=this,d=a('<li class="no-results"></li>');this.$button.on("click.dropdown.data-api",function(){c.$menuInner.find(".active").removeClass("active"),c.$searchbox.val()&&(c.$searchbox.val(""),c.$lis.not(".is-hidden").removeClass("hidden"),d.parent().length&&d.remove()),c.multiple||c.$menuInner.find(".selected").addClass("active"),setTimeout(function(){c.$searchbox.focus()},10)}),this.$searchbox.on("click.dropdown.data-api focus.dropdown.data-api touchend.dropdown.data-api",function(a){a.stopPropagation()}),this.$searchbox.on("input propertychange",function(){if(c.$lis.not(".is-hidden").removeClass("hidden"),c.$lis.filter(".active").removeClass("active"),d.remove(),c.$searchbox.val()){var e,f=c.$lis.not(".is-hidden, .divider, .dropdown-header");if(e=c.options.liveSearchNormalize?f.not(":a"+c._searchStyle()+'("'+b(c.$searchbox.val())+'")'):f.not(":"+c._searchStyle()+'("'+c.$searchbox.val()+'")'),e.length===f.length)d.html(c.options.noneResultsText.replace("{0}",'"'+i(c.$searchbox.val())+'"')),c.$menuInner.append(d),c.$lis.addClass("hidden");else{e.addClass("hidden");var g,h=c.$lis.not(".hidden");h.each(function(b){var c=a(this);c.hasClass("divider")?void 0===g?c.addClass("hidden"):(g&&g.addClass("hidden"),g=c):c.hasClass("dropdown-header")&&h.eq(b+1).data("optgroup")!==c.data("optgroup")?c.addClass("hidden"):g=null}),g&&g.addClass("hidden"),f.not(".hidden").first().addClass("active")}}})},_searchStyle:function(){var a={begins:"ibegins",startsWith:"ibegins"};return a[this.options.liveSearchStyle]||"icontains"},val:function(a){return"undefined"!=typeof a?(this.$element.val(a),this.render(),this.$element):this.$element.val()},changeAll:function(b){if(this.multiple){"undefined"==typeof b&&(b=!0),this.findLis();var c=this.$element.find("option"),d=this.$lis.not(".divider, .dropdown-header, .disabled, .hidden"),e=d.length,f=[];if(b){if(d.filter(".selected").length===d.length)return}else if(0===d.filter(".selected").length)return;d.toggleClass("selected",b);for(var g=0;g<e;g++){var h=d[g].getAttribute("data-original-index");f[f.length]=c.eq(h)[0]}a(f).prop("selected",b),this.render(!1),this.togglePlaceholder(),this.$element.triggerNative("change")}},selectAll:function(){return this.changeAll(!0)},deselectAll:function(){return this.changeAll(!1)},toggle:function(a){a=a||window.event,a&&a.stopPropagation(),this.$button.trigger("click")},keydown:function(c){var d,e,f,g,h,i,j,k,l,m=a(this),n=m.is("input")?m.parent().parent():m.parent(),o=n.data("this"),p=":not(.disabled, .hidden, .dropdown-header, .divider)",q={32:" ",48:"0",49:"1",50:"2",51:"3",52:"4",53:"5",54:"6",55:"7",56:"8",57:"9",59:";",65:"a",66:"b",67:"c",68:"d",69:"e",70:"f",71:"g",72:"h",73:"i",74:"j",75:"k",76:"l",77:"m",78:"n",79:"o",80:"p",81:"q",82:"r",83:"s",84:"t",85:"u",86:"v",87:"w",88:"x",89:"y",90:"z",96:"0",97:"1",98:"2",99:"3",100:"4",101:"5",102:"6",103:"7",104:"8",105:"9"};if(o.options.liveSearch&&(n=m.parent().parent()),o.options.container&&(n=o.$menu),d=a('[role="listbox"] li',n),l=o.$newElement.hasClass("open"),!l&&(c.keyCode>=48&&c.keyCode<=57||c.keyCode>=96&&c.keyCode<=105||c.keyCode>=65&&c.keyCode<=90))return o.options.container?o.$button.trigger("click"):(o.setSize(),o.$menu.parent().addClass("open"),l=!0),void o.$searchbox.focus();if(o.options.liveSearch&&(/(^9$|27)/.test(c.keyCode.toString(10))&&l&&(c.preventDefault(),c.stopPropagation(),o.$menuInner.click(),o.$button.focus()),d=a('[role="listbox"] li'+p,n),m.val()||/(38|40)/.test(c.keyCode.toString(10))||0===d.filter(".active").length&&(d=o.$menuInner.find("li"),d=o.options.liveSearchNormalize?d.filter(":a"+o._searchStyle()+"("+b(q[c.keyCode])+")"):d.filter(":"+o._searchStyle()+"("+q[c.keyCode]+")"))),d.length){if(/(38|40)/.test(c.keyCode.toString(10)))e=d.index(d.find("a").filter(":focus").parent()),g=d.filter(p).first().index(),h=d.filter(p).last().index(),f=d.eq(e).nextAll(p).eq(0).index(),i=d.eq(e).prevAll(p).eq(0).index(),j=d.eq(f).prevAll(p).eq(0).index(),o.options.liveSearch&&(d.each(function(b){a(this).hasClass("disabled")||a(this).data("index",b)}),e=d.index(d.filter(".active")),g=d.first().data("index"),h=d.last().data("index"),f=d.eq(e).nextAll().eq(0).data("index"),i=d.eq(e).prevAll().eq(0).data("index"),j=d.eq(f).prevAll().eq(0).data("index")),k=m.data("prevIndex"),38==c.keyCode?(o.options.liveSearch&&e--,e!=j&&e>i&&(e=i),e<g&&(e=g),e==k&&(e=h)):40==c.keyCode&&(o.options.liveSearch&&e++,e==-1&&(e=0),e!=j&&e<f&&(e=f),e>h&&(e=h),e==k&&(e=g)),m.data("prevIndex",e),o.options.liveSearch?(c.preventDefault(),m.hasClass("dropdown-toggle")||(d.removeClass("active").eq(e).addClass("active").children("a").focus(),m.focus())):d.eq(e).children("a").focus();else if(!m.is("input")){var r,s,t=[];d.each(function(){a(this).hasClass("disabled")||a.trim(a(this).children("a").text().toLowerCase()).substring(0,1)==q[c.keyCode]&&t.push(a(this).index())}),r=a(document).data("keycount"),r++,a(document).data("keycount",r),s=a.trim(a(":focus").text().toLowerCase()).substring(0,1),s!=q[c.keyCode]?(r=1,a(document).data("keycount",r)):r>=t.length&&(a(document).data("keycount",0),r>t.length&&(r=1)),d.eq(t[r-1]).children("a").focus()}if((/(13|32)/.test(c.keyCode.toString(10))||/(^9$)/.test(c.keyCode.toString(10))&&o.options.selectOnTab)&&l){if(/(32)/.test(c.keyCode.toString(10))||c.preventDefault(),o.options.liveSearch)/(32)/.test(c.keyCode.toString(10))||(o.$menuInner.find(".active a").click(),m.focus());else{
	var u=a(":focus");u.click(),u.focus(),c.preventDefault(),a(document).data("spaceSelect",!0)}a(document).data("keycount",0)}(/(^9$|27)/.test(c.keyCode.toString(10))&&l&&(o.multiple||o.options.liveSearch)||/(27)/.test(c.keyCode.toString(10))&&!l)&&(o.$menu.parent().removeClass("open"),o.options.container&&o.$newElement.removeClass("open"),o.$button.focus())}},mobile:function(){this.$element.addClass("mobile-device")},refresh:function(){this.$lis=null,this.liObj={},this.reloadLi(),this.render(),this.checkDisabled(),this.liHeight(!0),this.setStyle(),this.setWidth(),this.$lis&&this.$searchbox.trigger("propertychange"),this.$element.trigger("refreshed.bs.select")},hide:function(){this.$newElement.hide()},show:function(){this.$newElement.show()},remove:function(){this.$newElement.remove(),this.$element.remove()},destroy:function(){this.$newElement.before(this.$element).remove(),this.$bsContainer?this.$bsContainer.remove():this.$menu.remove(),this.$element.off(".bs.select").removeData("selectpicker").removeClass("bs-select-hidden selectpicker")}};var l=a.fn.selectpicker;a.fn.selectpicker=c,a.fn.selectpicker.Constructor=k,a.fn.selectpicker.noConflict=function(){return a.fn.selectpicker=l,this},a(document).data("keycount",0).on("keydown.bs.select",'.bootstrap-select [data-toggle=dropdown], .bootstrap-select [role="listbox"], .bs-searchbox input',k.prototype.keydown).on("focusin.modal",'.bootstrap-select [data-toggle=dropdown], .bootstrap-select [role="listbox"], .bs-searchbox input',function(a){a.stopPropagation()}),a(window).on("load.bs.select.data-api",function(){a(".selectpicker").each(function(){var b=a(this);c.call(b,b.data())})})}(a)});
	//# sourceMappingURL=bootstrap-select.js.map

/***/ },
/* 86 */
/***/ function(module, exports) {

	// removed by extract-text-webpack-plugin

/***/ },
/* 87 */,
/* 88 */
/***/ function(module, exports, __webpack_require__) {

	/* WEBPACK VAR INJECTION */(function(jQuery) {!function(a,b,c,d){"use strict";var e="treeview",f={};f.settings={injectStyle:!0,levels:2,expandIcon:"glyphicon glyphicon-plus",collapseIcon:"glyphicon glyphicon-minus",emptyIcon:"glyphicon",nodeIcon:"",selectedIcon:"",checkedIcon:"glyphicon glyphicon-check",uncheckedIcon:"glyphicon glyphicon-unchecked",color:d,backColor:d,borderColor:d,onhoverColor:"#F5F5F5",selectedColor:"#FFFFFF",selectedBackColor:"#428bca",searchResultColor:"#D9534F",searchResultBackColor:d,enableLinks:!1,highlightSelected:!0,highlightSearchResults:!0,showBorder:!0,showIcon:!0,showCheckbox:!1,showTags:!1,multiSelect:!1,onNodeChecked:d,onNodeCollapsed:d,onNodeDisabled:d,onNodeEnabled:d,onNodeExpanded:d,onNodeSelected:d,onNodeUnchecked:d,onNodeUnselected:d,onSearchComplete:d,onSearchCleared:d},f.options={silent:!1,ignoreChildren:!1},f.searchOptions={ignoreCase:!0,exactMatch:!1,revealResults:!0};var g=function(b,c){return this.$element=a(b),this.elementId=b.id,this.styleId=this.elementId+"-style",this.init(c),{options:this.options,init:a.proxy(this.init,this),remove:a.proxy(this.remove,this),getNode:a.proxy(this.getNode,this),getParent:a.proxy(this.getParent,this),getSiblings:a.proxy(this.getSiblings,this),getSelected:a.proxy(this.getSelected,this),getUnselected:a.proxy(this.getUnselected,this),getExpanded:a.proxy(this.getExpanded,this),getCollapsed:a.proxy(this.getCollapsed,this),getChecked:a.proxy(this.getChecked,this),getUnchecked:a.proxy(this.getUnchecked,this),getDisabled:a.proxy(this.getDisabled,this),getEnabled:a.proxy(this.getEnabled,this),selectNode:a.proxy(this.selectNode,this),unselectNode:a.proxy(this.unselectNode,this),toggleNodeSelected:a.proxy(this.toggleNodeSelected,this),collapseAll:a.proxy(this.collapseAll,this),collapseNode:a.proxy(this.collapseNode,this),expandAll:a.proxy(this.expandAll,this),expandNode:a.proxy(this.expandNode,this),toggleNodeExpanded:a.proxy(this.toggleNodeExpanded,this),revealNode:a.proxy(this.revealNode,this),checkAll:a.proxy(this.checkAll,this),checkNode:a.proxy(this.checkNode,this),uncheckAll:a.proxy(this.uncheckAll,this),uncheckNode:a.proxy(this.uncheckNode,this),toggleNodeChecked:a.proxy(this.toggleNodeChecked,this),disableAll:a.proxy(this.disableAll,this),disableNode:a.proxy(this.disableNode,this),enableAll:a.proxy(this.enableAll,this),enableNode:a.proxy(this.enableNode,this),toggleNodeDisabled:a.proxy(this.toggleNodeDisabled,this),search:a.proxy(this.search,this),clearSearch:a.proxy(this.clearSearch,this)}};g.prototype.init=function(b){this.tree=[],this.nodes=[],b.data&&("string"==typeof b.data&&(b.data=a.parseJSON(b.data)),this.tree=a.extend(!0,[],b.data),delete b.data),this.options=a.extend({},f.settings,b),this.destroy(),this.subscribeEvents(),this.setInitialStates({nodes:this.tree},0),this.render()},g.prototype.remove=function(){this.destroy(),a.removeData(this,e),a("#"+this.styleId).remove()},g.prototype.destroy=function(){this.initialized&&(this.$wrapper.remove(),this.$wrapper=null,this.unsubscribeEvents(),this.initialized=!1)},g.prototype.unsubscribeEvents=function(){this.$element.off("click"),this.$element.off("nodeChecked"),this.$element.off("nodeCollapsed"),this.$element.off("nodeDisabled"),this.$element.off("nodeEnabled"),this.$element.off("nodeExpanded"),this.$element.off("nodeSelected"),this.$element.off("nodeUnchecked"),this.$element.off("nodeUnselected"),this.$element.off("searchComplete"),this.$element.off("searchCleared")},g.prototype.subscribeEvents=function(){this.unsubscribeEvents(),this.$element.on("click",a.proxy(this.clickHandler,this)),"function"==typeof this.options.onNodeChecked&&this.$element.on("nodeChecked",this.options.onNodeChecked),"function"==typeof this.options.onNodeCollapsed&&this.$element.on("nodeCollapsed",this.options.onNodeCollapsed),"function"==typeof this.options.onNodeDisabled&&this.$element.on("nodeDisabled",this.options.onNodeDisabled),"function"==typeof this.options.onNodeEnabled&&this.$element.on("nodeEnabled",this.options.onNodeEnabled),"function"==typeof this.options.onNodeExpanded&&this.$element.on("nodeExpanded",this.options.onNodeExpanded),"function"==typeof this.options.onNodeSelected&&this.$element.on("nodeSelected",this.options.onNodeSelected),"function"==typeof this.options.onNodeUnchecked&&this.$element.on("nodeUnchecked",this.options.onNodeUnchecked),"function"==typeof this.options.onNodeUnselected&&this.$element.on("nodeUnselected",this.options.onNodeUnselected),"function"==typeof this.options.onSearchComplete&&this.$element.on("searchComplete",this.options.onSearchComplete),"function"==typeof this.options.onSearchCleared&&this.$element.on("searchCleared",this.options.onSearchCleared)},g.prototype.setInitialStates=function(b,c){if(b.nodes){c+=1;var d=b,e=this;a.each(b.nodes,function(a,b){b.nodeId=e.nodes.length,b.parentId=d.nodeId,b.hasOwnProperty("selectable")||(b.selectable=!0),b.state=b.state||{},b.state.hasOwnProperty("checked")||(b.state.checked=!1),b.state.hasOwnProperty("disabled")||(b.state.disabled=!1),b.state.hasOwnProperty("expanded")||(!b.state.disabled&&c<e.options.levels&&b.nodes&&b.nodes.length>0?b.state.expanded=!0:b.state.expanded=!1),b.state.hasOwnProperty("selected")||(b.state.selected=!1),e.nodes.push(b),b.nodes&&e.setInitialStates(b,c)})}},g.prototype.clickHandler=function(b){this.options.enableLinks||b.preventDefault();var c=a(b.target),d=this.findNode(c);if(d&&!d.state.disabled){var e=c.attr("class")?c.attr("class").split(" "):[];-1!==e.indexOf("expand-icon")?(this.toggleExpandedState(d,f.options),this.render()):-1!==e.indexOf("check-icon")?(this.toggleCheckedState(d,f.options),this.render()):(d.selectable?this.toggleSelectedState(d,f.options):this.toggleExpandedState(d,f.options),this.render())}},g.prototype.findNode=function(a){var b=a.closest("li.list-group-item").attr("data-nodeid"),c=this.nodes[b];return c||console.log("Error: node does not exist"),c},g.prototype.toggleExpandedState=function(a,b){a&&this.setExpandedState(a,!a.state.expanded,b)},g.prototype.setExpandedState=function(b,c,d){c!==b.state.expanded&&(c&&b.nodes?(b.state.expanded=!0,d.silent||this.$element.trigger("nodeExpanded",a.extend(!0,{},b))):c||(b.state.expanded=!1,d.silent||this.$element.trigger("nodeCollapsed",a.extend(!0,{},b)),b.nodes&&!d.ignoreChildren&&a.each(b.nodes,a.proxy(function(a,b){this.setExpandedState(b,!1,d)},this))))},g.prototype.toggleSelectedState=function(a,b){a&&this.setSelectedState(a,!a.state.selected,b)},g.prototype.setSelectedState=function(b,c,d){c!==b.state.selected&&(c?(this.options.multiSelect||a.each(this.findNodes("true","g","state.selected"),a.proxy(function(a,b){this.setSelectedState(b,!1,d)},this)),b.state.selected=!0,d.silent||this.$element.trigger("nodeSelected",a.extend(!0,{},b))):(b.state.selected=!1,d.silent||this.$element.trigger("nodeUnselected",a.extend(!0,{},b))))},g.prototype.toggleCheckedState=function(a,b){a&&this.setCheckedState(a,!a.state.checked,b)},g.prototype.setCheckedState=function(b,c,d){c!==b.state.checked&&(c?(b.state.checked=!0,d.silent||this.$element.trigger("nodeChecked",a.extend(!0,{},b))):(b.state.checked=!1,d.silent||this.$element.trigger("nodeUnchecked",a.extend(!0,{},b))))},g.prototype.setDisabledState=function(b,c,d){c!==b.state.disabled&&(c?(b.state.disabled=!0,this.setExpandedState(b,!1,d),this.setSelectedState(b,!1,d),this.setCheckedState(b,!1,d),d.silent||this.$element.trigger("nodeDisabled",a.extend(!0,{},b))):(b.state.disabled=!1,d.silent||this.$element.trigger("nodeEnabled",a.extend(!0,{},b))))},g.prototype.render=function(){this.initialized||(this.$element.addClass(e),this.$wrapper=a(this.template.list),this.injectStyle(),this.initialized=!0),this.$element.empty().append(this.$wrapper.empty()),this.buildTree(this.tree,0)},g.prototype.buildTree=function(b,c){if(b){c+=1;var d=this;a.each(b,function(b,e){for(var f=a(d.template.item).addClass("node-"+d.elementId).addClass(e.state.checked?"node-checked":"").addClass(e.state.disabled?"node-disabled":"").addClass(e.state.selected?"node-selected":"").addClass(e.searchResult?"search-result":"").attr("data-nodeid",e.nodeId).attr("style",d.buildStyleOverride(e)),g=0;c-1>g;g++)f.append(d.template.indent);var h=[];if(e.nodes?(h.push("expand-icon"),h.push(e.state.expanded?d.options.collapseIcon:d.options.expandIcon)):h.push(d.options.emptyIcon),f.append(a(d.template.icon).addClass(h.join(" "))),d.options.showIcon){var h=["node-icon"];h.push(e.icon||d.options.nodeIcon),e.state.selected&&(h.pop(),h.push(e.selectedIcon||d.options.selectedIcon||e.icon||d.options.nodeIcon)),f.append(a(d.template.icon).addClass(h.join(" ")))}if(d.options.showCheckbox){var h=["check-icon"];h.push(e.state.checked?d.options.checkedIcon:d.options.uncheckedIcon),f.append(a(d.template.icon).addClass(h.join(" ")))}return f.append(d.options.enableLinks?a(d.template.link).attr("href",e.href).append(e.text):e.text),d.options.showTags&&e.tags&&a.each(e.tags,function(b,c){f.append(a(d.template.badge).append(c))}),d.$wrapper.append(f),e.nodes&&e.state.expanded&&!e.state.disabled?d.buildTree(e.nodes,c):void 0})}},g.prototype.buildStyleOverride=function(a){if(a.state.disabled)return"";var b=a.color,c=a.backColor;return this.options.highlightSelected&&a.state.selected&&(this.options.selectedColor&&(b=this.options.selectedColor),this.options.selectedBackColor&&(c=this.options.selectedBackColor)),this.options.highlightSearchResults&&a.searchResult&&!a.state.disabled&&(this.options.searchResultColor&&(b=this.options.searchResultColor),this.options.searchResultBackColor&&(c=this.options.searchResultBackColor)),"color:"+b+";background-color:"+c+";"},g.prototype.injectStyle=function(){this.options.injectStyle&&!c.getElementById(this.styleId)&&a('<style type="text/css" id="'+this.styleId+'"> '+this.buildStyle()+" </style>").appendTo("head")},g.prototype.buildStyle=function(){var a=".node-"+this.elementId+"{";return this.options.color&&(a+="color:"+this.options.color+";"),this.options.backColor&&(a+="background-color:"+this.options.backColor+";"),this.options.showBorder?this.options.borderColor&&(a+="border:1px solid "+this.options.borderColor+";"):a+="border:none;",a+="}",this.options.onhoverColor&&(a+=".node-"+this.elementId+":not(.node-disabled):hover{background-color:"+this.options.onhoverColor+";}"),this.css+a},g.prototype.template={list:'<ul class="list-group"></ul>',item:'<li class="list-group-item"></li>',indent:'<span class="indent"></span>',icon:'<span class="icon"></span>',link:'<a href="#" style="color:inherit;"></a>',badge:'<span class="badge"></span>'},g.prototype.css=".treeview .list-group-item{cursor:pointer}.treeview span.indent{margin-left:10px;margin-right:10px}.treeview span.icon{width:12px;margin-right:5px}.treeview .node-disabled{color:silver;cursor:not-allowed}",g.prototype.getNode=function(a){return this.nodes[a]},g.prototype.getParent=function(a){var b=this.identifyNode(a);return this.nodes[b.parentId]},g.prototype.getSiblings=function(a){var b=this.identifyNode(a),c=this.getParent(b),d=c?c.nodes:this.tree;return d.filter(function(a){return a.nodeId!==b.nodeId})},g.prototype.getSelected=function(){return this.findNodes("true","g","state.selected")},g.prototype.getUnselected=function(){return this.findNodes("false","g","state.selected")},g.prototype.getExpanded=function(){return this.findNodes("true","g","state.expanded")},g.prototype.getCollapsed=function(){return this.findNodes("false","g","state.expanded")},g.prototype.getChecked=function(){return this.findNodes("true","g","state.checked")},g.prototype.getUnchecked=function(){return this.findNodes("false","g","state.checked")},g.prototype.getDisabled=function(){return this.findNodes("true","g","state.disabled")},g.prototype.getEnabled=function(){return this.findNodes("false","g","state.disabled")},g.prototype.selectNode=function(b,c){this.forEachIdentifier(b,c,a.proxy(function(a,b){this.setSelectedState(a,!0,b)},this)),this.render()},g.prototype.unselectNode=function(b,c){this.forEachIdentifier(b,c,a.proxy(function(a,b){this.setSelectedState(a,!1,b)},this)),this.render()},g.prototype.toggleNodeSelected=function(b,c){this.forEachIdentifier(b,c,a.proxy(function(a,b){this.toggleSelectedState(a,b)},this)),this.render()},g.prototype.collapseAll=function(b){var c=this.findNodes("true","g","state.expanded");this.forEachIdentifier(c,b,a.proxy(function(a,b){this.setExpandedState(a,!1,b)},this)),this.render()},g.prototype.collapseNode=function(b,c){this.forEachIdentifier(b,c,a.proxy(function(a,b){this.setExpandedState(a,!1,b)},this)),this.render()},g.prototype.expandAll=function(b){if(b=a.extend({},f.options,b),b&&b.levels)this.expandLevels(this.tree,b.levels,b);else{var c=this.findNodes("false","g","state.expanded");this.forEachIdentifier(c,b,a.proxy(function(a,b){this.setExpandedState(a,!0,b)},this))}this.render()},g.prototype.expandNode=function(b,c){this.forEachIdentifier(b,c,a.proxy(function(a,b){this.setExpandedState(a,!0,b),a.nodes&&b&&b.levels&&this.expandLevels(a.nodes,b.levels-1,b)},this)),this.render()},g.prototype.expandLevels=function(b,c,d){d=a.extend({},f.options,d),a.each(b,a.proxy(function(a,b){this.setExpandedState(b,c>0?!0:!1,d),b.nodes&&this.expandLevels(b.nodes,c-1,d)},this))},g.prototype.revealNode=function(b,c){this.forEachIdentifier(b,c,a.proxy(function(a,b){for(var c=this.getParent(a);c;)this.setExpandedState(c,!0,b),c=this.getParent(c)},this)),this.render()},g.prototype.toggleNodeExpanded=function(b,c){this.forEachIdentifier(b,c,a.proxy(function(a,b){this.toggleExpandedState(a,b)},this)),this.render()},g.prototype.checkAll=function(b){var c=this.findNodes("false","g","state.checked");this.forEachIdentifier(c,b,a.proxy(function(a,b){this.setCheckedState(a,!0,b)},this)),this.render()},g.prototype.checkNode=function(b,c){this.forEachIdentifier(b,c,a.proxy(function(a,b){this.setCheckedState(a,!0,b)},this)),this.render()},g.prototype.uncheckAll=function(b){var c=this.findNodes("true","g","state.checked");this.forEachIdentifier(c,b,a.proxy(function(a,b){this.setCheckedState(a,!1,b)},this)),this.render()},g.prototype.uncheckNode=function(b,c){this.forEachIdentifier(b,c,a.proxy(function(a,b){this.setCheckedState(a,!1,b)},this)),this.render()},g.prototype.toggleNodeChecked=function(b,c){this.forEachIdentifier(b,c,a.proxy(function(a,b){this.toggleCheckedState(a,b)},this)),this.render()},g.prototype.disableAll=function(b){var c=this.findNodes("false","g","state.disabled");this.forEachIdentifier(c,b,a.proxy(function(a,b){this.setDisabledState(a,!0,b)},this)),this.render()},g.prototype.disableNode=function(b,c){this.forEachIdentifier(b,c,a.proxy(function(a,b){this.setDisabledState(a,!0,b)},this)),this.render()},g.prototype.enableAll=function(b){var c=this.findNodes("true","g","state.disabled");this.forEachIdentifier(c,b,a.proxy(function(a,b){this.setDisabledState(a,!1,b)},this)),this.render()},g.prototype.enableNode=function(b,c){this.forEachIdentifier(b,c,a.proxy(function(a,b){this.setDisabledState(a,!1,b)},this)),this.render()},g.prototype.toggleNodeDisabled=function(b,c){this.forEachIdentifier(b,c,a.proxy(function(a,b){this.setDisabledState(a,!a.state.disabled,b)},this)),this.render()},g.prototype.forEachIdentifier=function(b,c,d){c=a.extend({},f.options,c),b instanceof Array||(b=[b]),a.each(b,a.proxy(function(a,b){d(this.identifyNode(b),c)},this))},g.prototype.identifyNode=function(a){return"number"==typeof a?this.nodes[a]:a},g.prototype.search=function(b,c){c=a.extend({},f.searchOptions,c),this.clearSearch({render:!1});var d=[];if(b&&b.length>0){c.exactMatch&&(b="^"+b+"$");var e="g";c.ignoreCase&&(e+="i"),d=this.findNodes(b,e),a.each(d,function(a,b){b.searchResult=!0})}return c.revealResults?this.revealNode(d):this.render(),this.$element.trigger("searchComplete",a.extend(!0,{},d)),d},g.prototype.clearSearch=function(b){b=a.extend({},{render:!0},b);var c=a.each(this.findNodes("true","g","searchResult"),function(a,b){b.searchResult=!1});b.render&&this.render(),this.$element.trigger("searchCleared",a.extend(!0,{},c))},g.prototype.findNodes=function(b,c,d){c=c||"g",d=d||"text";var e=this;return a.grep(this.nodes,function(a){var f=e.getNodeValue(a,d);return"string"==typeof f?f.match(new RegExp(b,c)):void 0})},g.prototype.getNodeValue=function(a,b){var c=b.indexOf(".");if(c>0){var e=a[b.substring(0,c)],f=b.substring(c+1,b.length);return this.getNodeValue(e,f)}return a.hasOwnProperty(b)?a[b].toString():d};var h=function(a){b.console&&b.console.error(a)};a.fn[e]=function(b,c){var d;return this.each(function(){var f=a.data(this,e);"string"==typeof b?f?a.isFunction(f[b])&&"_"!==b.charAt(0)?(c instanceof Array||(c=[c]),d=f[b].apply(f,c)):h("No such method : "+b):h("Not initialized, can not call method : "+b):"boolean"==typeof b?d=f:a.data(this,e,new g(this,a.extend(!0,{},b)))}),d||this}}(jQuery,window,document);
	/* WEBPACK VAR INJECTION */}.call(exports, __webpack_require__(2)))

/***/ }
/******/ ])
});
;
//# sourceMappingURL=dressdiscover.js.map