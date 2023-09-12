"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.AccessPrivateFunctions = exports.AccessProtectedFunctions = exports.AccessPublicFunctions = void 0;
var AccessPublicFunctions = /** @class */ (function () {
    function AccessPublicFunctions() {
    }
    AccessPublicFunctions.prototype.display = function () {
        console.log("\n    This is a public display method\n    ");
    };
    return AccessPublicFunctions;
}());
exports.AccessPublicFunctions = AccessPublicFunctions;
var AccessProtectedFunctions = /** @class */ (function () {
    function AccessProtectedFunctions() {
    }
    AccessProtectedFunctions.prototype.displays = function () {
        console.log("\n        This is a protected display method\n        ");
    };
    return AccessProtectedFunctions;
}());
exports.AccessProtectedFunctions = AccessProtectedFunctions;
var AccessPrivateFunctions = /** @class */ (function () {
    function AccessPrivateFunctions() {
    }
    AccessPrivateFunctions.prototype.displaying = function () {
        console.log("\n        This is a private display method\n        ");
    };
    return AccessPrivateFunctions;
}());
exports.AccessPrivateFunctions = AccessPrivateFunctions;
