"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
var AccessFunction_1 = require("./AccessFunctions/AccessFunction");
var publicObj = new AccessFunction_1.AccessPublicFunctions();
publicObj.display();
var AccessingProtectedFunction = /** @class */ (function (_super) {
    __extends(AccessingProtectedFunction, _super);
    function AccessingProtectedFunction() {
        var _this = _super.call(this) || this;
        _this.displays();
        return _this;
    }
    return AccessingProtectedFunction;
}(AccessFunction_1.AccessProtectedFunctions));
var instance = new AccessingProtectedFunction();
